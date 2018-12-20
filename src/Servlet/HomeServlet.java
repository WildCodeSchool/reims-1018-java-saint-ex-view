package Servlet;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Java.Information;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/index.html")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**+
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("foo") == null || request.getParameter("foo") == "") {
			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
		}
		else {
			Information info = new Information(1, "hello", "lorem ipsum");
			request.setAttribute("information", info);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/foo.jsp").forward(request,response);	
		}
		
	}

}
