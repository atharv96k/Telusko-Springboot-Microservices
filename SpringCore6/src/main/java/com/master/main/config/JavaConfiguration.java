package com.master.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.master.main.Master;
import com.master.service.Java;
import com.master.service.SpringBoot;



@Configuration
public class JavaConfiguration {

    @Bean
    public Java java() {
        return new Java();
    }

    @Bean
    public SpringBoot sb() {
        return new SpringBoot();
    }

    @Bean
    public Master master() {
        Master m = new Master();
        m.setCourse(java());   // property injection
        return m;
    }
}
