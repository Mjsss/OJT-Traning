package com.mall.study.repository;

import com.mall.study.domain.entity.Employee;

import java.util.List;


public interface EmployeeRepository {

    List<Employee> getAll();
}
