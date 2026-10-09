package customer_service.controller;

import customer_service.entity.Customer;
import customer_service.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> getCustomer(
            @PathVariable String customerId) {

        return customerService.getCustomerById(customerId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{customerId}/balance")
    public ResponseEntity<Customer> updateBalance(
            @PathVariable String customerId,
            @RequestBody Customer customer) {

        return ResponseEntity.ok(
                customerService.updateBalance(customerId, customer)
        );
    }
}