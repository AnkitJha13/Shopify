package com.athena.Athena_Ecommerce.service.interf;

import com.athena.Athena_Ecommerce.dto.OrderRequest;
import com.athena.Athena_Ecommerce.dto.Response;
import com.athena.Athena_Ecommerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;


public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}