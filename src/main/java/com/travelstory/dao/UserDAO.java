package com.travelstory.dao;

import com.travelstory.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    boolean existsByEmailAndPassword(String email, String password);

    User findByEmail(String email);
}
