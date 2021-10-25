package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class testController
 */
@WebServlet("/testController")
public class testController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Tao ra doi tuong out
				PrintWriter out= response.getWriter();
				//out.print("<html><body>Hello 21.10.2021</body></html>");
				//Tao ra 1 doi tuong session
				HttpSession session=request.getSession();
				session.setAttribute("alo", "ha ha");
				String[] ds= {"Ngan","Them","ha","Thu"};
				
				request.setAttribute("dsht", ds);
				
				RequestDispatcher rd= request.getRequestDispatcher("maytinh.jsp");
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
