package com.Sudhamsh.Stack_Market;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        // Fetch all customers
        List<Customer> customers = customerService.getAllCustomers();

        // Print to console
        customers.forEach(System.out::println);

        // Return the list as a response
        return customers;
    }
}
