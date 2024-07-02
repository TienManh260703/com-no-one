package com.example.config;

import com.example.entity.Customer;
import com.example.entity.Employee;
import com.example.entity.PaymentMethod;
import com.example.entity.Voucher;
import com.example.repository.CustomerRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.PaymentMethodRepository;
import com.example.repository.VoucherRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApplicationInitConfig {

    @Bean
    ApplicationRunner applicationRunner(
            VoucherRepository voucherRepository,
            PaymentMethodRepository paymentMethodRepository,
            CustomerRepository customerRepository,
            EmployeeRepository employeeRepository
    ) {
        return args -> {
////          Phiếu giảm giá 1
//            Voucher voucher = Voucher
//                    .builder()
//                    .loaiGiamGia(1)
//                    .giaTriGiamGia(BigDecimal.valueOf(700000))
//                    .build();
//            voucherRepository.save(voucher);
////          PTTT
//            PaymentMethod paymentMethod = PaymentMethod
//                    .builder()
//                    .ma("PM_1")
//                    .moTa("Mô tả nhận tiện mặt")
//                    .ten("Tiền mặt")
//                    .trangThai(true)
//                    .build();
//            paymentMethodRepository.save(paymentMethod);
////          Khách Hang
//            Customer customer = Customer.builder().build();
//            customerRepository.save(customer);
////          Nhan vien
//            Employee employee = Employee.builder().build();
//            employeeRepository.save(employee);
        };

    }
}
