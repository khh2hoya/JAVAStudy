<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="student" class="com.servlet.ex.Student" scope="page"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<jsp:setProperty name="student" property="name" value="ȫ�浿"/>
	<jsp:setProperty name="student" property="age" value="32"/>
	<jsp:setProperty name="student" property="grade" value="5"/>
	<jsp:setProperty name="student" property="studentNum" value="19"/>
	
	�̸�: <jsp:getProperty name="student" property="name"/><br/>
	����: <jsp:getProperty name="student" property="age"/><br/>
	�г�: <jsp:getProperty name="student" property="grade"/><br/>
	��ȣ: <jsp:getProperty name="student" property="studentNum"/><br/>
</body>
</html>