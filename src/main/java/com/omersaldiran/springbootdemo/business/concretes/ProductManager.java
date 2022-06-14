package com.omersaldiran.springbootdemo.business.concretes;

import com.omersaldiran.springbootdemo.business.abstracts.ProductService;
import com.omersaldiran.springbootdemo.core.utilities.results.DataResult;
import com.omersaldiran.springbootdemo.core.utilities.results.Result;
import com.omersaldiran.springbootdemo.core.utilities.results.SuccessDataResult;
import com.omersaldiran.springbootdemo.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>( this.productDao.findAll(),"Data listelendi");


    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }
}
