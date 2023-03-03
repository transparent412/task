package ru.senderov.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.senderov.backend.models.User;
import ru.senderov.backend.repo.UserRepo;
import ru.senderov.backend.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }
}
