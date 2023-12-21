package com.solucion.solfinemesis.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class swaggerConfig {

    @Bean
    public OpenAPI myOpenAPI() {

        Server devServer = new Server();
        devServer.setDescription("Server URL in Development environment");

        Contact contact = new Contact();
        contact.setEmail("put your email here");
        contact.setName("put your name here");
        contact.setUrl("put your url here");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("put your title here")
                .version("put your version here")
                .contact(contact)
                .description("put your description").termsOfService("put your url here")
                .license(mitLicense);

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}
