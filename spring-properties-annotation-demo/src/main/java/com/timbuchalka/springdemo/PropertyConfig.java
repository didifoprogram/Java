package com.timbuchalka.springdemo;

import com.timbuchalka.springdemo.domain.Organization;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.timbuchalka.springdemo")
@PropertySource(value = {"classpath:properties/organization.properties"})
public class PropertyConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Organization createInstance() {
        System.out.println("Factory method called");
        return new Organization();
    }

}
