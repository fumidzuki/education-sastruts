package com.education.sastruts.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Customer implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 識別子 */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(precision = 19, nullable = false, unique = true)
  public Long id;

  /** 顧客ID */
  @Column(length = 64, nullable = false, unique = false)
  public String customerId;

  /** 名称 */
  @Column(length = 256, nullable = false, unique = false)
  public String name;

  /** 郵便番号 */
  @Column(length = 7, nullable = false, unique = false)
  public String zipcode;

  /** 都道府県ID */
  @Column(length = 2, nullable = false, unique = false)
  public String prefectureId;

  /** 住所 */
  @Column(length = 512, nullable = false, unique = false)
  public String address;

  /** 電話番号 */
  @Column(length = 11, nullable = true, unique = false)
  public String tel;

  /** メールアドレス */
  @Column(length = 256, nullable = true, unique = false)
  public String mailAddress;

  /** バージョン番号 */
  @Version
  @Column(precision = 19, nullable = false, unique = false)
  public Long version;

  /** prefecture関連プロパティ */
  @ManyToOne
  @JoinColumn(name = "prefecture_id", referencedColumnName = "prefecture_id")
  public Prefecture prefecture;
}
