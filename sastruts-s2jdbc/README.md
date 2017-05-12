# SAStruts + s2jdbc 研修資料

## Overview

「SAStruts」と「s2jdbc」を使用した研修資料です。  
JavaのWebフレームワークの使用方法、DBへの接続とCRUD処理の基礎的技術を研修するために使用します。  
作成するWebアプリは、「顧客情報管理」のアプリケーションを作成します。  

## Requirement

### Development Environment

開発環境は以下を使用します。

統合開発環境：Pleiades All in One Eclipse 4.6 / Java / Windows 32bit or 64 bit / Full Edition  
※「Full Edtion」を使用すると「Java8」、「Tomcat」などの必要なプラグイン等も合わせて使用できるなるためこちらを使用します。  
http://mergedoc.osdn.jp/

DBサーバ：MySQL  
※MySQLを簡易的に使用するため「xampp」を使用します。  
https://sourceforge.net/projects/xampp/files/XAMPP%20Windows/5.6.30/xampp-portable-win32-5.6.30-1-VC11.zip/download

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
    <td>都道府県ID</td>
    <td>prefecture_id</td>
    <td>CHAR(2)</td>
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
    <td>都道府県ID</td>
    <td>prefecture_id</td>
    <td>CHAR(2)</td>
    <td>主キー、NOTNULL</td>
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

## Screen Common Design

### 入力値確認

* 入力値の確認処理は、入力可能な項目すべてを確認する。確認内容は「Database」を参照してください。

### 入力値確認順番

入力値の確認処理は、基本的には以下の順番で処理を実施します。

* 入力項目の先頭から順番に確認処理を実施します。
* 単項目の確認処理（必須入力、範囲など）を実施します。
* 単項目のDBデータ確認処理（マスタ情報不一致など）を実施します。
* 入力値の複数項目（複数項目を確認しないと入力値確認ができない）の確認処理を実施します。

### 入力値確認時メッセージ表示

入力確認時のメッセージは、使用するフレームワークに準備されたメッセージファイルを使用します。  
メッセージが不足している場合は、適宜追加をしてください。  

※SAStrutsの場合は、様々なメッセージがすでに用意されています。詳しくは以下のページを確認してください。
http://sastruts.seasar.org/featureReference.html#Validator

## Screen Layout

### 顧客情報一覧画面

#### Overview

顧客情報の一覧情報を表示します。

#### Layout

![顧客情報一覧画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/list.png)

#### Description

* 「新規登録」リンク押下時に、「新規登録入力画面」を表示します。
* 1件も登録されていない場合は、「顧客情報が未登録です。」を表示します。
* 一覧には、「顧客情報.識別子」の「昇順」で表示します。

### 顧客情報登録入力画面

#### Overview

顧客情報を登録するための入力画面を表示します。

#### Layout

![顧客情報登録入力画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/create_input.png)

#### Description

* 初期表示時は、すべて未入力の状態で表示する。「登録確認画面」から戻ってきた場合は、入力内容は維持します。
* 都道府県表示は、「都道府県マスタ」から取得した「名称」を表示します。表示順は「都道府県ID」を昇順で表示します。
* 「確認」ボタン押下時に、入力した項目の入力値確認処理を実施します。
  * 入力値確認処理に問題ない場合は、「登録確認画面」を表示します。
  * 入力値確認処理に問題ある場合は、「登録入力画面」を再表示します。入力内容は維持します。
* 「戻る」ボタン押下時に、「顧客情報一覧画面」を表示します。

### 顧客情報登録確認画面

#### Overview

顧客情報入力画面で入力した情報を確認するための画面を表示します。

#### Layout

![顧客情報登録確認画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/create_confirm.png)

#### Description

* 初期表示時は、「顧客情報登録入力画面」で入力した情報を表示します。
* 「登録」ボタン押下時に、顧客情報の登録処理を実施します。登録処理が完了した場合は、「顧客情報登録完了画面」を表示します。
* 「戻る」ボタン押下時に、「顧客情報登録入力画面」を表示します。

### 顧客情報登録完了画面

#### Overview

顧客情報の登録完了情報を表示するための画面を表示します。

#### Layout

![顧客情報登録完了画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/create_complete.png)

#### Description

* 初期表示時は、「顧客情報登録確認画面」で表示した情報を表示します。
* 「一覧画面へ」ボタン押下時に、「顧客情報一覧画面」を表示します。

### 顧客情報更新入力画面

#### Overview

顧客情報の更新情報を入力するための画面を表示します。

#### Layout

![顧客情報更新入力画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/update_input.png)

#### Description

* 初期表示時は、「顧客情報一覧画面」で選択した「顧客情報」を表示する。「更新確認画面」から戻ってきた場合は、入力内容は維持します。
* 都道府県表示は、「都道府県マスタ」から取得した「名称」を表示します。表示順は「都道府県ID」を昇順で表示します。
* 「確認」ボタン押下時に、入力した項目の入力値確認処理を実施します。
  * 入力値確認処理に問題ない場合は、「更新確認画面」を表示します。
  * 入力値確認処理に問題ある場合は、「更新入力画面」を再表示します。入力内容は維持します。
* 「戻る」ボタン押下時に、「顧客情報一覧画面」を表示します。

### 顧客情報更新確認画面

#### Overview

顧客情報更新画面で入力した情報を確認するための画面を表示します。

#### Layout

![顧客情報更新確認画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/update_confirm.png)

#### Description

* 初期表示時は、「顧客情報更新入力画面」で入力した情報を表示します。
* 「登録」ボタン押下時に、顧客情報の更新処理を実施します。更新処理が完了した場合は、「顧客情報更新完了画面」を表示します。
* 「戻る」ボタン押下時に、「顧客情報更新入力画面」を表示します。

### 顧客情報更新完了画面

#### Overview

顧客情報の更新完了情報を表示するための画面を表示します。

#### Layout

![顧客情報更新完了画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/update_complete.png)

#### Description

* 初期表示時は、「顧客情報更新確認画面」で表示した情報を表示します。
* 「一覧画面へ」ボタン押下時に、「顧客情報一覧画面」を表示します。

### 顧客情報削除確認画面

#### Overview

「顧客情報一覧画面」で選択した顧客情報の削除確認するための画面を表示します。

#### Layout

![顧客情報削除確認画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/delete_confirm.png)

#### Description

* 初期表示時は、「顧客情報一覧画面」で選択した「顧客情報」を表示する。
* 「削除」ボタン押下時に、顧客情報の削除処理を実施します。削除処理が完了した場合は、「顧客情報削除完了画面」を表示します。
* 「戻る」ボタン押下時に、「顧客情報一覧画面」を表示します。

### 顧客情報削除完了画面

#### Overview

顧客情報の削除完了情報を表示するための画面を表示します。

#### Layout

![顧客情報削除完了画面](https://github.com/fumidzuki/education-sastruts/blob/master/sastruts-s2jdbc/images/delete_complete.png)

#### Description

* 初期表示時は、「顧客情報削除確認画面」で表示した情報を表示します。
* 「一覧画面へ」ボタン押下時に、「顧客情報一覧画面」を表示します。
