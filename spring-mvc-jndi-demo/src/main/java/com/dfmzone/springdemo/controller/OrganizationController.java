package com.dfmzone.springdemo.controller;

import com.dfmzone.springdemo.domain.Organization;
import com.dfmzone.springdemo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @RequestMapping
    public String listOrganizationUsingSQLTag() {
        return "listOrganization1";
    }

    @RequestMapping("/service")
    public String listOrganizationUsingService(Model model) {
        List<Organization> orgs = organizationService.getOrgList();

        model.addAttribute("orgList", orgs);

        return "listOrganization2";
    }
}
