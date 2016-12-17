package ua.kpi.integrations.restaurant.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages = {"ua.kpi.integrations.restaurant.web"})
@EnableWebMvc
public class WebConfig {
}
