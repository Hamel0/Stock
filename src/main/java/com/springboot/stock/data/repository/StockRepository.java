package com.springboot.stock.data.repository;

import com.springboot.stock.data.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}
