package com.bahar.practice_aop.service;

import com.bahar.practice_aop.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee createEmployee(Employee employee) {
        Employee emp = new Employee();
        emp.setEmpId(employee.getEmpId());
        emp.setName(employee.getName());
        return emp;
    }
}
