package com.example.catalogservice.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseCatalog {
    private String productId;
    private String productName;
    private Integer unitPrice;
    private Integer totalPrice;
    private Date createdAt;
}
