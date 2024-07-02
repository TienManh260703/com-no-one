package com.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Table(name = "bills_serial_numbers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BillSerialNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phieu_giao_hang_id", referencedColumnName = "id")
    DeliveryReceipt phieuGiaoHang;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "phieu_giam_gia_id", referencedColumnName = "id")
//    Voucher phieuGiamGia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "khach_hang_id", referencedColumnName = "id")
    Customer khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nhan_vien_id", referencedColumnName = "id")
    Employee nhanVien;

    // serial_number

    @Column(name = "gia_ban")
    BigDecimal giaBan;

}
