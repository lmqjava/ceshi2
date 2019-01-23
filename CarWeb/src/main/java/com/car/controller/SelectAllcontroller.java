package com.car.controller;

import com.car.pojo.SelectAll;
import com.car.service.ISelectAll;
import com.car.utils.LayUiUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/All")
public class SelectAllcontroller {

    @Autowired
    private ISelectAll Isa;

    @GetMapping("/select")
    public LayUiUtils getAll(@RequestParam(name = "page", defaultValue = "1") int pagenum, @RequestParam(name = "limit", defaultValue = "10") int pagesize) {
        LayUiUtils utils = new LayUiUtils();
        int count = Isa.selectall().size();
        PageHelper.startPage(pagenum, pagesize);
        List<SelectAll> list = Isa.selectall();
        PageInfo<SelectAll> info=new PageInfo(list);
        List<SelectAll> infos=info.getList();utils.setCode(0);

        utils.setCount(count);
        utils.setMsg("success!");
        utils.setData(infos);

        return utils;
    }

}
