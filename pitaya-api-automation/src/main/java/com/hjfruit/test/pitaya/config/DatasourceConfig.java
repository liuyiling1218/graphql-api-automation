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
    @ConfigurationProperties("spring.datasource.fc-user")
    DataSource fcUserDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.fc-customer")
    DataSource fcCustomerDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.fc-supplier")
    DataSource fcSupplierDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.fc-warehouse")
    DataSource fcWarehouseDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.commodity")
    DataSource commodityDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.wms")
    DataSource wmsDatasource() {
        return DataSourceBuilder.create().build();
    }

}
