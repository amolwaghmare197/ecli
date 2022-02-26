package a1;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/B")
public class B extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		HttpSession ses = req.getSession();
		ses.setAttribute("session", "no hike");
         req.setAttribute("msg", "hike");
          RequestDispatcher rd  =req.getRequestDispatcher("/C");
          rd.forward(req, res);
	}
}
