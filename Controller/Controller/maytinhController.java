package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class maytinhController
 */
@WebServlet("/maytinhController")
public class maytinhController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public maytinhController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Lay du lieu tu jsp gui len :
				String tama=request.getParameter("txta");
				String tamb=request.getParameter("txtb");
				if(tama==null) {
					RequestDispatcher rd= request.getRequestDispatcher("maytinh.jsp");
					rd.forward(request, response);
				}else {
		long kq=0;
					if(request.getParameter("butcong")!=null) {
						kq=Long.parseLong(tama)+Long.parseLong(tamb);
						request.setAttribute("kq", kq);//Tao ra 1 bien request de truyn ve jsp
						RequestDispatcher rd= request.getRequestDispatcher("maytinh.jsp");
						rd.forward(request, response);
					}
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
