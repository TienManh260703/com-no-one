package com.example.entity;

import com.example.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Table(name = "vouchers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Voucher extends BaseEntity {

    @Column(name = "loai_giam_gia")
    Integer loaiGiamGia; // 1 tien : 2 %

    @Column(name = "gia_tri_dot_giam_gia")
    BigDecimal giaTriGiamGia;
}
