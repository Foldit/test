package com.yrg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    /**
     *
     * @PathVariable(路径变量) 获取url中的数据
     * 放在控制器方法的形参前面
     * @return
     */
    @GetMapping("/student/{sId}")
    public String query(@PathVariable("sId") Integer stuId){
        return "stuId " + stuId;
    }
}
