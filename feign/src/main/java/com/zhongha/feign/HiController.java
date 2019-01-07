package com.zhongha.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: YangXu
 * @create: 2019-01-04 17:14
 **/
@RestController
public class HiController {
    @Autowired
    HiService hiService;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        System.out.println("=========="+ "feign");
        return hiService.sayHiFromClientOne( name );
    }
}
