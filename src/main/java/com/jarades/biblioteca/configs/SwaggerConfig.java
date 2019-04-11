package com.jarades.biblioteca.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    ApiInfo apiInfo = new ApiInfo(
        "API Para Uma Biblioteca",
        "Atividade 02 ASD 11 Puc ",
        "1.0.0",
        "Terms of Service",
         new Contact("Jarades Monteiro", "https://linkedin.com/in/jarades", "jaradesm@gmail.com"),
        "Apache License Version 2.0",
        "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
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
