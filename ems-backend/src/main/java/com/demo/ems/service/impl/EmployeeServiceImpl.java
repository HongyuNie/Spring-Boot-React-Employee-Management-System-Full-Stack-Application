package com.demo.ems.service.impl;

import com.demo.ems.dto.EmployeeDto;
import com.demo.ems.entity.Employee;
import com.demo.ems.mapper.EmployeeMapper;
import com.demo.ems.repository.EmployeeRepository;
import com.demo.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
