import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class  gen extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/Html");
	PrintWriter out	=res.getWriter();
	out.println("this the first serlet on generic servlet");
		
	}
	
}