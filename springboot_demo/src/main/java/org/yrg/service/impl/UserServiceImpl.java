package org.yrg.service.impl;

import org.springframework.stereotype.Service;
import org.yrg.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("sayHello" + name);
    }
}
