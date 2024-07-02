package com.example.entity;

import com.example.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "payment_methods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentMethod extends BaseEntity {

    String ma;

    @Column(name = "trang_thai")
    Boolean trangThai;

    @Column(name = "ten")
    String ten;

    @Column(name = "mo_ta")
    String moTa;

}
