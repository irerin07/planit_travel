package com.tistory.irerin07.planit.common.configuration.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.querydsl.jpa.impl.JPAQueryFactory;

/**
 * @author 민경수
 * @description jpa configuration
 * @since 2023.09.25
 **********************************************************************************************************************/
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EntityScan(basePackageClasses = {Jsr310JpaConverters.class}, basePackages = {"com.tistory.irerin07.planit.domain"})
@EnableJpaRepositories(basePackages = {"com.tistory.irerin07.planit.repository"})
public class JpaConfiguration {

  @PersistenceContext
  private EntityManager entityManager;

  @Bean
  public JPAQueryFactory jpaQueryFactory() {
    return new JPAQueryFactory(entityManager);
  }

  @Bean
  public AuditorAware<String> auditorAware() {
    return new AuditorAwareImpl();
  }

}
