package com.programmers.allen.kream.domain.brand;


import jakarta.persistence.*;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_name")
    private String brandName;

    protected Brand() {}

    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public Long getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }
}
