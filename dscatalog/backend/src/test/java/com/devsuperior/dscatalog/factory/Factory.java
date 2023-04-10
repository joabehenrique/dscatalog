package com.devsuperior.dscatalog.factory;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

import java.time.Instant;

public class Factory {
    public static Product createProduct(){
        Product product = new Product(1L, "The Lord of the Rings",
                "Lorem ipsum dolor ", 900.0,
                "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg",
                Instant.parse("2020-07-13T20:50:07.12345Z"));

        product.getCategories().add(new Category(2L, "Eletrônicos"));

        return product;
    }

    public static ProductDTO createProductDTO(){
        Product product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }
}
