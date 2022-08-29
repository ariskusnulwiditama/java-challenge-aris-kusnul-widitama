package com.example.ist.challenge.aris_kusnul_widitama.repository;

import com.example.ist.challenge.aris_kusnul_widitama.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
