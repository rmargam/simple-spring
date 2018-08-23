package com.rahulmargam.configuration;

import com.rahulmargam.Organization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrgConfig {

    @Bean
    public Organization organization () {
        Organization org = new Organization("Mercedez-Benz","1929");
        return org;
    }

}
