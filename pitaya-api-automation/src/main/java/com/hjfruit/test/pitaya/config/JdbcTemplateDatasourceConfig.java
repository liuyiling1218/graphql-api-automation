package com.hjfruit.test.pitaya.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateDatasourceConfig {
    @Primary
    @Bean()
    public JdbcTemplate pitaya(@Qualifier("pitayaDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean()
    public JdbcTemplate fcUser(@Qualifier("fcUserDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean()
    public JdbcTemplate fcCustomer(@Qualifier("fcCustomerDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean()
    public JdbcTemplate fcSupplier(@Qualifier("fcSupplierDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean()
    public JdbcTemplate fcWarehouse(@Qualifier("fcWarehouseDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean()
    public JdbcTemplate commodity(@Qualifier("commodityDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
