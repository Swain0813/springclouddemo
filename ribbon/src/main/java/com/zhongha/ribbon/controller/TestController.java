package com.zhongha.ribbon.controller;

import com.zhongha.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: YangXu
 * @create: 2019-01-04 14:03
 **/
@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        System.out.println("=========="+ "ribbon");
        return testService.hiService( name );
    }
}
