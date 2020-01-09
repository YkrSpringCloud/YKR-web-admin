package com.YKR.web.admin.service;

import com.YKR.web.admin.api.Api;
import com.YKR.web.admin.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author:ykr
 * Date:2020/1/7
 * Description:
 */
@FeignClient(value = "YKR-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {
    //service接口层的写法和服务提供者的controller层写法一致，只是没有方法体并且参数要加上@RequestParam注解。以确定可以与服务提供者的参数保持一致
    @RequestMapping(value = "login",method = RequestMethod.GET)   //这里的login指的是服务提供者中的login方法
    public Api login(@RequestParam(value = "username") String username, @RequestParam(value = "plantPassword") String plantPassword);
}
