package com.nocevarb.bravecon_interface.mapper;

import com.nocevarb.bravecon_interface.bean.UsersBean;

public interface UsersMapper {
    UsersBean queryByUserName(UsersBean user);
}
