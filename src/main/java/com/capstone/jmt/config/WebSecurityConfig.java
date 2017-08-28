package com.capstone.jmt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	    http
	     .httpBasic().and()
				.csrf().disable()
        .authorizeRequests()
        	 .antMatchers("/static/**","/webjars/**").permitAll()
        	 .antMatchers("/","/user/**","/users/**").authenticated()
        .and()
        	.formLogin()
            .loginPage("/login")
            .defaultSuccessUrl("/")
            .permitAll()
        .and()
            .logout()
            .logoutUrl("/logout")
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .deleteCookies("JSESSIONID","XSRF-TOKEN")
            .permitAll();
	}
}