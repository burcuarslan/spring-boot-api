package com.example.enoca.business.responses;

import com.example.enoca.entities.concretes.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductsResponse {

    private int id;
    private String productName;

    private int unitPrice;

    private int unitsInStock;

    /**
     * JPA ile ilişkilendirilmiş categoryId değerini alır ve Category tablosundaki categoryId ile ilişkilendirir ve CategoryName değerini alır.
     */
    private String categoryName;

}
