package com.explore.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 2018/12/9.
 */

@Controller
@RequestMapping("/test")
public class TestHello {
    
    
    @RequestMapping(value = "/hello")
    @ResponseBody
    public Map<String, Object> sayHello () {
        Map<String, Object> resMap = new HashMap<String, Object>();
        System.out.println("1111");
        resMap.put("result","hello word !!!");
        return resMap;
    }
}
