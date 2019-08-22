package com.cskaoyan.mall.bean;

public class OrderSubmit {
    private int addressId;
    private int cartId;
    private int couponId;
    private int grouponLinkedId;
    private int grouponRulesId;
    private String message;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public int getGrouponLinkedId() {
        return grouponLinkedId;
    }

    public void setGrouponLinkedId(int grouponLinkedId) {
        this.grouponLinkedId = grouponLinkedId;
    }

    public int getGrouponRulesId() {
        return grouponRulesId;
    }

    public void setGrouponRulesId(int grouponRulesId) {
        this.grouponRulesId = grouponRulesId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
