package hoge;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="mysrv",urlPatterns="/mysrv")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			  throws ServletException, IOException {
		resp.getWriter().println("hello");
	}
	
}
