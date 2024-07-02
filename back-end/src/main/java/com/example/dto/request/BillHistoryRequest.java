package com.example.dto.request;

import com.example.constant.BillHistoryStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BillHistoryRequest {

    Long id;

    @JsonProperty("id_khach_hang")
    Long idKhachHang;

    @JsonProperty("id_nhan_vien")
    Long idNhanVien;

    @JsonProperty("id_hoa_don")
    Long idHoaDon;

    @JsonProperty("ghi_chu_cho_khach_hang")
    String ghiChuChoKhachHang;

    @JsonProperty("ghi_chu_cho_cua_hang")
    String ghiChuChoCuahang;

    @JsonProperty("trang_thai")
    BillHistoryStatusEnum trangThai;
}
