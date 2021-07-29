package com.cons.common.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<SecurityMemberEntity, Long> {

    Optional<SecurityMemberEntity> findByEmail(String username);
}
