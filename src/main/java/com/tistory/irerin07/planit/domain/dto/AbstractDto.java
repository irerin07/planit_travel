package com.tistory.irerin07.planit.domain.dto;

import java.io.Serial;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 민경수
 * @description abstract dto
 * @since 2023.09.25
 **********************************************************************************************************************/
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, of = {"seq"})
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class AbstractDto implements Serializable {


  @Serial
  private static final long serialVersionUID = -7716946803984599274L;


  /**
   * 일련번호
   */
  private Long seq;

}
