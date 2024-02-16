package com.example.departmentms.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentWithEmployeesListResponseDto {
    public Long id;
    public String name;
    public List<EmployeeDto> employeesList;
}
