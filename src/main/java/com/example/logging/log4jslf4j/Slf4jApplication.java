package com.example.logging.log4jslf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Slf4jApplication {

    static Logger logger = LoggerFactory.getLogger(Slf4jApplication.class);

    @GetMapping("/")
    public String index(){
        logger.info("MP-01");
        logger.info("Index accessed..");
        logger.debug("Index debug info.");
        logger.error("Index error info.");
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(Slf4jApplication.class, args);
    }

}
