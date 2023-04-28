package com.demo.EMS.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

@EnableWebSecurity
public class AppSecurityConf extends WebSecurityConfiguration{
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
    	http.csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .headers()
                .xssProtection()
                .and()
                .addHeaderWriter(new StaticHeadersWriter("Server","None"))
                .and()
                .headers().frameOptions().disable();
        
    }
	

}
