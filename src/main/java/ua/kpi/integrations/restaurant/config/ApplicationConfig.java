package ua.kpi.integrations.restaurant.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "ua.kpi.integrations.restaurant.services")
@Import({RepositoryConfig.class})
public class ApplicationConfig {
}
