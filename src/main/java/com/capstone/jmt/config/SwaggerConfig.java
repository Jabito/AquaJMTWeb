package com.capstone.jmt.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Jabito on 23/02/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static Logger logger = LoggerFactory.getLogger(SwaggerConfig.class);

    @Bean
    public Docket api() {
        logger.info("Docker API");
        
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}