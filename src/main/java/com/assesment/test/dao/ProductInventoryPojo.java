package com.assesment.test.dao;

import java.util.Date;
//first question
public class ProductInventoryPojo {

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

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Double getAvlQty() {
        return avlQty;
    }

    public void setAvlQty(Double avlQty) {
        this.avlQty = avlQty;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public ProductInventoryPojo() {
    }

    public ProductInventoryPojo(String productId, String productName, String unitOfMeasure, Double avlQty, Date reqDate) {
        this.productId = productId;
        this.productName = productName;
        this.unitOfMeasure = unitOfMeasure;
        this.avlQty = avlQty;
        this.reqDate = reqDate;
    }

    private String productId;

    @Override
    public String toString() {
        return "ProductInventoryPojo{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", avlQty=" + avlQty +
                ", reqDate=" + reqDate +
                '}';
    }

    private String productName;
    private String unitOfMeasure;
    private Double avlQty;
    private Date reqDate;
}
