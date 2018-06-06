package com.mmm.Controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 创建一个异常处理类MyException
 */
@ControllerAdvice
public class MyException {

    @ExceptionHandler(Exception.class)

    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest req,Exception ex){
        /**
         * 如果返回值是String或者json格式，那么必须加上@ResponseBody注解
         * return "服务器内部错误"
         */
        return "服务器内部错误";
    }


}
