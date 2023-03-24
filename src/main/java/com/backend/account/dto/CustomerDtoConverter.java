package com.backend.account.dto;

import com.backend.account.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public AccountCustomerDto convertToAccountCustomer(Customer from) {
        if (from == null) {
            return new AccountCustomerDto("", "", "");
        }
        return new AccountCustomerDto(from.getId(), from.getName(), from.getSurname());
    }
}
