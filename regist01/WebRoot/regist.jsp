<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">
				<div id="rightheader">
					<p>
						2015/08/03 <br />
					</p>
				</div>
				<div id="topheader">
					<h1 id="title">
						<a href="#">main</a>
					</h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
				<p id="whereami"></p>
				<h1>注册</h1>
				<form action="regist.do" method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">用户名:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="username" /> <%
 	String msg = (String) request.getAttribute("regist_error");
 %> <span style="color: red; font-style: italic;"> <%=(msg == null ? "" : msg)%>
							</span>
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">真实姓名:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="name" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">密码:</td>
							<td valign="middle" align="left"><input type="password"
								class="inputgri" name="pwd" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">性别:</td>
							<td valign="middle" align="left">男 <input type="radio"
								class="inputgri" name="gendar" value="m" checked="checked" /> 女
								<input type="radio" class="inputgri" name="gendar" value="f" />
							</td>
						</tr>

						<tr>
							<td valign="middle" align="right">验证码: <img id="num"
								src="image" /> <a href="javascript:;"
								onclick="document
					.getElementById('num')
					.src = 'image?'+(new Date()).getTime()">
									换一张</a>
							</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="number" />
							</td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="确认" />
					</p>
				</form>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">ABC@126.com</div>
		</div>
	</div>
</body>
</html>