package org.dream.chaser.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/4/20 14:08
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }
}
