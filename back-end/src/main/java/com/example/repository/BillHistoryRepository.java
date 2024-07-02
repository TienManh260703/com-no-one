package com.example.repository;

import com.example.entity.BillHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillHistoryRepository extends JpaRepository<BillHistory, Long> {

    Page<BillHistory> findAllByHoaDonId(Long id, Pageable pageable);
}
