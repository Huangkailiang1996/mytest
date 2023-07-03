package com.huang.mytest.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @GetMapping("/a")
    public void test() {
        log.info("11111");
        log.info("test");
        log.info("github");t
        log.info("t1");
    }
}
