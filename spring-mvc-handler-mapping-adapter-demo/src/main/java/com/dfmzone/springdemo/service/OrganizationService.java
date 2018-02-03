package com.dfmzone.springdemo.service;

import com.dfmzone.springdemo.dao.OrganizationDAO;
import com.dfmzone.springdemo.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationDAO organizationDAO;

    public List<Organization> getOrgList() {
        return organizationDAO.getAllOrganizations();
    }
}
