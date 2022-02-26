package a1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/C")
public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public C() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter wr = res.getWriter();
         wr.println("hiii");
         int id = Integer.parseInt(req.getParameter("id"));
 		wr.println(id);
         String fname =req.getParameter("fname");
         wr.println(fname);
         String lname =req.getParameter("lname");
         wr.println(lname);
         String address =req.getParameter("address");
         wr.println(address);
         int no = Integer.parseInt(req.getParameter("no"));
         wr.println(no);
         String str = (String)req.getAttribute("msg");
         wr.println(str);
         HttpSession seso = req.getSession();
         String str2 = (String)seso.getAttribute("Session");
         wr.println(str2);
	}

}
