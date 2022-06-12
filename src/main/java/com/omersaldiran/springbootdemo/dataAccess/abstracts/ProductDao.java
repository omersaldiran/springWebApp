package com.omersaldiran.springbootdemo.dataAccess.abstracts;

import com.omersaldiran.springbootdemo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
