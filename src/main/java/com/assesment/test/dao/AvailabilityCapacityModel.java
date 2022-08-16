package com.assesment.test.dao;

public class AvailabilityCapacityModel {

    String storeNo;
    String productId;
    String reqQty;
    String reqDate;
    String status;


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "RequestPOJO [storeNo=" + storeNo + ", productId=" + productId + ", reqQty=" + reqQty + ", reqDate="
                + reqDate + "]";
    }
    public AvailabilityCapacityModel(String storeNo, String productId, String reqQty, String reqDate) {
        super();
        this.storeNo = storeNo;
        this.productId = productId;
        this.reqQty = reqQty;
        this.reqDate = reqDate;
    }
    public String getStoreNo() {
        return storeNo;
    }
    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getReqQty() {
        return reqQty;
    }
    public void setReqQty(String reqQty) {
        this.reqQty = reqQty;
    }
    public String getReqDate() {
        return reqDate;
    }
    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

}
