package com.tony.services.impl;

import com.tony.dao.PatientDao;
import com.tony.models.Patient;
import com.tony.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by tony on 07/05/15.
 */
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;

    @Override
    public int insertRow(Patient patient) {
        return patientDao.insertRow(patient);
    }

    @Override
    public Patient getPatientById(int id) {
        return patientDao.getPatientById(id);
    }

    @Override
    public List<Patient> getList() {
        return patientDao.getList();
    }

    @Override
    public int updateRow(Patient patient) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
