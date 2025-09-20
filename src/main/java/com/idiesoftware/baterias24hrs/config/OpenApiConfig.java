package com.idiesoftware.baterias24hrs.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Loja de Baterias 24hrs")
                        .description("API RESTful para gerenciar produtos e marcas da loja de baterias.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Equipe Baterias24hrs")
                                .email("contato@baterias24hrs.com")
                        )
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")
                        )
                );
    }
}
