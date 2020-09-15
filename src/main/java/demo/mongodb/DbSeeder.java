package demo.mongodb;

import demo.mongodb.models.Address;
import demo.mongodb.models.Customer;
import demo.mongodb.models.Order;
import demo.mongodb.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@AllArgsConstructor
public class DbSeeder implements CommandLineRunner {

    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        Customer ivan = new Customer(
                "Ivan",
                "Ivanov",
                30,
                Arrays.asList(new Address("Bulgaria", "Sofiq", "Ivan Shishman 6")),
                Arrays.asList(new Order(1, "Laptop", 1))
        );

        Customer dragan = new Customer(
                "Dragan",
                "Draganov",
                30,
                Arrays.asList(new Address("Bulgaria", "Varna", "Dragan Tsankov 6")),
                Arrays.asList(new Order(2, "Mouse", 3))
        );

        Customer petranka = new Customer(
                "Petranka",
                "Petrova",
                30,
                Arrays.asList(new Address("Bulgaria", "Rouse", "Petar Geshev 6")),
                Arrays.asList(new Order(3, "Keyboard", 2))
        );

        customerRepository.deleteAll();

        customerRepository.saveAll(Arrays.asList(ivan, dragan, petranka));
    }
}
