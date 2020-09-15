package demo.mongodb.repositories;

import demo.mongodb.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>, QuerydslPredicateExecutor<Customer> {
}
