package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhachHangbeab;
import bean.loaibean;
import bean.sachbean;
import bo.KhachHangbo;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class HtsachCtroller
 */
@WebServlet("/HtsachCtroller")
public class HtsachCtroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HtsachCtroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.setCharacterEncoding("utf-8")  ;
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
			ArrayList<loaibean> dsloai = lbo.getloai();
			KhachHangbeab dsDn = null;
			HttpSession session = request.getSession();
			if (un != null && pass != null) {
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
			
			request.setAttribute("dsloai", dsloai);
			request.setAttribute("dssach", ds);
			RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
			rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
