package com.example.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BillStatusEnum {
    PENDING("Đang chờ xử lý"),
    CONFIRMED("Đã xác nhận"),
    SUCCESS("Đã thanh toán"),
    CANCELLED("Đã hủy đi");

    private String description;
}
