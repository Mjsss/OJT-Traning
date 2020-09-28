package com.mall.study.controller.index;

import com.mall.study.domain.entity.Employee;
import com.mall.study.service.EmployeeSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{brand}/{region}/index")
@Validated
@Slf4j
public class IndexController {

    @Autowired
    private EmployeeSearchService employeeSearchService;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    List<Employee> getPayment(@PathVariable("brand") final String brand,
                              @PathVariable("region") final String region) {

        return employeeSearchService.getAll();

    }

}
