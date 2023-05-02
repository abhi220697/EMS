package com.demo.EMS.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig   {
	
	
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	
	@Bean
	public UserDetailsService userDetailservice() {
		
		UserDetails normalUser = User.withUsername("abhi") 
								.password("abhishek")
								.roles("NORMAL")
								.build();
		
		UserDetails adminUser = User.withUsername("admin")
								.password("admin")
								.roles("ADMIN")
								.build();
		
		InMemoryUserDetailsManager imudm =   new InMemoryUserDetailsManager(normalUser, adminUser);
		
		return imudm;
			
										
	}
	
	  

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		
		try {
			httpSecurity.csrf().disable()
				.authorizeHttpRequests()
//				.requestMatchers("/ems/*")
//				.hasRole("ADMIN")
				
//				.requestMatchers("*/app/v1/department")
//				.hasRole("NORMAL")
//				.requestMatchers("*/ems/*")
//				.hasRole("ADMIN")
				.requestMatchers("*/*")
				.permitAll();
//				.anyRequest()
//				.authenticated();
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return httpSecurity.build();
		
	}
	
}
