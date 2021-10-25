
<%@page import="bean.GioHangBean"%>
<%@page import="bo.GioHangBo"%>
<%@page import="bean.loaibean"%>
<%@page import="bean.KhachHangbeab"%>
<%@page import="bean.sachbean"%>
<%@page import="bo.KhachHangbo"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.sachbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>


<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<title>Quản lí nhà sách</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="CSS/menu.css" rel="stylesheet" type="text/css">
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
	loaibo lbo = new loaibo();
	KhachHangbo khbo = new KhachHangbo();
	ArrayList<sachbean> ds = sbo.getsach();
	ArrayList<KhachHangbeab> kh = khbo.getKhachHang();
	String ml = request.getParameter("ml");
	String key = request.getParameter("txttk");
	String un = request.getParameter("txtun");
	String pass = request.getParameter("txtpass");
	//out.print(mk + "---"  + tentk);
	KhachHangbeab dsDn = null;
	if (un != null && pass != null){
		dsDn = khbo.ktdn(un, pass);
		if (dsDn != null)
			session.setAttribute("kh", dsDn);
		else
			session.setAttribute("tb", "Dang nhap sai");
	}

	if (ml != null)
		ds = sbo.TimLoai(ml);
	else if (key != null)
		ds = sbo.Tim(key);
	%>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Trang chủ</a></li>
				<li><a href="#">Mua hàng</a></li>
				<li><a href="#">Thanh toán</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>Đăng
						ký</a></li>
				<li>
					<%
					KhachHangbeab Kh = (KhachHangbeab) session.getAttribute("kh");
					if (Kh != null) {
					%> <a>Xin chao: <%=Kh.getHoten()%></a> <%
					} else {
					%>
					<a href="#" data-toggle="modal" data-target="#myModal"><span
						class="glyphicon glyphicon-log-in"></span> Đăng nhập</a> <%
						 if (session.getAttribute("tb") != null) {
						 	out.print("<script>alert('" + session.getAttribute("tb") + "');</script>");
						 }
					 }
					 %>
				</li>
			</ul>
		</div>
	</nav>
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Đăng nhập</h4>
				</div>
				<div class="modal-body">
					<form method="post" action="menu.jsp">
						Tên đăng nhập: <input type="text" name="txtun"
							class="form-control"> <br> Mật khẩu: <input
							type="password" name="txtpass" class="form-control"> <br>
						<input type="submit" name="button1" value="Đăng nhập"
							class="btn-primary">
					</form>
				</div>
			</div>
		</div>
	</div>

	<table align="center" cellspacing="0" width="1000" border="1">
		<tr>
			<td valign="top" width="400">
				<table class="table table-hover">

					<%
					for (loaibean loai : lbo.getloai()) {
						%>
						<tr>
							<td><a href="menu.jsp?ml=<%=loai.getMaloai()%>"> <%=loai.getTenloai()%>
							</a></td>
						</tr>
					<%	
					}
					%>
				</table>
			</td>
			<td valign="top" width="600">
				<table class="table table-hover">
			     <%
				     GioHangBo gh1=(GioHangBo)session.getAttribute("gh");
				     for(GioHangBean g1: gh1.ds){%>
				     <tr>
				  
				     <form method="post" action="sua.jsp?ms=<%=g1.getMaSach() %>">
                      <td><%=g1.getMaSach() %></td>
       <td><%=g1.getTenSach() %></td>
        <td><%=g1.getTacGia() %></td>
         <td><%=g1.getSlMua() %></td>
         <td> <input type="number" name="txtsl" width="20">
         		<input type="submit" name="butsua" value="+" class="btn-link">
         </td>
 <td><%=g1.getGia() %></td>
           <td><%=g1.getThanhTien() %></td>
            <td><input type="submit" name="butxoa" value="Xóa" class="btn-link"></td>
            </form>
				     </tr>
				    <%} %>
			  </table>	
			  		
		 </td>
	</table>
	
	<p align="center" style="font-size: 30; font-weight: bold; color: blue; margin-top: 10px" id="tong-tien">Tổng tiền: <%= gh1.TongTien()%></p>
</body>
</html>