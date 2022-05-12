package com.yrg.controller;

import com.yrg.model.Dept;
import com.yrg.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DeptController {

    @Resource
    private DeptService deptService;

    @RequestMapping("/dept/query")
    @ResponseBody
    public String queryDept(Integer deptno){
        Dept dept = deptService.queryDept(deptno);
        return dept.toString();
    }
}
