package com.raidrin.hibernateonetomanyexperiment.repositories;

import com.raidrin.hibernateonetomanyexperiment.entities.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
