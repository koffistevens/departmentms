package com.example.departmentms.service;

import com.example.departmentms.converter.DepartmentDtoConverter;
import com.example.departmentms.model.dto.DepartmentDto;
import com.example.departmentms.model.entity.Department;
import com.example.departmentms.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;
    private final DepartmentDtoConverter departmentDtoConverter;

    @Override
    public Optional<DepartmentDto> findById(Long id) {

        return departmentRepository.findById(id)
                .map(departmentDtoConverter::convertItemToItemDto);
    }

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        Department department = departmentDtoConverter.convertItemDtoToItem(departmentDto);
        if(Objects.nonNull(departmentDto)) {
            departmentRepository.save(department);
        }
        return departmentDtoConverter.convertItemToItemDto(department);
    }

    @Override
    public Department update(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
