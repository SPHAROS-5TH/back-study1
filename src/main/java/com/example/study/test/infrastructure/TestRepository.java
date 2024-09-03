package com.example.study.test.infrastructure;

import com.example.study.test.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Product, Long> {

}
