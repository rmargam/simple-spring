package com.rahulmargam;

public class Organization {
    String companyName;
    String yearOfInc;

    public Organization(String companyName, String yearOfInc) {
        this.companyName = companyName;
        this.yearOfInc = yearOfInc;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfInc='" + yearOfInc + '\'' +
                '}';
    }

    public String corporateSlogan() {
        String slogan = "we build ultimate driving machines!!";
        return slogan;
    }
}
