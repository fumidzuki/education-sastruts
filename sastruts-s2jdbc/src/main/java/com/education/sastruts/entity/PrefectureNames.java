package com.education.sastruts.entity;

import org.seasar.extension.jdbc.name.PropertyName;

import com.education.sastruts.entity.CustomerNames._CustomerNames;

public class PrefectureNames {

  /**
   * prefectureIdのプロパティ名を返します。
   *
   * @return prefectureIdのプロパティ名
   */
  public static PropertyName<String> prefectureId() {
    return new PropertyName<String>("prefectureId");
  }

  /**
   * nameのプロパティ名を返します。
   *
   * @return nameのプロパティ名
   */
  public static PropertyName<String> name() {
    return new PropertyName<String>("name");
  }

  /**
   * customerListのプロパティ名を返します。
   *
   * @return customerListのプロパティ名
   */
  public static _CustomerNames customerList() {
    return new _CustomerNames("customerList");
  }

  /**
   * @author S2JDBC-Gen
   */
  public static class _PrefectureNames extends PropertyName<Prefecture> {

    /**
     * インスタンスを構築します。
     */
    public _PrefectureNames() {}

    /**
     * インスタンスを構築します。
     *
     * @param name 名前
     */
    public _PrefectureNames(final String name) {
      super(name);
    }

    /**
     * インスタンスを構築します。
     *
     * @param parent 親
     * @param name 名前
     */
    public _PrefectureNames(final PropertyName<?> parent, final String name) {
      super(parent, name);
    }

    /**
     * prefectureIdのプロパティ名を返します。
     *
     * @return prefectureIdのプロパティ名
     */
    public PropertyName<String> prefectureId() {
      return new PropertyName<String>(this, "prefectureId");
    }

    /**
     * nameのプロパティ名を返します。
     *
     * @return nameのプロパティ名
     */
    public PropertyName<String> name() {
      return new PropertyName<String>(this, "name");
    }

    /**
     * customerListのプロパティ名を返します。
     *
     * @return customerListのプロパティ名
     */
    public _CustomerNames customerList() {
      return new _CustomerNames(this, "customerList");
    }
  }
}
