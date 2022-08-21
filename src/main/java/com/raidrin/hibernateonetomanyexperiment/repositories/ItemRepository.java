package com.raidrin.hibernateonetomanyexperiment.repositories;

import com.raidrin.hibernateonetomanyexperiment.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
