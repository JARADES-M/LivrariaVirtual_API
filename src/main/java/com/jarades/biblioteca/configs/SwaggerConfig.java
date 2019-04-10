package com.jarades.biblioteca.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    ApiInfo apiInfo = new ApiInfo(
            "API Para Uma Biblioteca",
            "Atividade 02 ASD 11 Puc Minas",
            "1.0.0",
            "Apache License Version 2.0",
            "Jarades Monteiro",
            "Apache License Version 2.0",
            "http://www.apache.org/licence.html"
    );

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jarades.biblioteca"))
                .paths(PathSelectors.ant("/v1/*"))
                .build();
    }

}
