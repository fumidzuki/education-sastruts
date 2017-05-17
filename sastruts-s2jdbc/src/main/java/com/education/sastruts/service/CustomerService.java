package com.education.sastruts.service;

import static com.education.sastruts.entity.CustomerNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import com.education.sastruts.entity.Customer;

public class CustomerService extends AbstractService<Customer> {

  /**
   * 識別子でエンティティを検索します。
   *
   * @param id 識別子
   * @return エンティティ
   */
  public Customer findById(Long id) {
    return select().id(id).getSingleResult();
  }

  /**
   * 識別子とバージョン番号でエンティティを検索します。
   *
   * @param id 識別子
   * @param version バージョン番号
   * @return エンティティ
   */
  public Customer findByIdVersion(Long id, Long version) {
    return select().id(id).version(version).getSingleResult();
  }

  /**
   * 識別子の昇順ですべてのエンティティを検索します。
   *
   * @return エンティティのリスト
   */
  public List<Customer> findAllOrderById() {
    return select().orderBy(asc(id())).getResultList();
  }
}
