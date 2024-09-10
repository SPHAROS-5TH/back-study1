package com.example.study.test.infrastructure;

import com.example.study.test.entity.Orders;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
