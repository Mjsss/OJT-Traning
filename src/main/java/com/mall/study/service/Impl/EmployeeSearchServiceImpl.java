package com.mall.study.service.Impl;

import com.mall.study.domain.entity.Employee;
import com.mall.study.repository.EmployeeRepository;
import com.mall.study.service.EmployeeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeSearchServiceImpl implements EmployeeSearchService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }
}
