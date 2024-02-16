package com.example.departmentms.service;

import com.example.departmentms.model.dto.DepartmentDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface Service<T, TDto> {

    public Optional<DepartmentDto> findById(Long id);
    public TDto save(TDto tDto);
    public T update(Long id);
    public void delete(Long id);

}
