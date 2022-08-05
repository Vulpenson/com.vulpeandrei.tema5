package com.clouldschool.homework4.Service;

import com.clouldschool.homework4.Model.Customer;
import com.clouldschool.homework4.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Customer getCustomerById(Integer id) {
        Customer aux = new Customer();
        if (customerRepository.findById(id).isPresent()) {
            aux = customerRepository.findById(id).get();
        }
        return aux;
    }

    public List<Customer> getCustomersFiltered(){
        List<Customer> aux = new ArrayList<>();
        return aux;
    }

    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer, Integer customerId) {
        Customer tmp = customerRepository.findById(customerId).get();
        tmp.setName(customer.getName());
        tmp.setEmail(customer.getEmail());
        return customerRepository.save(tmp);
    }

    public void deleteById(Integer customerId) {
        customerRepository.deleteById(customerId);
    }
}


