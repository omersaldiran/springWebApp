package com.omersaldiran.springbootdemo.business.concretes;

import com.omersaldiran.springbootdemo.business.abstracts.ProductService;
import com.omersaldiran.springbootdemo.dataAccess.abstracts.ProductDao;
import com.omersaldiran.springbootdemo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
