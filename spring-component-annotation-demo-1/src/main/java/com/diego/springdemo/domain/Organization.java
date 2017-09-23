package com.diego.springdemo.domain;

import com.diego.springdemo.service.BusinessService;

public class Organization {
    private String companyName;
    private int yearOfIncorporation;
    private String postalCode;
    private int employeeCount;
    private String slogan;
    private BusinessService businessService;

    public Organization() {
    }

    public Organization(String companyName, int yearOfIncorporation) {
        this.companyName = companyName;
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearOfIncorporation() {
        return yearOfIncorporation;
    }

    public void setYearOfIncorporation(int yearOfIncorporation) {
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String corporateService() {
        return businessService.offerService(companyName);
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", postalCode='" + postalCode + '\'' +
                ", employeeCount=" + employeeCount +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
