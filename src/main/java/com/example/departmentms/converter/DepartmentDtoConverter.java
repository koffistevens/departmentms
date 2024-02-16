package com.example.departmentms.converter;

import com.example.departmentms.model.dto.DepartmentDto;
import com.example.departmentms.model.entity.Department;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDtoConverter implements GenericConverter<Department, DepartmentDto>{
    @Override
    public DepartmentDto convertItemToItemDto(Department department) {
        DepartmentDto departmentDto = new DepartmentDto();
        BeanUtils.copyProperties(department, departmentDto);
        return departmentDto;
    }

    @Override
    public Department convertItemDtoToItem(DepartmentDto departmentDto) {
        Department department = new Department();
        BeanUtils.copyProperties(departmentDto, department);
        return department;
    }
}
