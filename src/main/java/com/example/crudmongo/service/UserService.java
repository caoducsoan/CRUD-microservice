package com.example.crudmongo.service;

import com.example.crudmongo.model.User;
import com.example.crudmongo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public Optional<User> getById(String id) {
        return repository.findById(id);
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(String id, User user) {
        user.setId(id);
        return repository.save(user);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
