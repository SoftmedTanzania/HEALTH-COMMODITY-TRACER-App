package com.softmed.stockapp.Dom.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductBalance implements Serializable {


    @SerializedName("productCategory")
    private String productCategory;

    @SerializedName("productName")
    private String productName;


    @SerializedName("productDescription")
    private String productDescription;


    @SerializedName("unit")
    private String unit;

    @SerializedName("balance")
    private int balance;

    @SerializedName("productId")
    private int productId;

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
