<%@page import="bo.GioHangBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	GioHangBo gh1=(GioHangBo)session.getAttribute("gh");
	if(gh1!=null){
		String ms=request.getParameter("ms");
		String sltam=request.getParameter("txtsl");
		if(request.getParameter("butsua")!=null){
            gh1.Them(ms, "", "", Long.parseLong(sltam), (long)0);
		}
		if(request.getParameter("butxoa")!=null){
			gh1.Xoa(ms);
		}
		session.setAttribute("gh", gh1);
		response.sendRedirect("htgio.jsp");
	}	
  %>

</body>
</html>