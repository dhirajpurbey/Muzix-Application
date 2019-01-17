package com.stackroute.Muzix.Application.repository;

import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
