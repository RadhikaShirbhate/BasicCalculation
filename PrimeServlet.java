package Test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/prime")
@SuppressWarnings("serial")
public class PrimeServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int num=Integer.parseInt(req.getParameter("num"));
		int c=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				c++;
		}
		if(c==0)
		{
			pw.print(num+" is Prime number<br>");
		}
		else
		{
			pw.print(num+" is not a Prime number<br>");
		}
		
	}

}
