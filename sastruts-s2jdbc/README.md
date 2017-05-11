# SAStruts + s2jdbc 研修資料

## Overview

「SAStruts」と「s2jdbc」を使用した研修資料です。  
JavaのWebフレームワークの使用方法、DBへの接続とCRUD処理の基礎的技術を研修するために使用します。  
作成するWebアプリは、「顧客情報管理」のアプリケーションを作成します。  

## Requirement

## Usage

## System Design

### PackageName

パッケージ名称は「com.education.sastruts」にします。

### Database

アプリケーションで使用するデータベースの定義内容を記載します。

#### 顧客情報

* 論理テーブル名：顧客情報
* 物理テーブル名：customer

<table>
  <tr>
    <th>論理名</th>
    <th>物理名</th>
    <th>データ型</th>
    <th>備考</th>
  </tr>
  <tr>
    <td>識別子</td>
    <td>id</td>
    <td>BIGINT</td>
    <td>主キー、オートインクリメント</td>
  </tr>
  <tr>
    <td>顧客ID</td>
    <td>customer_id</td>
    <td>VARCHAR(64)</td>
    <td>ユニークキー、NOTNULL、半角英数字のみ</td>
  </tr>
  <tr>
    <td>名称</td>
    <td>name</td>
    <td>VARCHAR(256)</td>
    <td>NOTNULL</td>
  </tr>
  <tr>
    <td>郵便番号</td>
    <td>zipcode</td>
    <td>VARCHAR(7)</td>
    <td>NOTNULL、半角数字のみ</td>
  </tr> 
  <tr>
    <td>都道府県</td>
    <td>prefecture_id</td>
    <td>VARCHAR(2)</td>
    <td>NOTNULL、半角数字のみ</td>
  </tr> 
  <tr>
    <td>住所</td>
    <td>address</td>
    <td>VARCHAR(512)</td>
    <td>NOTNULL</td>
  </tr> 
  <tr>
    <td>電話番号</td>
    <td>tel</td>
    <td>VARCHAR(11)</td>
    <td>半角数字のみ</td>
  </tr> 
  <tr>
    <td>メールアドレス</td>
    <td>mail_address</td>
    <td>VARCHAR(256)</td>
    <td></td>
  </tr> 
  <tr>
    <td>バージョン番号</td>
    <td>version</td>
    <td>BIGING</td>
    <td>NOTNULL</td>
  </tr> 
</table>

#### 都道府県情報マスタ

* 論理テーブル名：都道府県情報マスタ
* 物理テーブル名：prefecture

<table>
  <tr>
    <th>論理名</th>
    <th>物理名</th>
    <th>データ型</th>
    <th>備考</th>
  </tr>
  <tr>
    <td>識別子</td>
    <td>id</td>
    <td>BIGINT</td>
    <td>主キー</td>
  </tr>
  <tr>
    <td>都道府県ID</td>
    <td>prefecture_id</td>
    <td>CHAR(2)</td>
    <td>ユニークキー、NOTNULL</td>
  </tr>
  <tr>
    <td>名称</td>
    <td>name</td>
    <td>VARCHAR(64)</td>
    <td>NOTNULL</td>
  </tr>
</table>

※「都道府県情報マスタ」の「都道府県ID」、「名称」は、「ISO 3166-2:JP」を参考にして設定します。
https://ja.wikipedia.org/wiki/ISO_3166-2:JP
