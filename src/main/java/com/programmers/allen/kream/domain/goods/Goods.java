package com.programmers.allen.kream.domain.goods;


import jakarta.persistence.*;

@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "goods_size")
    private String goodsSize;

    protected Goods() {}

    public Goods(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsSize='" + goodsSize + '\'' +
                '}';
    }
}
