package com.tistory.irerin07.planit.repository.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tistory.irerin07.planit.common.configuration.jpa.querydsl.support.QueryDslRepositoryPaginationSupport;
import com.tistory.irerin07.planit.domain.entity.User;
import com.tistory.irerin07.planit.repository.querydsl.UserRepositoryQueryDsl;

/**
 * @author 민경수
 * @description user repository impl
 * @since 2023.09.25
 **********************************************************************************************************************/
public class UserRepositoryImpl extends QueryDslRepositoryPaginationSupport implements UserRepositoryQueryDsl {

  public UserRepositoryImpl(JPAQueryFactory queryFactory) {
    super(User.class, queryFactory);
  }

}
