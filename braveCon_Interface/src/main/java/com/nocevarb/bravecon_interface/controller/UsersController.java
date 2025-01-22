package com.nocevarb.bravecon_interface.controller;


import com.nocevarb.bravecon_interface.bean.ResultVO;
import com.nocevarb.bravecon_interface.bean.UsersBean;
import com.nocevarb.bravecon_interface.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Controller 实例化对象 类似创建对象 直接放到SPringBean @ResponseBody 设置响应数据为json格式
@RequestMapping("/user") // 设置映射地址  作用于类和方法上
@CrossOrigin  //解决跨域
public class UsersController {
    @Resource
    private UserService service;
    @GetMapping("/login")
    public ResultVO login(UsersBean user, HttpServletRequest request){
        //调用service  根据用户名和用户类型查询信息
        UsersBean vo=service.queryByUserName(user);

        return ResultVO.success("登录成功",vo);
    }
}
