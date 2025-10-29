package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Service;

@Service
public interface DishService {
    /**
     * 新增菜品，同时保存对应的口味数据
     * @param dishDTO
     */

    public void saveWithFlavor(DishDTO dishDTO);
}
