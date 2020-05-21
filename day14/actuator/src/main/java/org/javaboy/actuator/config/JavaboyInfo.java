package org.javaboy.actuator.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JavaboyInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String,Object> info = new HashMap<>();
        info.put("email","1045418792@qq.com");
        builder.withDetail("author",info);
    }
}