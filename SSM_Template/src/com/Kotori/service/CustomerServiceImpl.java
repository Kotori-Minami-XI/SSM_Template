package com.Kotori.service;

import com.Kotori.domain.Customer;
import com.Kotori.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public String addCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
        return null;
    }
}
