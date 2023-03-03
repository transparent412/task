package ru.senderov.backend.services;

import ru.senderov.backend.models.User;

public interface UserService {

    User findById(Long id);

    void save(User user);

}
