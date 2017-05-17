package com.education.sastruts.entity;

import org.seasar.extension.jdbc.name.PropertyName;

import com.education.sastruts.entity.PrefectureNames._PrefectureNames;

public class CustomerNames {

  /**
   * idのプロパティ名を返します。
   *
   * @return idのプロパティ名
   */
  public static PropertyName<Long> id() {
    return new PropertyName<Long>("id");
  }

  /**
   * customerIdのプロパティ名を返します。
   *
   * @return customerIdのプロパティ名
   */
  public static PropertyName<String> customerId() {
    return new PropertyName<String>("customerId");
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
   * zipcodeのプロパティ名を返します。
   *
   * @return zipcodeのプロパティ名
   */
  public static PropertyName<String> zipcode() {
    return new PropertyName<String>("zipcode");
  }

  /**
   * prefectureIdのプロパティ名を返します。
   *
   * @return prefectureIdのプロパティ名
   */
  public static PropertyName<String> prefectureId() {
    return new PropertyName<String>("prefectureId");
  }

  /**
   * addressのプロパティ名を返します。
   *
   * @return addressのプロパティ名
   */
  public static PropertyName<String> address() {
    return new PropertyName<String>("address");
  }

  /**
   * telのプロパティ名を返します。
   *
   * @return telのプロパティ名
   */
  public static PropertyName<String> tel() {
    return new PropertyName<String>("tel");
  }

  /**
   * mailAddressのプロパティ名を返します。
   *
   * @return mailAddressのプロパティ名
   */
  public static PropertyName<String> mailAddress() {
    return new PropertyName<String>("mailAddress");
  }

  /**
   * versionのプロパティ名を返します。
   *
   * @return versionのプロパティ名
   */
  public static PropertyName<Long> version() {
    return new PropertyName<Long>("version");
  }

  /**
   * prefectureのプロパティ名を返します。
   *
   * @return prefectureのプロパティ名
   */
  public static _PrefectureNames prefecture() {
    return new _PrefectureNames("prefecture");
  }

  /**
   * @author S2JDBC-Gen
   */
  public static class _CustomerNames extends PropertyName<Customer> {

    /**
     * インスタンスを構築します。
     */
    public _CustomerNames() {}

    /**
     * インスタンスを構築します。
     *
     * @param name 名前
     */
    public _CustomerNames(final String name) {
      super(name);
    }

    /**
     * インスタンスを構築します。
     *
     * @param parent 親
     * @param name 名前
     */
    public _CustomerNames(final PropertyName<?> parent, final String name) {
      super(parent, name);
    }

    /**
     * idのプロパティ名を返します。
     *
     * @return idのプロパティ名
     */
    public PropertyName<Long> id() {
      return new PropertyName<Long>(this, "id");
    }

    /**
     * customerIdのプロパティ名を返します。
     *
     * @return customerIdのプロパティ名
     */
    public PropertyName<String> customerId() {
      return new PropertyName<String>(this, "customerId");
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
     * zipcodeのプロパティ名を返します。
     *
     * @return zipcodeのプロパティ名
     */
    public PropertyName<String> zipcode() {
      return new PropertyName<String>(this, "zipcode");
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
     * addressのプロパティ名を返します。
     *
     * @return addressのプロパティ名
     */
    public PropertyName<String> address() {
      return new PropertyName<String>(this, "address");
    }

    /**
     * telのプロパティ名を返します。
     *
     * @return telのプロパティ名
     */
    public PropertyName<String> tel() {
      return new PropertyName<String>(this, "tel");
    }

    /**
     * mailAddressのプロパティ名を返します。
     *
     * @return mailAddressのプロパティ名
     */
    public PropertyName<String> mailAddress() {
      return new PropertyName<String>(this, "mailAddress");
    }

    /**
     * versionのプロパティ名を返します。
     *
     * @return versionのプロパティ名
     */
    public PropertyName<Long> version() {
      return new PropertyName<Long>(this, "version");
    }

    /**
     * prefectureのプロパティ名を返します。
     *
     * @return prefectureのプロパティ名
     */
    public _PrefectureNames prefecture() {
      return new _PrefectureNames(this, "prefecture");
    }
  }
}
