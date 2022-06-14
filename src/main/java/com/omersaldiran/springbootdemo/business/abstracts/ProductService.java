package com.omersaldiran.springbootdemo.business.abstracts;

import com.omersaldiran.springbootdemo.core.utilities.results.DataResult;
import com.omersaldiran.springbootdemo.core.utilities.results.Result;
import com.omersaldiran.springbootdemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
