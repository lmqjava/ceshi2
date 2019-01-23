package com.car.service;

import com.car.mapper.UserdetilsMapper;
import com.car.pojo.SelectAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectAllImpl implements ISelectAll {

    @Autowired
    private UserdetilsMapper udm;



    @Override
    public List<SelectAll> selectall() {
        return udm.selectByExample();
    }
}
