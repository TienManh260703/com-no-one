package com.example.service;

import com.example.dto.request.BillHistoryRequest;
import com.example.dto.response.BillHistoryResponse;
import com.example.dto.response.ResultPaginationResponse;

import java.util.Optional;

public interface BillHistoryService {

    BillHistoryResponse create(BillHistoryRequest request);

    ResultPaginationResponse getBillHistoryByBillId(Long billId, Optional<String> page, Optional<String> size);
}
