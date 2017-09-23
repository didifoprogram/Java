package com.diego.springdemo.daoimpl;

import com.diego.springdemo.dao.OrganizationDao;
import com.diego.springdemo.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("orgDao")
public class OrganizationDaoImpl implements OrganizationDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }

    public boolean create(Organization organization) {
        String query = "INSERT INTO organization (company_name, year_of_encorporation, postal_code, employee_count, slogan) " +
                "VALUES(?, ?, ?, ?, ?)";
        Object[] args = new Object[] {organization.getCompanyName(), organization.getYearOfIncorporation(), organization.getPostalCode(),
                            organization.getEmployeeCount(), organization.getSlogan()};

        return jdbcTemplate.update(query, args) == 1;
    }


    public Organization getOrganization(Integer id) {
        String query = "SELECT * FROM organization WHERE id= ?";
        return jdbcTemplate.queryForObject(query, new Object[] {id}, new OrganizationRowMapper());
    }

    public List<Organization> getAllOrganizations() {
        String query = "SELECT * FROM organization";
        return jdbcTemplate.query(query, new OrganizationRowMapper());
    }

    public boolean delete(Organization organization) {
        String query = "DELETE FROM organization WHERE company_name = ?";
        return jdbcTemplate.update(query, organization.getCompanyName()) == 1;
    }

    public boolean update(Organization organization) {
        return false;
    }

    public void cleanUp() {
        String query = "TRUNCATE TABLE organization";
        jdbcTemplate.execute(query);
    }
}
