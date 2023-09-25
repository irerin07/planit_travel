package com.tistory.irerin07.planit.common.configuration.security;

import java.io.Serial;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tistory.irerin07.planit.domain.dto.UserDto;

import lombok.Getter;

/**
 * @author 민경수
 * @description user detail
 * @since 2023.09.25
 **********************************************************************************************************************/
public class UserDetail implements UserDetails {


  @Serial
  private static final long serialVersionUID = -5382080440053403896L;


  @Getter
  private final UserDto user;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return null;
  }

  @Override
  public String getUsername() {
    return null;
  }

  @Override
  public boolean isAccountNonExpired() {
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    return false;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }
}
