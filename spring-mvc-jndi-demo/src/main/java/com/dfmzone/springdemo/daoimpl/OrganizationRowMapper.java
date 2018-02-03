package com.dfmzone.springdemo.daoimpl;

import com.dfmzone.springdemo.domain.Organization;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizationRowMapper implements RowMapper<Organization> {

    @Override
    public Organization mapRow(ResultSet resultSet, int i) throws SQLException {
        Organization organization = new Organization();
        organization.setId(resultSet.getInt("id"));
        organization.setCompanyName(resultSet.getString("company_name"));
        organization.setEmployeeCount(resultSet.getInt("employee_count"));
        organization.setYearOfIncorporation(resultSet.getInt("year_of_incorporation"));
        organization.setSlogan(resultSet.getString("slogan"));

        return organization;
    }
}
