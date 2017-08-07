package hu.helixlab.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
@Override
public void addCorsMappings(CorsRegistry registry) {
System.out.print("dfsfsdsdfsdfsdfsdfsd");
    registry.addMapping("*")
.allowedOrigins("http://localhost:8080, http://localhost:8081")
.allowedMethods("POST, GET, PUT, OPTIONS, DELETE")
.allowedHeaders("header1", "header2", "header3")
.exposedHeaders("header1", "header2")
.allowCredentials(false).maxAge(3600);
}
}