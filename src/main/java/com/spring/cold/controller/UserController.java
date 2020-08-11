package com.spring.cold.controller;

import com.spring.cold.common.ApiReturn;
import com.spring.cold.pojo.DpUser;
import com.spring.cold.service.DpUserService;
import com.spring.cold.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController extends BaseController{
    @Autowired
    private DpUserService dpUserService;

    @RequestMapping("/register")
    @ResponseBody
    public ApiReturn register(DpUser dpUser){
        if (dpUserService.selectByAccount(dpUser.getAccount())!=null)
            return ApiReturn.error("账号已存在！");
        dpUser.setId(IdUtils.uuid());
        return dpUserService.insert(dpUser)>0? ApiReturn.success("注册成功！"):ApiReturn.error("注册失败！");
    }


    @RequestMapping("/index")
    public String login(DpUser dpUser){
        return "index";
    }


    @RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String printAdmin() {
        return "如果你看见这句话，说明你有ROLE_ADMIN角色";
    }

    @RequestMapping("/user")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_USER')")
    public String printUser() {
        return "如果你看见这句话，说明你有ROLE_USER角色";
    }

}
