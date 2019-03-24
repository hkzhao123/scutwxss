package servlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends GenericServlet{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("utf-8");
        PrintWriter out = servletResponse.getWriter();
        out.print("<html>");
        out.print("<head><title>HelloWorld</title></head>");
        out.print("<body>");
        out.print("<cneter>HelloWorld</center>");
        out.print("<hr color = 'green'>");
        out.print("<center><h3>这是我第一个Servlet程序 HelloWorld!</h3></center>");
        out.print("</body>");
        out.print("</html>");
        out.flush();
        out.close();
    }
}
