package com.zhongha.feign;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: YangXu
 * @create: 2019-01-04 17:35
 **/
@Component
public class SchedualServiceHiHystric implements HiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
