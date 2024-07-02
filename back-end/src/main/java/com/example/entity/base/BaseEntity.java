package com.example.entity.base;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, insertable = false)
    Long id;
    @Column(name = "created_at")
    LocalDateTime createdAt;
    @Column(name = "updated_at")
    LocalDateTime updatedAt;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "updated_by")
    String updatedBy;

    @PrePersist
    private void handleBeforeCreateAt() {
        this.createdBy = "nguyenmanh19924@gmail.com create";
//                SecurityService.getCurrentUserLogin().isPresent() == true ?
//                SecurityService.getCurrentUserLogin().get()
//                : "";
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    private void handBeforeUpdateAt() {
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = "nguyenmanh19924@gmail.com update";
//                SecurityService.getCurrentUserLogin().isPresent() == true ?
//                SecurityService.getCurrentUserLogin().get()
//                : "";
    }
}
