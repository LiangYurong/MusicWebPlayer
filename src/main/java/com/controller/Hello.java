package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 这个类和开发音乐项目无关。只是单纯测试其他的东西。
 */

@Controller
public class Hello {

    @GetMapping("/emp")
    @ResponseBody
    public Map<String,Object> getEmp(){
        //fir
        Map<String,Object> emp=new HashMap<>();
        emp.put("name","张三");
        emp.put("age",123);
        emp.put("address","北京路");
        return emp;
    }

}
