package com.zq.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAController {

        @RequestMapping("/hello")
        public String hello() {
            try {
                //测试Feign调用的超时时间默认是1秒,实际是60s超时设置不起作用了
                Thread.sleep(40000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "hello world A70S";
        }

}
