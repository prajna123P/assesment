package com.assesment.test.dao;

//first question
public class AvailabilityRespModel {
    public AvailabilityRespModel(String productId, String productName, Double totalAvlQty) {
        this.productId = productId;
        this.productName = productName;
        this.totalAvlQty = totalAvlQty;
    }

    @Override
    public String toString() {
        return "AvailabilityRespModel{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", totalAvlQty=" + totalAvlQty +
                '}';
    }

    private String productId;

    private String productName;
    private Double totalAvlQty;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getTotalAvlQty() {
        return totalAvlQty;
    }

    public void setTotalAvlQty(Double totalAvlQty) {
        this.totalAvlQty = totalAvlQty;
    }

}
