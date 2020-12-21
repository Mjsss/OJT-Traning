package com.mall.study.controller.index;

import com.mall.study.domain.entity.Employee;
import lombok.Data;

import java.util.List;

@Data
public class NewEmployee {
    private List<Employee> employeeList;

    private String id;

}
