package com.swsa.repository;
import com.swsa.domain.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer customer);

   List<Customer> findAll();

    Optional<Customer> findById(Long id);

    void deleteById(Long id);
}