package com.afs.restapi.service.dto;

import com.afs.restapi.entity.Company;

public class CompanyRequest {

    private String name;

    public CompanyRequest() {
    }
    //TODO Contructor not needed
    public CompanyRequest(String name) {
        this.name = name;
    }

    public CompanyRequest(Company company) {
        this.name = company.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
