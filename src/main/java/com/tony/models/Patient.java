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
    private int id;
    @Column(name ="patient_fname")

    private String fname;

    private String lname;

    private String email;

    private String datebirth;

    public int getId(){return id;}
    public void setId(int id){this.id =id;}

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


}
