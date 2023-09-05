package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/factor")
@SuppressWarnings("serial")
public class Factor  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int num=Integer.parseInt(req.getParameter("num"));
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				al.add(i);
			}
		}
		pw.print("The factors of "+num+" are : ");
		for(int i:al)
		{
			pw.print(i+" ");
		}
	}

}
