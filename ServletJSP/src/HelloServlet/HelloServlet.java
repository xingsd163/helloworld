package HelloServlet;

/**
 * Java EE 6 �е� Servlet �汾�� 3.0���� web.xml �п��Կ�����
 * JAVA EE 5 �е� Servlet �汾�� 2.5
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
			out.print(
					"<span style='color:red'>"+"Hello World"+"</span>"
					);
			out.close();
		
		
	}

}
