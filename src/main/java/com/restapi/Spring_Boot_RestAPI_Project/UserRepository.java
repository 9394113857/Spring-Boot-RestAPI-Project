package com.restapi.Spring_Boot_RestAPI_Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
