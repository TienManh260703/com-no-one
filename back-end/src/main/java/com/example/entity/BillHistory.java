package com.example.entity;

import com.example.constant.BillHistoryStatusEnum;
import com.example.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "bills_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BillHistory extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "khach_hang_id", referencedColumnName = "id")
    Customer khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nhan_vien_id", referencedColumnName = "id")
    Employee nhanVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hoa_don_id", referencedColumnName = "id")
    Bill hoaDon;

    @Column(name = "trang_thai")
    @Enumerated(EnumType.STRING)
    BillHistoryStatusEnum trangThai;

    @Column(name = "ghi_chu_cho_khach_hang")
    String ghiChuChoKhachHang;

    @Column(name = "ghi_chu_cho_cua_hang")
    String ghiChuChoCuaHang;

}

