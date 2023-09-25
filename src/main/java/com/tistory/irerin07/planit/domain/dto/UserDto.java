package com.tistory.irerin07.planit.domain.dto;

import java.io.Serial;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 민경수
 * @description user dto
 * @since 2023.09.25
 **********************************************************************************************************************/
@Getter
@Setter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDto extends AbstractDto{
  @Serial
  private static final long serialVersionUID = 6564843666919380711L;
}
