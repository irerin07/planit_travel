package com.tistory.irerin07.planit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tistory.irerin07.planit.domain.entity.User;
import com.tistory.irerin07.planit.repository.querydsl.UserRepositoryQueryDsl;

/**
 * @author 민경수
 * @description user repository
 * @since 2023.09.25
 **********************************************************************************************************************/
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, UserRepositoryQueryDsl {
}
