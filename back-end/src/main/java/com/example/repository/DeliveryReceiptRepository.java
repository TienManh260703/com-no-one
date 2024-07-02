package com.example.repository;

import com.example.entity.DeliveryReceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryReceiptRepository extends JpaRepository<DeliveryReceipt, Long> {
}
