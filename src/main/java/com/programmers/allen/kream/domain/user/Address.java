package com.programmers.allen.kream.domain.user;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String zipcode;

    private String address;

    private String addressDetail;

    public Address(String zipcode, String address, String addressDetail) {
        this.zipcode = zipcode;
        this.address = address;
        this.addressDetail = addressDetail;
    }

    protected Address() {}
}
