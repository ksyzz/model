package org.ksyzz.service;

import org.ksyzz.entity.User;
import org.ksyzz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fengqian on 2017/4/10.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User addUser(String userName, String password){
        User user = new User();
        user.setPassword(password);
        user.setUserName(userName);
        userRepository.save(user);
        return user;
    }
}
