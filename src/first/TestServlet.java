package first;

import java.io.PrintStream;
import java.net.HttpRetryException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet extends HttpServlet{
	
	//重写init()方法
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	//响应客户端请求的方法
	public void service(HttpServletRequest request,HttpServletResponse response){
		try {
			System.out.println("第一个Servlet");
			PrintStream out = new PrintStream(response.getOutputStream());
			out.println("<html>");
			out.println("<head>");
			out.println("<title>访问Servlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div>hahaha</div>");
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
