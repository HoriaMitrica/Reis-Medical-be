package com.utcb.javaBackendStart.shared;


import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class OpenApiConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("project_management")
                .pathsToMatch("/**")
                .build();
    }

//    TODO :activate after creating an ADMIN
//    @Bean
//    public GroupedOpenApi adminApi() {
//        return GroupedOpenApi.builder()
//                .group("springshop-admin")
//                .pathsToMatch("/admin/**")
//                .addOpenApiMethodFilter(method -> method.isAnnotationPresent(Admin.class))
//                .build();
//    }
}

//TODO: only 1 config version instead of 2 (the above)
//@Bean
//public OpenAPI springShopOpenAPI() {
//    return new OpenAPI()
//            .info(new Info().title("SpringShop API")
//                    .description("Spring shop sample application")
//                    .version("v0.0.1")
//                    .license(new License().name("Apache 2.0").url("http://springdoc.org")))
//            .externalDocs(new ExternalDocumentation()
//                    .description("SpringShop Wiki Documentation")
//                    .url("https://springshop.wiki.github.org/docs"));
//}
