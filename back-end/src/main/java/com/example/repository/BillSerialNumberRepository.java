package com.example.repository;

import com.example.entity.BillSerialNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillSerialNumberRepository extends JpaRepository<BillSerialNumber, Long> {
}
