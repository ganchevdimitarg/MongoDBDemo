package demo.mongodb.web;

import demo.mongodb.models.Customer;
import demo.mongodb.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @PutMapping("/insert")
    public void insetCustomer(@RequestBody Customer customer){
        customerRepository.insert(customer);
    }

    @PostMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    public void updateCustomer(@PathVariable("id") String id){
        Customer customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
    }

}
