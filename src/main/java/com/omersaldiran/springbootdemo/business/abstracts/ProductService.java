package com.omersaldiran.springbootdemo.business.abstracts;

import com.omersaldiran.springbootdemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
