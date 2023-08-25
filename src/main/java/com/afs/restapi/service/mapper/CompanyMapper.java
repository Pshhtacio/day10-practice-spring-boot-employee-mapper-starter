package com.afs.restapi.service.mapper;

import com.afs.restapi.entity.Company;
import com.afs.restapi.entity.Employee;
import com.afs.restapi.service.dto.CompanyRequest;
import com.afs.restapi.service.dto.CompanyResponse;
import org.springframework.beans.BeanUtils;

public class CompanyMapper {

    public CompanyMapper() {
    }

    public static Company toEntity(CompanyRequest employeeRequest) {
        Company company = new Company();
        BeanUtils.copyProperties(employeeRequest, company);
        return company;
    }

    public static CompanyResponse toResponse(Company company) {
        CompanyResponse companyResponse = new CompanyResponse();
        BeanUtils.copyProperties(company, companyResponse);
        return  companyResponse;
    }
}
