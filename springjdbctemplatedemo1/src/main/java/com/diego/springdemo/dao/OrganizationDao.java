package com.diego.springdemo.dao;

import com.diego.springdemo.domain.Organization;

import javax.sql.DataSource;
import java.util.List;

public interface OrganizationDao {

    public void setDataSource(DataSource ds);
    public boolean create(Organization organization);
    public Organization getOrganization(Integer id);
    public List<Organization> getAllOrganizations();
    public boolean delete(Organization organization);
    public boolean update(Organization organization);
    public void cleanUp();
}
