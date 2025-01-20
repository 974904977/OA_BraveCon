package com.nocevarb.bravecon_interface.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dong
 * @title: 用户实体类
 * @projectName braveOA
 * @date 2024/3/2
 * @description: 用户的实体
 */
@Data  //生成getter、setter方法
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor  // 无参构造方法
public class UsersBean {
    private Integer user_id;
    private String username;
    private String password;
    private String real_name;
    private Integer department_id;
    private String position;
    private String phone;
    private String email;
}
