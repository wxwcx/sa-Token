package com.example.satoken;

import cn.dev33.satoken.SaManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SatokenApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(SatokenApplication.class, args);
        System.out.println("启动成功: Sa-Token配置如下:" + SaManager.getConfig());
    }

}
