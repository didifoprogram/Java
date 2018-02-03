package com.dfmzone.springdemo.daoimpl;

import com.dfmzone.springdemo.dao.OrganizationDAO;
import com.dfmzone.springdemo.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class OrganizationDAOImpl implements OrganizationDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    @Autowired
    public void setDataSource(DataSource dataSource) {
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public boolean create(Organization organization) {
        SqlParameterSource beanParams = new BeanPropertySqlParameterSource(organization);
        String query = "INSERT INTO organization (company_name, year_of_encorporation, postal_code, employee_count, slogan) " +
                "VALUES(:companyName, :yearOfIncorporation, :postalCode, :employeeCount, :slogan)";
        return namedParameterJdbcTemplate.update(query, beanParams) == 1;
    }

    @Override
    public Organization getOrganization(Integer id) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource("id", id);

        String query = "SELECT * FROM organization WHERE id= :id";
        return namedParameterJdbcTemplate.queryForObject(query, sqlParameterSource, new OrganizationRowMapper());
    }

    @Override
    public List<Organization> getAllOrganizations() {
        String query = "SELECT * FROM organization";
        return namedParameterJdbcTemplate.query(query, new OrganizationRowMapper());
    }

    @Override
    public boolean delete(Organization organization) {
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(organization);
        String query = "DELETE FROM organization WHERE company_name= :companyName";
        return namedParameterJdbcTemplate.update(query, sqlParameterSource) == 1;
    }

    @Override
    public boolean update(Organization organization) {
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(organization);
        String query = "UPDATE organization SET slogan = :slogan WHERE id= :id";
        return namedParameterJdbcTemplate.update(query, sqlParameterSource) == 1;

    }

    @Override
    public void cleanUp() {
        String query = "TRUNCATE TABLE organization";
        namedParameterJdbcTemplate.getJdbcOperations().execute(query);
    }
}
