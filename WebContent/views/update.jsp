<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file ="header.html"%>

<%try{ %>
	<% if(request.getAttribute("message").toString() != "") { %>
	<p><h3 style="color: red"><%=request.getAttribute("message").toString() %></h3>
	<%} %>
<%} catch (Exception e) {} %>

<form action = "../jp.co.aforce.servret/Servret2" method="post">



<p>会員情報登録</p>
<p>■会員番号</p>
<input type ="text" name = "member_id" required="required">
<button type="button">検索</button>
<p>■名前</p>
<p>性<input type ="text" name = "last_name" required="required">名<input type ="text" name = "first_name" required="required"></p>
<p>■性別</p>
<input type="radio" name="sex" value="男" required="required">男
<input type="radio" name="sex" value="女" required="required">女
<p>■生年月日</p>
<input type ="text" name = "birth_year" required="required">年<select name="birth_month" required="required">
<option value="1">1</option><option value="2">2</option><option value="3">3</option>
<option value="4">4</option><option value="5">5</option><option value="6">6</option>
<option value="7">7</option><option value="8">8</option><option value="9">9</option>
<option value="10">10</option><option value="11">11</option><option value="12">12</option>
</select>月
<select name="birth_day" required="required">
<option value="1">1</option><option value="2">2</option><option value="3">3</option>
<option value="4">4</option><option value="5">5</option><option value="6">6</option>
<option value="7">7</option><option value="8">8</option><option value="9">9</option>
<option value="10">10</option><option value="11">11</option><option value="12">12</option>
<option value="13">13</option><option value="14">14</option><option value="15">15</option>
<option value="16">16</option><option value="17">17</option><option value="18">18</option>
<option value="19">19</option><option value="20">20</option><option value="21">21</option>
<option value="22">22</option><option value="23">23</option><option value="24">24</option>
<option value="25">25</option><option value="26">26</option><option value="27">27</option>
<option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option>
</select>日
<p>■職業</p>
<select name="job" required="required">
<option value="会社員">会社員</option><option value="自営業">自営業</option>
<option value="学生">学生</option><option value="その他">その他</option>
</select>
<p>■電話番号</p>
<input type="text" name = "phone_number" required="required">
<p>■メールアドレス</p>
<input type ="text" name = "mail_address" required="required">
<p><button type="button" onclick="history.back()">戻る</button>
<button type="reset">リセット</button>
<button type="submit">更新</button></p>

</form>





<%@include file ="footer.html"%>