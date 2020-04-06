package com.bijays.springbootyaml.properties;

import com.bijays.springbootyaml.config.YamlPropertySourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        factory= YamlPropertySourceFactory.class,
        value = {"file:/Users/bijayshrestha/Dropbox/Workspaces/Backend/tomcat/conf/admin/test.yml",
                "file:/Users/bijayshrestha/Dropbox/Workspaces/Backend/tomcat/conf/admin/bijay.yml"})
public class Datasource {

//    @Resourcefile:/Users/bijayshrestha/Dropbox/Workspaces/Backend/tomcat/conf/admin/application-${spring.profiles.active}.yml"
//    private Environment env;
//
//    @Bean(name = "dataSource")
//    @Primary
//    public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//        dataSource.setUrl(env.getProperty( DataSourceConfigConstant.CONNECTION_URL));
//        dataSource.setUsername(env.getProperty(DataSourceConfigConstant.CONNECTION_USERNAME));
//        dataSource.setPassword(env.getProperty(DataSourceConfigConstant.CONNECTION_PASSWORD));
//        dataSource.setDriverClassName(env.getProperty(DataSourceConfigConstant.CONNECTION_DRIVER_CLASS));
//
//        return dataSource;
//    }
//
//    @Bean(name = "entityManagerFactory")
//    @Primary
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(getDataSource());
//
//        entityManagerFactoryBean.setPackagesToScan(
//                env.getRequiredProperty(
//                        DataSourceConfigConstant.ENTITY_MANAGER_PACKAGES_TO_SCAN));
//        entityManagerFactoryBean.setPersistenceUnitName("cogent-appointment-PU");
//
//        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter ();
//        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
//        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
//
//        return entityManagerFactoryBean;
//    }
//
//    private Properties getHibernateProperties() {
//        Properties properties = new Properties();
//        properties.put(DataSourceConfigConstant.HIBERNATE_DIALECT,
//                env.getRequiredProperty(DataSourceConfigConstant.HIBERNATE_DIALECT));
//        properties.put(DataSourceConfigConstant.HIBERNATE_SHOW_SQL,
//                env.getRequiredProperty(DataSourceConfigConstant.HIBERNATE_SHOW_SQL));
//        properties.setProperty(DataSourceConfigConstant.HIBERNATE_HBM2DDL_AUTO,
//                env.getRequiredProperty(DataSourceConfigConstant.HIBERNATE_HBM2DDL_AUTO));
//        return properties;
//    }
//
//    @Bean(name = "transactionManager")
//    @Primary
//    public JpaTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//
//        return transactionManager;
//    }
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
