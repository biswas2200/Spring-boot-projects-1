package com.dataTransferOperation.repository;

import com.dataTransferOperation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
