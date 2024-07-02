package com.example.entity;

import com.example.constant.BillStatusEnum;
import com.example.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "bills")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bill extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nhan_vien_id", referencedColumnName = "id")
    Employee nhanVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "khach_hang_id", referencedColumnName = "id")
    Customer khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phieu_giamGia_id", referencedColumnName = "id")
    Voucher phieuGiamGia;

    @ManyToMany
    @JoinTable(
            name = "bills_payment_methods",
            joinColumns = @JoinColumn(name = "bill_id"),
            inverseJoinColumns = @JoinColumn(name = "payment_method_id")
    )
    List<PaymentMethod> phuongThucThanhToan;

    String ma;

    @Column(name = "loai_hoa_don")
    private Integer loaiHoaDon;

    @Column(name = "tong_tien_ban_dau")
    private BigDecimal tongTienBanDau;

    @Column(name = "tong_tien_phai_tra")
    private BigDecimal tongTienPhaiTra;

    @Column(name = "ngay_mong_muon_nhan_hang")
    private LocalDate ngayMongMuonNhanHang;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "trang_thai")
    @Enumerated(EnumType.STRING)
    BillStatusEnum trangThai;


}
