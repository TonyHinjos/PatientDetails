package com.tony.dao;

import com.tony.models.Patient;

import java.util.List;

/**
 * Created by tony on 07/05/15.
 */
public interface PatientDao {

    public int insertRow(Patient patient);

    public Patient getPatientById(int id);

    public List<Patient> getList();

    public int updateRow(Patient patient);

    public int deleteRow(int id);
}
