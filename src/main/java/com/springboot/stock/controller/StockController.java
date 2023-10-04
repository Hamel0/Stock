package com.springboot.stock.controller;

import com.springboot.stock.data.dto.StockDto;
import com.springboot.stock.data.entity.Stock;
import com.springboot.stock.data.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/main")
    public String stockSearch() {
        return "/main";
    }

    @GetMapping("/search")
    public String searchStock(StockDto stockDto, Model model) throws Exception {

        return "/searshList";
    }

}
