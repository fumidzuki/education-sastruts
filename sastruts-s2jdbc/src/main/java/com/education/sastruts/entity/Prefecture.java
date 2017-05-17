package com.education.sastruts.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prefecture implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 都道府県ID */
  @Id
  @Column(length = 2, nullable = false, unique = true)
  public String prefectureId;

  /** 名称 */
  @Column(length = 64, nullable = false, unique = false)
  public String name;

  /** customerList関連プロパティ */
  @OneToMany(mappedBy = "prefecture")
  public List<Customer> customerList;
}
