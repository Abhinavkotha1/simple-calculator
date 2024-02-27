/**
 * 
 */
package abhinavkotha;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * 
 */
public class SimplecalculatorServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=Integer.parseInt(req.getParameter("act"));
		int o=0;
		PrintWriter out=res.getWriter();
		switch(k) {
			case 1:
				o=i+j;
				out.println("result is:"+o);
				break;
			case 2:
				o=i-j;
				out.println("result is:"+o);
				break;
			case 3:
				o=i*j;
				out.println("result is:"+o);
				break;
			case 4:
				if(j!=0) {o=i/j;
				out.println("result is:"+o);}
				else {out.println("2nd number should not be 0");}
				break;
			default:
				out.println("enter valid action");
		}
	}
	
}
