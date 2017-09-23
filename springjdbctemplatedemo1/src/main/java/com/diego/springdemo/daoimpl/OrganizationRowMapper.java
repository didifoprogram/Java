package com.diego.springdemo.daoimpl;

import com.diego.springdemo.domain.Organization;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizationRowMapper implements RowMapper<Organization> {

    @Override
    public Organization mapRow(ResultSet resultSet, int i) throws SQLException {
        Organization org = new Organization();
        org.setId(resultSet.getInt("id"));
        org.setCompanyName(resultSet.getString("company_name"));
        org.setYearOfIncorporation(resultSet.getInt("year_of_encorporation"));
        org.setEmployeeCount(resultSet.getInt("employee_count"));
        org.setPostalCode(resultSet.getInt("postal_code"));
        org.setSlogan(resultSet.getString("slogan"));

        return org;
    }
}
