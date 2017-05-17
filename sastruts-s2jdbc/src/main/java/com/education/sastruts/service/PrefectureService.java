package com.education.sastruts.service;

import java.util.List;

import org.seasar.extension.jdbc.operation.Operations;

import com.education.sastruts.entity.Prefecture;
import com.education.sastruts.entity.PrefectureNames;

public class PrefectureService extends AbstractService<Prefecture> {

  public List<Prefecture> findAllOrderById() {
    return this.select().orderBy(Operations.asc(PrefectureNames.prefectureId())).getResultList();
  }
}
