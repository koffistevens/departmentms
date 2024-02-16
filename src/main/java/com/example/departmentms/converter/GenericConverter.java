package com.example.departmentms.converter;

import org.springframework.stereotype.Component;

@Component
public interface GenericConverter<T, TDto>{

    public TDto convertItemToItemDto(T t);
    public T convertItemDtoToItem(TDto tDto);
}
