package com.programmers.allen.kream.domain.goods;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long brandId;

    @Column(name = "product_name")
    private String name;

    @Embedded
    private ProductInfo shoesInformation;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<Goods> goods = new ArrayList<>();


    protected Product() {}

    public Product(Long brandId, String name, ProductInfo shoesInformation, List<Goods> goods) {
        this.brandId = brandId;
        this.name = name;
        this.shoesInformation = shoesInformation;
        this.goods = goods;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setSize(List<Goods> goods) {
        this.goods = goods;
    }
}
