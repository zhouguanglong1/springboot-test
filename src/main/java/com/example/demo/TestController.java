package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhougl
 * 2019/3/18
 **/
@RestController
public class TestController {
    @GetMapping(value = "/test")
    public Map<String,Object> todayInvokingStat() throws Exception{
        Map<String,Object> result = new HashMap<>();
        result.put("name","hello,I'm master-v1!");
        return result;
    }
}
