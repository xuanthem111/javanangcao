<%@page import="bean.GioHangBean"%>
<%@page import="bo.GioHangBo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Giỏ hàng</title>
</head>
<body>
	<%
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String ms = request.getParameter("ms");
		String ts = request.getParameter("ts");
		String tg = request.getParameter("tg");
		String giatam = request.getParameter("gia");
		Long gia = Long.parseLong(giatam);
		String anh = request.getParameter("img");
		
		if (ms != null){
			GioHangBo gh= null;
			if (session.getAttribute("gh") == null){
				gh = new GioHangBo();
				session.setAttribute("gh", gh);
			}
			
			gh = (GioHangBo)session.getAttribute("gh");
		    gh.Them(ms,ts, tg,  (long)1, gia);
			
			session.setAttribute("gh", gh);
			response.sendRedirect("htgio.jsp");
		}
		
		
	%>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><a href="#">Trang chủ</a></li>
				<li><a href="#">Mua hàng</a></li>
				<li class="active"><a href="#">Thanh toán</a></li>
			</ul>
		</div>
	</nav>
	
	<h5 style="font-family: monospace; margin-left: 20px">Giỏ hàng của bạn:</h5>
	<hr  width="30%" align="left" style="height:2px;border-width:0;color:gray;background-color:gray; margin-left: 20px"/>
	
	<table>
		<tr>
			<td><img alt="" src="<%=anh%>" style = "height: 100px; width: 100px; padding: 10px; margin-left: 10px"></td>
			<td>
				<table>
					<tr>
						<td><%= ts %></td>			
					</tr>
					<tr>					
						<td><%= tg %></td>
					</tr>
					<tr>					
						<td><%= gia %> </td>					
						<td>
							<form action="giohang.jsp?<%=ms%>&tg=<%=tg%>&ts=<%=ts%>&gia=<%=gia%>&img=<%=anh%>" method="post">
								Số lượng: <input type="number" name="txtSoluong" value = "<%=request.getParameter("txtSoluong") == null ? "1" : request.getParameter("txtSoluong") %>" size="2">
								<input type = "submit" name = "btnCapnhat" value = "Cập nhật">
							</form>						
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	
	<%
		GioHangBo gh1 = (GioHangBo) session.getAttribute("gh");
		for (GioHangBean g1 : gh1.ds){
			out.print(g1.getMaSach() + " --- " + g1.getSlMua() + "<hr>");
		}
	%>
	
	<hr  width="30%" align="left" style="height:2px; border-width:0; color:gray; background-color:gray; margin-left: 20px"/>
	<% 
		String sl = request.getParameter("txtSoluong");
		if (sl == null){
			sl = "1";
		}
		int sluong = Integer.parseInt(sl);
		long giaban = sluong * gia;
	%>
	<br>
	<p style="font-weight: bold;margin-left: 20px"> Tổng tiền: <%= giaban %> vnđ<p>
</body>
</html>