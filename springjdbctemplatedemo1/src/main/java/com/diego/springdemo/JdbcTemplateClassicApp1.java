package com.diego.springdemo;

import com.diego.springdemo.dao.OrganizationDao;
import com.diego.springdemo.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JdbcTemplateClassicApp1 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

        OrganizationDao dao = (OrganizationDao) ctx.getBean("orgDao");

        DaoUtils.createSeedData(dao);

        DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);

        Organization ge = new Organization("General Electric", 1974, 6666, 5600, "Make it work");
        boolean create = dao.create(ge);
        DaoUtils.printSuccessFailure(DaoUtils.createOperation, create);

        DaoUtils.deleteData(dao, ge, DaoUtils.deleteOperation);

        DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);

        DaoUtils.printSingleOrganization(dao, 1, DaoUtils.readOperation);


        dao.cleanUp();
        DaoUtils.printOrganizationCount(dao.getAllOrganizations(), DaoUtils.cleanupOperation);


        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
