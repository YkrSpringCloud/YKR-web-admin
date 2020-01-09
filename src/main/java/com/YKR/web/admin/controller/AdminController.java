package com.YKR.web.admin.controller;

import com.YKR.web.admin.api.Api;
import com.YKR.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author:ykr
 * Date:2020/1/7
 * Description:
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login(){
        String username="kkk";
        String plantPassword="123456";
      Api api=  adminService.login(username,plantPassword);
      System.out.print("\n\n"+api+"\n\n");
        return "login";
    }
}
