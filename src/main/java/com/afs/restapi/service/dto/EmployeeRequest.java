package com.afs.restapi.service.dto;

import com.afs.restapi.entity.Employee;

public class EmployeeRequest {
    private String name;
    private Integer age;
    private String gender;
    private Integer salary;
    private Long companyId;

    public EmployeeRequest(String name, Integer age, String gender, Integer salary, Long companyId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.companyId = companyId;
    }
    //TODO Constructor not needed
    public EmployeeRequest(Employee employee) {
        this.name = employee.getName();
        this.age = employee.getAge();
        this.gender = employee.getGender();
        this.salary = employee.getSalary();
        this.companyId = employee.getCompanyId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
