package com.master.SpringSecurity01.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.SpringSecurity01.enity.User;

public interface IUserRepo extends JpaRepository<User, String> {
	User findByName(String name);
}
