package com.shawn.cafe.Repo;

import com.shawn.cafe.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE email=?1", nativeQuery = true)
    User findByEmailId(String email);
}
