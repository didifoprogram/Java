package com.diego.springdemo.daoimpl;

import com.diego.springdemo.NamedJdbcTemplateApp1;
import com.diego.springdemo.dao.OrganizationDao;
import com.diego.springdemo.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class OrganizationDaoImpl implements OrganizationDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource ds) {
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(ds);
    }

    public boolean create(Organization organization) {
        SqlParameterSource beanParams = new BeanPropertySqlParameterSource(organization);
        String query = "INSERT INTO organization (company_name, year_of_encorporation, postal_code, employee_count, slogan) " +
                "VALUES(:companyName, :yearOfIncorporation, :postalCode, :employeeCount, :slogan)";

        return namedParameterJdbcTemplate.update(query, beanParams) == 1;
//        Object[] args = new Object[] {organization.getCompanyName(), organization.getYearOfIncorporation(), organization.getPostalCode(),
//                            organization.getEmployeeCount(), organization.getSlogan()};
//
//        return jdbcTemplate.update(query, args) == 1;
    }


    public Organization getOrganization(Integer id) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource("id",id);

        String query = "SELECT * FROM organization WHERE id= :id";
//        return jdbcTemplate.queryForObject(query, new Object[] {id}, new OrganizationRowMapper());
        return namedParameterJdbcTemplate.queryForObject(query, sqlParameterSource, new OrganizationRowMapper());
    }


    public List<Organization> getAllOrganizations() {
        String query = "SELECT * FROM organization";
        return namedParameterJdbcTemplate.query(query, new OrganizationRowMapper());
    }

    public boolean delete(Organization organization) {
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(organization);
        String query = "DELETE FROM organization WHERE company_name = :companyName";
        return namedParameterJdbcTemplate.update(query, sqlParameterSource) == 1;
    }

    public boolean update(Organization organization) {
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(organization);
        String query = "UPDATE organization SET slogan = :slogan WHERE id = :id";
        return namedParameterJdbcTemplate.update(query, sqlParameterSource) == 1;
    }

    public void cleanUp() {
        String query = "TRUNCATE TABLE organization";
        namedParameterJdbcTemplate.getJdbcOperations().execute(query);
    }
}
