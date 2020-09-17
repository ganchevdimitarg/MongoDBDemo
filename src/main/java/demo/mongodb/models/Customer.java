package demo.mongodb.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "custemers")
@Setter
@Getter
public class Customer {
    private String id;
    private String first_name;
    private String last_name;
    private int age;
    private List<Address> addresses;
    private List<Order> orders;

    public Customer() {
        this.addresses = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public Customer(String first_name, String last_name, int age, List<Address> addresses, List<Order> orders) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.addresses = addresses;
        this.orders = orders;
    }
}
