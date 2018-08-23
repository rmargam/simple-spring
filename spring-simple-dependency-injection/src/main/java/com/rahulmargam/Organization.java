package com.rahulmargam;

import com.rahulmargam.springdemo.service.BusinessService;

public class Organization {
    private String companyName;
    private String yearOfInc;
    private String postalCode;
    private int employeeCount;
    private String slogan;
    private BusinessService businessService;

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public BusinessService getBusinessService() {
        return businessService;
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    public Organization(String companyName, String yearOfInc) {

        this.companyName = companyName;
        this.yearOfInc = yearOfInc;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfInc='" + yearOfInc + '\'' +
                '}';
    }

    public String corporateSlogan() {
        return slogan;
    }

    public String corporateService() {
        return businessService.offerService(companyName);
    }
}
