package com.example.demo.model;

import com.sun.javafx.beans.IDProperty;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Column(name = "order_item")
public class OrderItem implements Serializable {

    @Id
    @Column(name = "product_code")
    private BigInteger productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "quantity")
    private BigInteger quantity;

    public BigInteger getProductCode() {
        return productCode;
    }

    public void setProductCode(BigInteger productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(productCode, orderItem.productCode) &&
                Objects.equals(productName, orderItem.productName) &&
                Objects.equals(quantity, orderItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode, productName, quantity);
    }
}
