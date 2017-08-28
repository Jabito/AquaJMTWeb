package com.capstone.jmt;

import com.capstone.jmt.config.WebMvcConfig;
import com.capstone.jmt.config.WebSecurityConfig;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		 return application.sources(AquaJmtApplication.class, WebMvcConfig.class,  WebSecurityConfig.class);
	}

}
