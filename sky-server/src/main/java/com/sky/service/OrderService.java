package com.sky.service;


import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {


    OrderSubmitVO submit(OrdersSubmitDTO ordersSubmitDTO);
}
