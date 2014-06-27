package com.comverse.timesheet.web.controller;

import javax.servlet.http.HttpServletRequest;

import net.sf.cglib.beans.BeanMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/weixin.do") 
public class WeiXinController {
	@RequestMapping 
    public String viewUser(HttpServletRequest request, ModelMap modelMap) 
            throws Exception { 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ ready to weixin   +++++++++++++");
        System.out.println(BeanMap.create(modelMap).toString());
        return "weixin"; 
    } 
}
