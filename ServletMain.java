package Test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/cal")
@SuppressWarnings("serial")
public class ServletMain extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	    String s=req.getParameter("s1");
	    pw.println(s);
	    
		switch(s)
		{
		case "prime":
			req.getRequestDispatcher("prime").forward(req, res);
			break;
		case "factor":
			req.getRequestDispatcher("factor").forward(req, res);
			break;
		case "factorial":
			req.getRequestDispatcher("factorial").forward(req, res);
			break;
		case "square":
			req.getRequestDispatcher("square").forward(req, res);
			break;
		}
		
	}

}
