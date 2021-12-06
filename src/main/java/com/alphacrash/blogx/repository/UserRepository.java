package com.alphacrash.blogx.repository;

import com.alphacrash.blogx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
