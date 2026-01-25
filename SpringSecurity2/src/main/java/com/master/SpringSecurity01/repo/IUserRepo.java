package com.master.SpringSecurity01.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.SpringSecurity01.enity.User;

@Repository
public interface IUserRepo extends JpaRepository<User, String> {
	User findByName(String name);
}
