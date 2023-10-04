package com.springboot.stock.data.service;

import com.springboot.stock.data.dto.StockDto;
import com.springboot.stock.data.entity.Stock;

import java.util.List;

public interface StockService {
    List<Stock> stockSearch (StockDto stockDto) throws Exception;
}
