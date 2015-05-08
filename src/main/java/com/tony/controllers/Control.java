package com.tony.controllers;

import com.tony.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by tony on 07/05/15.
 */
public class Control {
    @Autowired
    PatientService patientService;

    @RequestMapping("/welcome")
    public String hello(Model model){

        model.addAttribute("message","HELLO WORLD");
        return "hello";
    }

    @RequestMapping("/index")
    public ModelAndView hello1(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","WELCOME TO SPRING MVC");
        model.setViewName("hello");

        return model;
    }

    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
                               @RequestParam(value = "lname", required = false) String lname,
                               @RequestParam(value = "email", required = false) String email,
                               @RequestParam(value = "phone", required = false) String phone
    ){
        ModelAndView model = new ModelAndView();

        if (phone.length() !=10){
            model.addObject("error","phone must 10 digits");
        }else {
            Employee employee = new Employee();
            employee.setFname(fname);
            employee.setLast_name(lname);
            employee.setEmail(email);
            employee.setPhone(phone);
            employeeService.insertRow(employee);
        }

        model.setViewName("hello");
        return model;
    }

    @RequestMapping("/list")
    public void list(){

        List<Employee> employeeList =  employeeService.getList();

        for (Employee employee : employeeList){
            System.out.println(employee.getFname() + " " +employee.getLast_name() +" "+ employee.getEmail() +"" +
                    " "+ employee.getPhone());
            System.out.println("\n\n**********************************\n\n");
        }

     /*   Employee employee = new Employee();

        employee = employeeService.getEmployeeById(23);

        System.out.println(employee.getFname() + " " +employee.getLast_name() +" "+ employee.getEmail() +"" +
                " "+ employee.getPhone());*/
    }
    }


