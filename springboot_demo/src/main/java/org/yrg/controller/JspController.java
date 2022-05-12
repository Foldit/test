package org.yrg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

//    public String JspCo(HttpServletRequest request){
//
//        request.setAttribute("data", "springboot");
//        // 视图逻辑名称
//        return "index";
//    }
    @RequestMapping("/myjsp")
    public String JspCo(Model model){
        // 把数据放到request作用域
        model.addAttribute("data", "springboot");
        // 视图逻辑名称
        return "index";
    }
}
