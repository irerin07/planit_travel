package com.tistory.irerin07.planit.domain.entity;

import java.io.Serial;
import java.time.LocalDate;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 민경수
 * @description plan information
 * @since 2023.09.25
 **********************************************************************************************************************/
@Getter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "tb_plan_information")
public class PlanInformation extends AbstractEntity {

  @Serial
  private static final long serialVersionUID = -7268999018507063679L;

  private String title;

  private String country;

  private Integer days;

  private Integer night;

  private LocalDate from;

  private LocalDate to;

  private Integer people;

}
