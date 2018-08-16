package com.config;

import com.component.exec;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kjy0128 on 2018-08-16.
 */
public class ApplicationConfig {
    @Bean
    public exec helloPrinter(){
        return new exec();
    }
}
