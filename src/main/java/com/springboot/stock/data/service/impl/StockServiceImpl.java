package com.springboot.stock.data.service.impl;

import com.springboot.stock.data.dto.StockDto;
import com.springboot.stock.data.entity.Stock;
import com.springboot.stock.data.repository.StockRepository;
import com.springboot.stock.data.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    private StockRepository stockRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository){
        this.stockRepository=stockRepository;
    }


    @Override
    public List<Stock> stockSearch(StockDto stockDto) throws Exception {
        return stockRepository.findAll(Sort.by(Sort.Direction.DESC, "st_day"));
    }
}
