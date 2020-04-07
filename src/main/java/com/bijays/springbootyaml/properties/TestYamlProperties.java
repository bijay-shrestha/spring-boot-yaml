package com.bijays.springbootyaml.properties;

import com.bijays.springbootyaml.config.YamlPropertySourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        factory= YamlPropertySourceFactory.class,
        value =
                {
                        "file:${catalina.home}/conf/admin/test.yml",
                        "file:${catalina.home}/conf/admin/bijay.yml",
                        "file:${catalina.home}/conf/admin/application-${spring.profiles.active}.yml"
                })
public class TestYamlProperties {

}
