package com.example.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeliveryReceiptStatusEnum {
    CREATED("Được tạo ra"),
    PACKED("Đã đóng gói"),
    IN_TRANSIT("Đang vận chuyển"),
    OUT_FOR_DELIVERY("Đã ra ngoài giao hàng"),
    DELIVERED("Đã giao hàng");

    private String description;
    // Trang thái sau sẽ sửa lại theo API GHN
}
