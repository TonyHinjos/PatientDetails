package com.tony.models;

import javax.persistence.*;

/**
 * Created by tony on 07/05/15.
 */

@Entity
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue

    @Column(name = "patient_id")
    private String patientid;

    @Column(name = "drug_id")
    private String drugid;

    @Column(name = "patient_fname")
    private String fname;

    @Column(name ="patient_lname")
    private String lname;

    @Column(name ="patient_email")
    private String email;


    @Column(name ="date_birth")
    private String datebirth;

    @Column(name ="creation_date")
    private String creation;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getDrugid() {
        return drugid;
    }

    public void setDrugid(String drugid) {
        this.drugid = drugid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public String getCreation() {
        return creation;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }
}
