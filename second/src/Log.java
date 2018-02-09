

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Log extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  
	
	{
		response.setContentType("text/Html");
	PrintWriter out = response.getWriter();
	 out.println("this is my first java");
	
		
	}	
		
	

}
