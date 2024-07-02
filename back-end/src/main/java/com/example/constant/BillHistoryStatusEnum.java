package com.example.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BillHistoryStatusEnum {
    CREATED("Được tạo ra"),
    PENDING("Đang chờ xử lý"),
    CONFIRMED("Đã xác nhận"),
    PAID("Đã thanh toán"),
    CANCELLED("Đã hủy"),
    SHIPPED("Đã gửi đi"),
    DELIVERED("Đã giao hàng");

    private String description;
}
