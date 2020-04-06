package com.bijays.springbootyaml.properties;

import com.bijays.springbootyaml.config.YamlPropertySourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        factory= YamlPropertySourceFactory.class,
        value = {"file:/Users/bijayshrestha/Dropbox/Workspaces/Backend/tomcat/conf/admin/test.yml",
                "file:/Users/bijayshrestha/Dropbox/Workspaces/Backend/tomcat/conf/admin/bijay.yml"})
public class TestYamlProperties {

}
