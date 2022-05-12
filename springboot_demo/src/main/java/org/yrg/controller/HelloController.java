package org.yrg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yrg.vo.Student;

import javax.annotation.Resource;

@Controller
public class HelloController {
    @Value("${c}")
    public String s;

    @RequestMapping("/query")
    @ResponseBody
    public String Qdata(){
        return s;
    }

    @Resource
    private Student student;

    @RequestMapping("/stu")
    @ResponseBody
    public String Stu(){
        return student.toString();
    }
}
