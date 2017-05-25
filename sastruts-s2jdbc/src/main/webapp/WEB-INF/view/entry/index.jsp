<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>顧客管理 - 研修資料 -</title>
</head>
<body>
  <div>
    <h1>研修課題</h1>
    <hr>
    <div>
      <span><a href="${f:url('/')}">トップページへ</a></span><span>&#047;</span><span>顧客情報</span>
    </div>
    <h2>顧客情報登録（入力）</h2>
    <hr>
    <div>
      <s:form method="post">
        <fieldset>
          <%-- 顧客ID Begin. --%>
          <div>
            <label for="customerId">顧客ID</label>
          </div>
          <div>
            <html:text styleId="customerId" property="customerId"></html:text>
          </div>
          <%-- 顧客ID End. --%>
          <%-- 名称 Begin. --%>
          <div>
            <label for="name">名称</label>
          </div>
          <div>
            <html:text styleId="name" property="name"></html:text>
          </div>
          <%-- 名称 End. --%>
          <%-- 都道府県 Begin. --%>
          <div>
            <label for="prefecture">都道府県</label>
          </div>
          <div>
            <html:select styleId="prefecture" property="prefecture">
              <html:optionsCollection name="prefectures" value="prefectureId" label="name" />
            </html:select>
          </div>
          <%-- 都道府県 End. --%>
        </fieldset>
        <div>
          <s:submit property="confirm">確認</s:submit>
          <s:submit property="backToIndex">戻る</s:submit>
        </div>
      </s:form>
    </div>
  </div>
</body>
</html>
