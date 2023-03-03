package ru.senderov.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.senderov.backend.models.User;
import ru.senderov.backend.services.UserService;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> user(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok().build();
    }

}
