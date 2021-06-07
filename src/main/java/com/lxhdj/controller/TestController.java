package com.lxhdj.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试
 * @author: wangguijun1
 * @create: 2021-06-07 16:49
 **/
@RestController
@RequestMapping("/")
@Slf4j
public class TestController {


    public TestController() {
        log.info("TestController instance");
        System.out.println("TestController instance");
    }

    @RequestMapping("/getName")
    public String getName(String name) {
        log.info("name = {}", name);
        System.out.println("name = " + name);
        return "Hello " + name;
    }
}
