package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/factorial")
@SuppressWarnings("serial")
public class FactorialServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int num=Integer.parseInt(req.getParameter("num"));
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		pw.print("The factorial of "+num+" is "+fact);
	}
	
}