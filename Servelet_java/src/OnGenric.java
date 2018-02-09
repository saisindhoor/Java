
import java.io.IOException;
import java.io.PrintWriter;
 



import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class OnGenric extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
 {
 res.setContentType("text/html");
 PrintWriter pw=res.getWriter();
 pw.println("This is first servlet program on GenericServlet___Java4s.com");
 pw.close();
 }
 
}
