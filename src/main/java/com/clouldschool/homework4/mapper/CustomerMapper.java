package com.clouldschool.homework4.mapper;

import com.clouldschool.homework4.Model.Customer;
import com.clouldschool.homework4.dto.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customer customer);
}
