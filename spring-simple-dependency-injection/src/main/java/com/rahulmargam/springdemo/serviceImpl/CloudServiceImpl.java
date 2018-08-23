package com.rahulmargam.springdemo.serviceImpl;

import com.rahulmargam.springdemo.service.BusinessService;

import java.util.Random;

public class CloudServiceImpl implements BusinessService {

    @Override
    public String offerService(String CompanyName) {
        Random random = new Random();
        String service = "Org is " + CompanyName +
                "\n provides an outstanding cloud service platform" +
                "\n the revenue is " + random.nextInt(revenue);
        return service;
    }
}
