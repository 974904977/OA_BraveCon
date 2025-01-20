package com.nocevarb.bravecon_interface.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //生成getter、setter方法
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor  // 无参构造方法
public class ResultVO<T> {
    private Integer code;//响应代码
    private String msg;//响应提示信息
    private T Data;
    //    成功时候调用
    public static <T> ResultVO<T> success(String msg,T data){
        return new ResultVO<>(200, msg, data);
    }
    //    失败时候调用  data返回null
    public  static  <T> ResultVO<T> error(String msg){
        return new ResultVO<>(503,msg,null);
    }
}
