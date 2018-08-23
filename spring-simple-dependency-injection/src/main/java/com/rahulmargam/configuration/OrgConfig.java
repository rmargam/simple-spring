package com.rahulmargam.configuration;

import com.rahulmargam.Organization;
import com.rahulmargam.springdemo.service.BusinessService;
import com.rahulmargam.springdemo.serviceImpl.CloudServiceImpl;
import com.rahulmargam.springdemo.serviceImpl.EcommerceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrgConfig {

    @Bean
    public CloudServiceImpl cloudService() {
        CloudServiceImpl cloudService = new CloudServiceImpl();
        return cloudService;
    }

    @Bean
    public EcommerceServiceImpl ecommerceService() {
        EcommerceServiceImpl ecommerceService = new EcommerceServiceImpl();
        return ecommerceService;
    }

    @Bean
    @Autowired
    public Organization organization (BusinessService cloudService) {
        Organization org = new Organization("Amazon","1929");
        org.setPostalCode("55423");
        org.setEmployeeCount(10000);
        org.setSlogan("work hard, have fun, make history");
        org.setBusinessService(cloudService);
        return org;
    }

}
