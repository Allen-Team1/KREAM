package com.programmers.allen.kream.domain.goods;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;


@Embeddable
public class ProductInfo {
    @Column(name = "model_number")
    private String modelNumber;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "color")
    private String color;

    @Column(name =  "release_price")
    private String releasePrice;

    protected ProductInfo() {}

    public ProductInfo(String modelNumber, LocalDate releaseDate, String color, String releasePrice) {
        this.modelNumber = modelNumber;
        this.releaseDate = releaseDate;
        this.color = color;
        this.releasePrice = releasePrice;
    }
}
