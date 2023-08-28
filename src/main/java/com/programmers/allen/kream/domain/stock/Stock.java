package com.programmers.allen.kream.domain.stock;

import com.programmers.allen.kream.common.Money;
import com.programmers.allen.kream.infra.money.MoneyConverter;
import jakarta.persistence.*;

@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sellerId;

    private Long goodsId;

    @Column(name = "selling_price")
    @Convert(converter = MoneyConverter.class)
    private Money sellingPrice;

    @Enumerated(EnumType.STRING)
    private StockStatus stockStatus;

    //todo: 등록, 마감 시간 구현
}
