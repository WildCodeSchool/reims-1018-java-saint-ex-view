package Servlet;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Java.Information;
import Java.Room;
import Java.RoomList;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/index.html")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RoomList roomList;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        this.roomList = new RoomList();
    }

	/**+
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("room") == null || request.getParameter("room") == "") {
			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
		}
		else {
			int roomId = Integer.parseInt(request.getParameter("room"));
			Room room = this.roomList.getRoomById(roomId);
			
			Information info = new Information(1, "hello", "lorem ipsum");
			request.setAttribute("information", info);
			
			request.setAttribute("room", room);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/room.jsp").forward(request,response);	
		}
		
	}

}
