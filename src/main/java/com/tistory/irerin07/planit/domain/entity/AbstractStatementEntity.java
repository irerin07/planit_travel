package com.tistory.irerin07.planit.domain.entity;

import java.io.Serial;
import java.time.LocalDateTime;

import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author 민경수
 * @description abstract statement entity
 * @since 2023.09.25
 **********************************************************************************************************************/
@Getter
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Audited(withModifiedFlag = true)
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractStatementEntity extends AbstractEntity {


  @Serial
  private static final long serialVersionUID = -2528080415399328882L;


  // 작성자
  @CreatedBy
  @Column(updatable = false)
  protected String createdBy;

  // 작성일
  @CreatedDate
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  @Column(name = "create_at", nullable = false, updatable = false)
  private LocalDateTime createAt;

  // 수정자
  @LastModifiedBy
  protected String updatedBy;

  // 수정일
  @LastModifiedDate
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
  @Column(name = "update_at")
  protected LocalDateTime updateAt;

}
