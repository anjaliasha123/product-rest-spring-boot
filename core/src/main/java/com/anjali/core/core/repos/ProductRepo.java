package com.anjali.core.core.repos;

import com.anjali.core.core.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
