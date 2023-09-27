package ru.otus.neo4jdemo.repository;

import ru.otus.neo4jdemo.model.PhoneUser;

import java.util.List;
import java.util.Optional;

public interface PhoneUserRepository {
    void insert(PhoneUser phoneUser);

    Optional<PhoneUser> findOne(String id);

    List<PhoneUser> findAll();
}
