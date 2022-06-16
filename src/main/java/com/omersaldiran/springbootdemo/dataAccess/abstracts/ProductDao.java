package com.omersaldiran.springbootdemo.dataAccess.abstracts;

import com.omersaldiran.springbootdemo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    Product getByProductName(String productName);
    Product getByProductNameAndCategoryId(String productName, int categoryId);
    List<Product> getByProductNameOrCategoryId(String productName, int categoryId);

}
