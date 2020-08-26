package com.example.demo.Entity;


@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemEntity {

    @JsonProperty
    private String productCode;

    @JsonProperty
    private String productName;

    @JsonProperty
    private String quantity;

    public OrderItemEntity() {
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
