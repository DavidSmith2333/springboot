package com.xiaoliu.pojo;

import java.util.Date;

public class Product {
    private Integer id;
    private String productName;
    private float productConcessionary;
    private float productPrice;
    private float productActualPayment;
    private String dateOfManufacture;
    private String productINFO;

    public Product() {
    }

    public Product(Integer id, String productName, float productConcessionary, float productPrice, float productActualPayment, String dateOfManufacture, String productINFO) {
        this.id = id;
        this.productName = productName;
        this.productConcessionary = productConcessionary;
        this.productPrice = productPrice;
        this.productActualPayment = productActualPayment;
        this.dateOfManufacture = dateOfManufacture;
        this.productINFO = productINFO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductConcessionary() {
        return productConcessionary;
    }

    public void setProductConcessionary(float productConcessionary) {
        this.productConcessionary = productConcessionary;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductActualPayment() {
        return productActualPayment;
    }

    public void setProductActualPayment(float productActualPayment) {
        this.productActualPayment = productActualPayment;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getProductINFO() {
        return productINFO;
    }

    public void setProductINFO(String productINFO) {
        this.productINFO = productINFO;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productConcessionary=" + productConcessionary +
                ", productPrice=" + productPrice +
                ", productActualPayment=" + productActualPayment +
                ", dateOfManufacture=" + dateOfManufacture +
                ", productINFO='" + productINFO + '\'' +
                '}';
    }
}
