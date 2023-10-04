package com.springboot.stock.data.dto;

import com.springboot.stock.data.entity.Stock;
import lombok.*;
import org.springframework.stereotype.Component;


import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Component
public class StockDto {

    private Long stId;

    private Date stDay;

    private int stStart;

    private int stHigh;

    private int stLow;

    private int stClose;

    private int stBefore;

    private Long stTrade;

    private Long stMoney;

    public Stock search(){
        return Stock.builder()
                .stId(stId)
                .stDay(stDay)
                .stStart(stStart)
                .stHigh(stHigh)
                .stLow(stLow)
                .stClose(stClose)
                .stBefore(stBefore)
                .stTrade(stTrade)
                .stMoney(stMoney)
        .build();
    }

}
