package com.alienlab.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Msater Zg on 2017/7/13.
 */
@Configuration
@ConditionalOnClass(JwtService.class)
@EnableConfigurationProperties(JwtServiceProperties.class)
/**
 *
 *
 */
public class JwtAutoConfiguration {
    @Autowired
    private JwtServiceProperties jwtServiceProperties;

    @Bean
    JwtService jwtService() {
        return new JwtService(jwtServiceProperties.getBase64Security(), jwtServiceProperties.getIssuer());
    }

    @Bean
    JwtUtils jwtUtils() {
        return new JwtUtils();
    }
}
