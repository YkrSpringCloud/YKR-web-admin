package com.YKR.web.admin.service.hystrix;

import com.YKR.web.admin.api.Api;
import com.YKR.web.admin.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * Author:ykr
 * Date:2020/1/7
 * Description:
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public Api login(String username, String plantPassword) {
        Api api=new Api();
        api.setCode(502);
        api.setMessage("从上游服务器接收到无效的响应");
        return api;
    }
}
