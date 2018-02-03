package com.dfmzone.springdemo.dao;

import com.dfmzone.springdemo.domain.Organization;

import javax.sql.DataSource;
import java.util.List;

public interface OrganizationDAO {


    void setDataSource(DataSource dataSource);

    boolean create(Organization organization);

    Organization getOrganization(Integer id);

    List<Organization> getAllOrganizations();

    boolean delete(Organization organization);

    boolean update(Organization organization);

    void cleanUp();
}
