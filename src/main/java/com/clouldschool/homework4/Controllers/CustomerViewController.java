package com.clouldschool.homework4.Controllers;

import com.clouldschool.homework4.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class CustomerViewController {

    private final CustomerService customerService;

    @GetMapping("customers")
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    @GetMapping("customers/{id}")
    public String getCustomerById(Model model, @PathVariable Integer id) {
        model.addAttribute("customerById", customerService.getCustomerById(id));
        return "customers";
    }

    @GetMapping("customers/filter/{filterTable}/{filter}")
    public String getCustomersFiltered(Model model, @PathVariable String filter, @PathVariable String filterTable) {
        model.addAttribute("customerFiltered", customerService.getCustomersFiltered(filter, filterTable));
        return "customers";
    }
}
