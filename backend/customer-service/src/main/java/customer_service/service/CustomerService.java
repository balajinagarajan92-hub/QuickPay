package customer_service.service;

import customer_service.entity.Customer;
import customer_service.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> getCustomerById(String customerId) {
        return customerRepository.findById(customerId);
    }

    public Customer updateBalance(String customerId, Customer customer) {
        customer.setCustomerId(customerId);
        return customerRepository.save(customer);
    }
}