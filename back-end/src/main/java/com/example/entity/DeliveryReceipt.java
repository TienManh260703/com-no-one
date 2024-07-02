package com.example.entity;

import com.example.constant.DeliveryReceiptStatusEnum;
import com.example.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Table(name = "delivery_receipts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeliveryReceipt extends BaseEntity {

    String ma;

    @Column(name = "trang_thai")
    @Enumerated(EnumType.STRING)
    DeliveryReceiptStatusEnum trangThai;

    @Column(name = "ten_nguoi_nhan")
    String tenNguoiNhan;

    @Column(name = "sdt_nguoi_nhan")
    String sdtNguoiNhan;

    @Column(name = "dia_chi_nguoi_nhan")
    String diaChiNguoiNhan;

    @Column(name = "ghi_chu")
    String ghiChu;

    @Column(name = "cho_xem_hang")
    Boolean choXemHang;

    @Column(name = "tien_thu_ho")
    BigDecimal tienThuHo;
}
