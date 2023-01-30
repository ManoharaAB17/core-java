package jan_30_Fav_person;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fav")
public class FavPerson extends HttpServlet {
	public FavPerson() {
		System.out.println("FevPerson constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname= req.getParameter("fname");
		String lname= req.getParameter("lname");
		String email = req.getParameter("gmail");
		String gender= req.getParameter("gender");
		String reason= req.getParameter("reason");
		String addr= req.getParameter("addr");
		
		req.setAttribute("fname",fname);
		req.setAttribute("lname",lname);
		req.setAttribute("email",email);
		req.setAttribute("gender",gender);
		req.setAttribute("reason",reason);
		req.setAttribute("addr",addr);
		
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");		     
		rd.forward(req, resp);
		
		
		
	}
}
