package com.education.sastruts.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.education.sastruts.entity.Prefecture;
import com.education.sastruts.form.EntryForm;
import com.education.sastruts.service.PrefectureService;

public class EntryAction {

  public List<Prefecture> prefectures;

  @ActionForm
  @Resource
  protected EntryForm entryForm;

  @Resource
  protected PrefectureService prefectureService;

  @Execute(validator = false)
  public String index() {
    //
    this.prefectures = this.prefectureService.findAllOrderById();
    //
    return "index.jsp";
  }

  @Execute(validator = true, input = "index.jsp")
  public String confirm() {
    return "cofirm.jsp";
  }

  @Execute(validator = false)
  public String complete() {
    return "complete.jsp";
  }

  @Execute(validator = false, redirect = true, removeActionForm = false)
  public String backToIndex() {
    return "/";
  }

}
