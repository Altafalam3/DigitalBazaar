package com.digitalBazaar.repositories;

import com.digitalBazaar.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
