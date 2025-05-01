package edu.demo.controller;

import edu.demo.entity.Customer;
import edu.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/customers")
@RestController
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/post")
    public ResponseEntity<?> postCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.postCustomer(customer));
    }
}
