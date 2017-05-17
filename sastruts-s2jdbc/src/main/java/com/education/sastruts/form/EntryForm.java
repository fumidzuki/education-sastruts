package com.education.sastruts.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class EntryForm implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 顧客ID */
  public String customerId;

  /** 名称 */
  public String name;

  /** 都道府県 */
  public String prefecture;

  /** 郵便番号 */
  public String zipcode;

  /** 住所 */
  public String address;

  /** 電話番号 */
  public String tel;

  /** メールアドレス */
  public String mailAddress;

}
