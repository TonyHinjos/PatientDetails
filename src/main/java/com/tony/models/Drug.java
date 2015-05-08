package com.tony.models;

import javax.persistence.*;

/**
 * Created by tony on 07/05/15.
 */

@Entity
@Table(name="drug")
public class Drug {
    @Id
    @GeneratedValue

    @Column(name = "drug_id")
    private String drugid;

    @Column(name = "patient_id")
    private String patientid;

    @Column(name ="drug_name")
    private String drugname;

    public String getDrugid() {
        return drugid;
    }

    public void setDrugid(String drugid) {
        this.drugid = drugid;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }


}
