package com.Kotori.web;

import com.Kotori.domain.Customer;
import com.Kotori.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("addCustomer.action")
    public String test(Customer customer) {
        System.out.println(customer);
        customerService.addCustomer(customer);
        return "/WEB-INF/view/resultPage.jsp";
    }
}
