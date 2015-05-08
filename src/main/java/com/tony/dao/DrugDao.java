package com.tony.dao;

import com.tony.models.Drug;

import java.util.List;

/**
 * Created by tony on 07/05/15.
 */
public interface DrugDao {

    public int insertRow(Drug drug);

    public Drug getDrugById(int id);

    public List<Drug> getList();

    public int updateRow(Drug drug);

    public int deleteRow(int id);
}
