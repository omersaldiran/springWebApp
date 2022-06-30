package com.omersaldiran.springbootdemo.business.concretes;

import com.omersaldiran.springbootdemo.business.abstracts.UserService;
import com.omersaldiran.springbootdemo.core.dataAccess.UserDao;
import com.omersaldiran.springbootdemo.core.entities.User;
import com.omersaldiran.springbootdemo.core.utilities.results.DataResult;
import com.omersaldiran.springbootdemo.core.utilities.results.Result;
import com.omersaldiran.springbootdemo.core.utilities.results.SuccessDataResult;
import com.omersaldiran.springbootdemo.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
    }
}
