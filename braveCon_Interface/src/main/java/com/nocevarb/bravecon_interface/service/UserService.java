package com.nocevarb.bravecon_interface.service;

import com.nocevarb.bravecon_interface.bean.Page;
import com.nocevarb.bravecon_interface.bean.UsersBean;

public interface UserService {
    /**
     * 获取一个用户信息。
     */
    UsersBean queryByUserName(UsersBean user);



}
