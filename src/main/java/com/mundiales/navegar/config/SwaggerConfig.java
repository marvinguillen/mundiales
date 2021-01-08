package com.mundiales.navegar.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@Configuration

public class SwaggerConfig {
    @Bean
   /* public Docket documentation(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors
        .basePackage("com.mundiales.navegar.controller"))
        //.withClassAnnotation(RestController.class))
        .paths(PathSelectors.any())
        .build();
    }*/
    public com.google.common.base.Predicate<String> userPaths() {
        
        return or(
        regex("/springsRestController.*"),
        regex("/test.*"));
 
    }

    private ApiInfo usersApiInfo() {
        return new ApiInfoBuilder()
                .title("Service User")
                .version("1.0")
                .license("Apache License Version 2.0")
                .build();
    }
    public Docket usersApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(usersApiInfo())
                .select()
                .paths(userPaths())
                .apis(RequestHandlerSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

   
    private com.google.common.base.Predicate<String> or(Object regex, Object regex2) {
        return null;
    }

    // Here is an example where we select any api that matches one of these paths
 

  private Object regex(String string) {
      return null;
  }

  
    
    
   
    
    
}
