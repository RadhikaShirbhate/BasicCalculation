package Test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/square")
@SuppressWarnings("serial")
public class SquareServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int num=Integer.parseInt(req.getParameter("num"));
		pw.print(num+" Square is : "+(num*num));
	}
	

}