DROP SCHEMA IF EXISTS education;

DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS prefecture;

/**********************************/
/* テーブル名: 都道府県情報マスタ */
/**********************************/
CREATE TABLE prefecture(
    prefecture_id                     CHAR(2)     NOT NULL COMMENT '都道府県ID',
    name                              VARCHAR(64)     NOT NULL COMMENT '名称'
) COMMENT='都道府県情報マスタ';

/**********************************/
/* テーブル名: 顧客情報 */
/**********************************/
CREATE TABLE customer(
    id                                BIGINT(10)     NOT NULL COMMENT '識別子',
    customer_id                       VARCHAR(64)     NOT NULL COMMENT '顧客ID',
    name                              VARCHAR(256)     NOT NULL COMMENT '名称',
    zipcode                           VARCHAR(7)     NOT NULL COMMENT '郵便番号',
    prefecture_id                     CHAR(2)     NOT NULL COMMENT '都道府県ID',
    address                           VARCHAR(512)     NOT NULL COMMENT '住所',
    tel                               VARCHAR(11)     NULL  COMMENT '電話番号',
    mail_address                      VARCHAR(256)     NULL  COMMENT 'メールアドレス',
    version                           BIGINT(10)     NOT NULL COMMENT 'バージョン番号'
) COMMENT='顧客情報';


ALTER TABLE prefecture ADD CONSTRAINT IDX_prefecture_PK PRIMARY KEY (prefecture_id);

ALTER TABLE customer ADD CONSTRAINT IDX_customer_PK PRIMARY KEY (id);
ALTER TABLE customer ADD CONSTRAINT IDX_customer_FK0 FOREIGN KEY (prefecture_id) REFERENCES prefecture (prefecture_id);

