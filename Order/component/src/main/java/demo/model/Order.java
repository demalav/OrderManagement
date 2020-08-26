package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Column(name = "order")
public class Order implements Serializable {

    @Id
    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "address")
    private String shippingAddress;

    @Column(name="order_item")
    private String orderItem;

    @Column(name="total")
    private String total;

    @Column(name="order_date")
    private Date date;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(customerName, order.customerName) &&
                Objects.equals(shippingAddress, order.shippingAddress) &&
                Objects.equals(orderItem, order.orderItem) &&
                Objects.equals(total, order.total) &&
                Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, shippingAddress, orderItem, total, date);
    }
}
