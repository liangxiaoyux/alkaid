package com.kuaijie.tiankui.api.controller.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/12 2:57
 * @description
 */
@RestController
@RequestMapping("/hi")
public class HelloController {
    @GetMapping("hello")
    public String testHello() {
        System.out.println("Hello springmvc...");
        return "Fuck U";
    }
}
