package com.timbuchalka.springdemo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myorg2")
public class Organization2 {

    @Value("${nameOfCompany}")
    private String companyName;

    @Value("${startUpYear}")
    private int yearOfIncorporation;

    @Value("${postCode}")
    private String postalCode;

    @Value("${empCount:22222}")
    private int employeeCount;

    @Value("${corporateSlogan}")
    private String slogan;

    @Override
    public String toString() {
        return "Organization2{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", postalCode='" + postalCode + '\'' +
                ", employeeCount=" + employeeCount +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
