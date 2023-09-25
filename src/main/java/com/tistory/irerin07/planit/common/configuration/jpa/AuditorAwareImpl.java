package com.tistory.irerin07.planit.common.configuration.jpa;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import com.tistory.irerin07.planit.common.configuration.security.UserDetail;

/**
 * @author 민경수
 * @description auditor aware impl
 * @since 2023.09.25
 **********************************************************************************************************************/
public class AuditorAwareImpl implements AuditorAware<String> {

  private final Optional<String> anonymous = Optional.of("anonymous");

  @Override
  public Optional<String> getCurrentAuditor() {
    try {
      return Optional.of(((UserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser().getSeq().toString());
    } catch (Exception e) {
      return anonymous;
    }
  }

}
