package com.diego.springdemo;

import com.diego.springdemo.dao.OrganizationDao;
import com.diego.springdemo.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class NamedJdbcTemplateApp1 {

    @Autowired
    private OrganizationDao organizationDao;

    @Autowired
    private DaoUtils daoUtils;

    public void actionMethod() {

        daoUtils.createSeedData(organizationDao);

        daoUtils.printOrganizations(organizationDao.getAllOrganizations(), daoUtils.readOperation);

        Organization ge = new Organization("General Electric", 1974, 6666, 5600, "Make it work");
        boolean create = organizationDao.create(ge);
        daoUtils.printSuccessFailure(daoUtils.createOperation, create);

        daoUtils.deleteData(organizationDao, organizationDao.getOrganization(2), daoUtils.deleteOperation);

        daoUtils.printOrganizations(organizationDao.getAllOrganizations(), daoUtils.readOperation);

        daoUtils.printSingleOrganization(organizationDao, 1, daoUtils.readOperation);

        organizationDao.cleanUp();
        daoUtils.printOrganizationCount(organizationDao.getAllOrganizations(), daoUtils.cleanupOperation);
    }
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

        NamedJdbcTemplateApp1 mainApp = ctx.getBean(NamedJdbcTemplateApp1.class);
        mainApp.actionMethod();

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
