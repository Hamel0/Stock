package com.springboot.stock.data.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Stock {

    @Id
    @Column(name = "st_id")
    private Long stId;

    @Column(name = "st_day")
    private Date stDay;

    @Column(name = "st_start")
    private int stStart;

    @Column(name = "st_high")
    private int stHigh;

    @Column(name = "st_low")
    private int stLow;

    @Column(name = "st_close")
    private int stClose;

    @Column(name = "st_before")
    private int stBefore;

    @Column(name = "st_trade")
    private Long stTrade;

    @Column(name = "st_money")
    private Long stMoney;

}
