package com.bijays.springbootyaml.properties;

import com.bijays.springbootyaml.constant.DataSourceConfigConstant;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DatasourceProperties {

    @Bean
    public DataSource getDatasource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create ();
        dataSourceBuilder.url (DataSourceConfigConstant.CONNECTION_URL);
        dataSourceBuilder.username (DataSourceConfigConstant.CONNECTION_USERNAME);
        dataSourceBuilder.password (DataSourceConfigConstant.CONNECTION_PASSWORD);
        dataSourceBuilder.driverClassName ( DataSourceConfigConstant.CONNECTION_DRIVER_CLASS );
        return dataSourceBuilder.build();

    }
}
