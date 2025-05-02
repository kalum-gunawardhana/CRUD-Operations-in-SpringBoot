package edu.demo.service;

import edu.demo.entity.Customer;
import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerByName(String name);
    Customer updateCustomer(Long id, Customer updatedCustomer);
    void deleteCustomer(Long id);
}
