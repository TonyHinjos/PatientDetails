package com.tony.services.impl;

import com.tony.dao.DrugDao;
import com.tony.models.Drug;
import com.tony.services.DrugService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by tony on 07/05/15.
 */
public class DrugServiceImpl implements DrugService {


    @Autowired
    DrugDao drugDao;

    @Override
    public int insertRow(Drug drug) {
        return drugDao.insertRow(drug);
    }

    @Override
    public Drug getDrugById(int id) {
        return drugDao.getDrugById(id);
    }
    @Override
    public List<Drug> getList() {
        return drugDao.getList();
    }

    @Override
    public int updateRow(Drug drug) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
