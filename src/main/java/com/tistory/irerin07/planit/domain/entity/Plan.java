package com.tistory.irerin07.planit.domain.entity;

import java.io.Serial;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
 * @description plan
 * @since 2023.09.25
 **********************************************************************************************************************/
@Getter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "tb_plan")
public class Plan extends AbstractEntity {


  @Serial
  private static final long serialVersionUID = 5364107673395241866L;


  private LocalDate date;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private Boolean allDay;
  private String city;
  private String region;
  private String location;
  private String transportation;
  private String memo;
  private Integer order;

}
