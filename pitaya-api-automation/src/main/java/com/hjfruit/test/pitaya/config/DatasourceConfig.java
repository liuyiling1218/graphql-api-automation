package com.hjfruit.test.pitaya.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {
    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource.pitaya")
    DataSource pitayaDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.peach")
    DataSource peachDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.fc-mdm")
    DataSource fcMdmDatasource() {
        return DataSourceBuilder.create().build();
    }
}
