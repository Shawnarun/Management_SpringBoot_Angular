package com.shawn.cafe.Repo;

import com.shawn.cafe.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
