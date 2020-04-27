package xyz.kangjian.selling.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangjian
 * @date 2019/6/30 22:12
 */
@Slf4j
@RestController
@RequestMapping("weixin")
public class WeixinContorller {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法...");
        log.info("code={}",code);
    }

}
