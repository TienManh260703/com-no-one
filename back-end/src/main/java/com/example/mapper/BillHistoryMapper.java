package com.example.mapper;

import com.example.dto.request.BillHistoryRequest;
import com.example.dto.response.BillHistoryResponse;
import com.example.entity.Bill;
import com.example.entity.BillHistory;
import com.example.entity.Customer;
import com.example.entity.Employee;

public class BillHistoryMapper {

    public static BillHistoryResponse toBillHistoryResponse(BillHistory billHistory) {

        return BillHistoryResponse.builder()
                .id(billHistory.getId())
                .idNhanVien(billHistory.getNhanVien().getId())
                .idKhachHang(billHistory.getKhachHang() != null ? billHistory.getKhachHang().getId() : null)
                .ghiChuChoCuahang(billHistory.getGhiChuChoCuaHang())
                .ghiChuChoKhachHang(billHistory.getGhiChuChoKhachHang())
                .trangThai(billHistory.getTrangThai().getDescription())
                .build();
    }

    public static BillHistory createBillHistory(BillHistoryRequest request) {
        Bill bill = new Bill();
        bill.setId(request.getIdHoaDon());

        Customer customer = new Customer();
        customer.setId(request.getIdKhachHang() != null ? request.getIdKhachHang() : null);

        Employee employee = new Employee();
        employee.setId(request.getIdNhanVien());

        BillHistory billHistory = new BillHistory();
        billHistory.setHoaDon(bill);
        billHistory.setKhachHang(customer);
        billHistory.setNhanVien(employee);
        billHistory.setGhiChuChoKhachHang(request.getGhiChuChoKhachHang());
        billHistory.setGhiChuChoCuaHang(request.getGhiChuChoCuahang());
        billHistory.setTrangThai(request.getTrangThai());
        return billHistory;
    }


}
