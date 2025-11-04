package com.tricol.config;

import com.tricol.service.FournisseurService;
import com.tricol.util.LoggingUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tricol")
@ImportResource("classpath:spring-config.xml")
public class AppConfig {
    
    @Bean
    public LoggingUtil loggingUtil() {
        return new LoggingUtil();
    }
    
    @Bean
    public FournisseurService fournisseurService() {
        return new FournisseurService();
    }
}
