package com.nocevarb.bravecon_interface.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {
    /**
     *分页信息类
     */
        private Integer pageNum;  //当前页
        private Integer pageSize;  //每页记录数
        private Object rows;  // 列表数据
        private long total;  //总条数
}
