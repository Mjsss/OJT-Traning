package com.mall.study.service;

import com.mall.study.domain.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeSearchService {

    List<Employee> getAll();
}
