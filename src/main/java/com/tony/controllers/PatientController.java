package com.tony.controllers;

import com.tony.models.Drug;
import com.tony.models.Patient;
import com.tony.services.DrugService;
import com.tony.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by tony on 08/05/15.
 */
public class PatientController {

    @Autowired
    PatientService patientService;

    @Autowired
    DrugService drugService;

    @RequestMapping("/index")
    public String patient_details(Model model)
    {
        model.addAttribute("message","Patient Details");
        return "details";
    }

    @RequestMapping("/drugs")
    public String patient_drugs(Model model)
    {
        model.addAttribute("message","Drugs prescribed to patient");
        return "drugs";
    }
//    @RequestMapping("/drugs")
//    public ModelAndView patient_drugs()
//    {
//
//        ModelAndView model = new ModelAndView();
//        model.addObject("msg","Drugs prescribed to patients");
//        model.setViewName("drugs");
//
//        return model;
//    }

    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "patient_fname", required = false) String fname,
                               @RequestParam(value = "patient_lname", required = false) String lname,
                               @RequestParam(value = "patient_email", required = false) String email,
                              @RequestParam(value = "date_birth", required = false) String datebirth
    )
    {
        ModelAndView model = new ModelAndView();

        Patient patient = new Patient();
        patient.setFname(fname);
        patient.setLname(lname);

        patient.setDatebirth(datebirth);
        patientService.insertRow(patient);

        model.setViewName("details");
        return model;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "patient_id", required = false) String patientid,
                            @RequestParam(value = "drug_name", required = false) String drugname
    )
    {
        ModelAndView model = new ModelAndView();

        Drug drug = new Drug();
        drug.setDrugname(drugname);
        drug.setPatientid(patientid);
        drugService.insertRow(drug);

        model.setViewName("drugs");
        return model;
    }

    @RequestMapping("/list")
    public  ModelAndView viewList()
    {
        ModelAndView model = new ModelAndView();
        List<Drug> drugList = drugService.getList();
        model.addObject("detailsList", drugList);

        model.setViewName("display");
        return model;


    }
}
