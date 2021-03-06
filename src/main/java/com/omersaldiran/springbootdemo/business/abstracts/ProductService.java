package com.omersaldiran.springbootdemo.business.abstracts;

import com.omersaldiran.springbootdemo.core.utilities.results.DataResult;
import com.omersaldiran.springbootdemo.core.utilities.results.Result;
import com.omersaldiran.springbootdemo.entities.concretes.Product;
import com.omersaldiran.springbootdemo.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAllSorted();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);
    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
    DataResult<List<Product>> getByProductNameContains(String productName);
    DataResult<List<Product>> getByProductNameStartsWith(String productName);
    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
