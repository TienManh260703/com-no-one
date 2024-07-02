package com.example.service.impl;

import com.example.dto.request.BillHistoryRequest;
import com.example.dto.response.BillHistoryResponse;
import com.example.dto.response.Meta;
import com.example.dto.response.ResultPaginationResponse;
import com.example.entity.BillHistory;
import com.example.mapper.BillHistoryMapper;
import com.example.repository.BillHistoryRepository;
import com.example.service.BillHistoryService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class BillHistoryServiceImpl implements BillHistoryService {

    BillHistoryRepository billHistoryRepository;

    @Override
    public BillHistoryResponse create(BillHistoryRequest request) {
        BillHistory newBillHistory = BillHistoryMapper.createBillHistory(request);

        BillHistoryResponse billHistoryResponse = BillHistoryMapper
                .toBillHistoryResponse(billHistoryRepository.save(newBillHistory));

        log.info("Created success");
        return billHistoryResponse;
    }

    @Override
    public ResultPaginationResponse getBillHistoryByBillId(Long billId, Optional<String> page , Optional<String> size) {
        String sPage = page.isPresent() ? page.get() : "0";
        String sSize = size.isPresent() ? size.get() : "5";
        Pageable pageable = PageRequest.of(Integer.parseInt(sPage) , Integer.parseInt(sSize));
        Page<BillHistory> billHistoryPage = billHistoryRepository.findAllByHoaDonId(billId, pageable);

        // chuyển thanh response hay khong xem lại
        Page<BillHistoryResponse> billHistoryPageResponses = billHistoryPage.map(
                billHistory -> BillHistoryMapper.toBillHistoryResponse(billHistory));

        Meta meta = Meta.builder()
                .page(billHistoryPageResponses.getNumber())
                .pageSize(billHistoryPageResponses.getSize())
                .pages(billHistoryPageResponses.getTotalPages())
                .total(billHistoryPageResponses.getTotalElements())
                .build();

        ResultPaginationResponse response = ResultPaginationResponse
                .builder()
                .meta(meta)
                .result(billHistoryPageResponses.getContent())
                .build();

        return response;
    }
}
