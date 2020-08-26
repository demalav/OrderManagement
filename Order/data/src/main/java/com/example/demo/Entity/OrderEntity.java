package com.example.demo.Entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderEntity {

    @JsonProperty
    private String customerName;

    @JsonProperty
    private Date date;

    @JsonProperty
    private String address;

    @JsonProperty
    private String orderItem;

    @JsonProperty
    private BigInteger total;

    public OrderEntity() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return Objects.equals(customerName, that.customerName) &&
                Objects.equals(date, that.date) &&
                Objects.equals(address, that.address) &&
                Objects.equals(orderItem, that.orderItem) &&
                Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, date, address, orderItem, total);
    }
}
