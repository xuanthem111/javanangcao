<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="bo.sachbo"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.KhachHangbo"%>
<%@page import="bean.loaibean"%>
<%@page import="bean.sachbean"%>
<%@page import="bean.KhachHangbeab"%>

<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<title>Demo</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/thuviencss.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
	//Lay ve all sach, cac thong tin client
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	sachbo sbo = new sachbo();
	out.print(sbo.toString());
	loaibo lbo = new loaibo();
	KhachHangbo khbo = new KhachHangbo();
	ArrayList<sachbean> ds = sbo.getsach();
	ArrayList<KhachHangbeab> kh = khbo.getkh();
	String ml = request.getParameter("ml");
	String key = request.getParameter("txttk");
	String un = request.getParameter("txtun");
	String pass = request.getParameter("txtpass");
	//out.print(mk + "---"  + tentk);
	
	%>
	

	
</body>
</html>