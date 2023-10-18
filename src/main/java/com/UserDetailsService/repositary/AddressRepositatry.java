package com.UserDetailsService.repositary;

import com.UserDetailsService.userentity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepositatry extends JpaRepository<AddressEntity,Long> {
}
