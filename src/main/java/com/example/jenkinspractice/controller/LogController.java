package com.example.jenkinspractice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final Logger log = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/error")
    public String error() {
        log.error("에러 로그");
        return "error";
    }

    @GetMapping("/info")
    public String info() {
        log.info("인포 로그");
        return "info";
    }
}
