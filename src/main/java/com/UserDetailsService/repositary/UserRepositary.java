package com.UserDetailsService.repositary;

import com.UserDetailsService.userentity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepositary extends JpaRepository<UserEntity,String> {

    Optional<UserEntity> findByusername(String username);
}
