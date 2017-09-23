package com.diego.springdemo;

import com.diego.springdemo.dao.OrganizationDao;
import com.diego.springdemo.domain.Organization;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaoUtils {

    public final String createOperation = "CREATE";
    public final String readOperation = "READ";
    public final String updateOperation = "UPDATE";
    public final String deleteOperation = "DELETE";
    public final String cleanupOperation = "TRUNCATE";

    public void printOrganizations(List<Organization> orgs, String operation) {
        System.out.println("\n********** printing organizations after " + operation + " operation *******");
        for(Organization org: orgs) {
            System.out.println(org);
        }
    }

    public void printSuccessFailure(String operation, boolean param) {
        if(param) {
            System.out.println("******* operation " + operation + " successful *******");
        } else {
            System.out.println("******* operation " + operation + " fail *******");
        }
    }

    public void createSeedData(OrganizationDao dao) {
        Organization org1 = new Organization("BMW", 1929, 1111, 10000, "BMW slogan");
        Organization org2 = new Organization("AMAZON", 1994, 2222, 7500, "Amazon slogan");
        Organization org3 = new Organization("GOOGLE", 1999, 3333, 11000, "Google slogan");

        List<Organization> list = List.of(org1, org2, org3);

        int createCount = 0;

        for(Organization org : list) {
            boolean isCreated = dao.create(org);
            if(isCreated) {
                createCount += 1;
            }
        }
        System.out.println("******* Created " + createCount + " organizations *******");
    }

    public void printSingleOrganization(OrganizationDao dao, Integer id, String operation) {
        System.out.println("\n******* printing Organization with id = "+ id + " after " + operation + " operation *******");
        System.out.println(dao.getOrganization(id));
    }

    public void deleteData(OrganizationDao dao, Organization organization, String operation) {
        System.out.println("\n******* Running " + operation + " operation on Organization " + organization.getCompanyName() + " *******");
        boolean result = dao.delete(organization);
        printSuccessFailure(operation, result);
    }

    public void printOrganizationCount(List<Organization> orgs, String operation) {
        System.out.println("\n******* Currently we have " + orgs.size() + " organizations after " + operation + " operation *******");
    }
}
