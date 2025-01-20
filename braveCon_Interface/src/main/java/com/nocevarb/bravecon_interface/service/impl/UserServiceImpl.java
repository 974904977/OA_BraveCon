package com.nocevarb.bravecon_interface.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nocevarb.bravecon_interface.bean.Page;
import com.nocevarb.bravecon_interface.bean.UsersBean;
import com.nocevarb.bravecon_interface.mapper.UsersMapper;
import com.nocevarb.bravecon_interface.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UsersMapper mapper;

    @Override
    public UsersBean queryByUserName(UsersBean user) {
        UsersBean queryUser = mapper.queryByUserName(user);
        return queryUser;
    }

}
