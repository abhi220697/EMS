package com.demo.EMS.security;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
public class AppSecurityConf extends WebSecurityConfiguration{
	
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        
//    	http.csrf()
//                .disable()
//                .authorizeRequests()
//                .antMatchers("/**").permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .headers()
//                .xssProtection()
//                .and()
//                .addHeaderWriter(new StaticHeadersWriter("Server","None"))
//                .and()
//                .headers().frameOptions().disable();
//        
//    }
	

}
