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
    private int id;

    @Column(name ="drug_name")
    private String drugname;

    private String patientid;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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
