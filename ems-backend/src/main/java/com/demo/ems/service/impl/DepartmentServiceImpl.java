package com.demo.ems.service.impl;

import com.demo.ems.dto.DepartmentDto;
import com.demo.ems.entity.Department;
import com.demo.ems.mapper.DepartmentMapper;
import com.demo.ems.repository.DepartmentRepository;
import com.demo.ems.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;


    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }
}
