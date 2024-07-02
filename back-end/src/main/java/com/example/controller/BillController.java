package com.example.controller;

import com.example.dto.response.ApiResponse;
import com.example.dto.response.ResultPaginationResponse;
import com.example.service.BillHistoryService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("${api.prefix}/bills")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BillController {

    final BillHistoryService billHistoryService;



    // mai làm xem lại có nên chuyển qua filter
    @GetMapping("/bill-history/{billId}")
    public ResponseEntity<ApiResponse> getBillHistoryByBillId(
            @PathVariable Long billId,
            @RequestParam(name = "page", defaultValue = "0") Optional<String> page,
            @RequestParam(name = "size", defaultValue = "5") Optional<String> size
    ) {
        ResultPaginationResponse response = billHistoryService.getBillHistoryByBillId(billId, page, size);
        ApiResponse<Object> apiResponse = ApiResponse
                .builder()
                .statusCode(HttpStatus.OK.value())
                .message("Call api success")
                .data(response)
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
    }
}
