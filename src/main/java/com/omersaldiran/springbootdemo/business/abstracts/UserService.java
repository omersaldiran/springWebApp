package com.omersaldiran.springbootdemo.business.abstracts;

import com.omersaldiran.springbootdemo.core.entities.User;
import com.omersaldiran.springbootdemo.core.utilities.results.DataResult;
import com.omersaldiran.springbootdemo.core.utilities.results.Result;
import com.omersaldiran.springbootdemo.entities.concretes.Product;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);


}
