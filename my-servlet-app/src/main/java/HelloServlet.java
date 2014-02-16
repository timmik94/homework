import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: тимур
 * Date: 16.02.14
 * Time: 18:41
 * To change this template use File | Settings | File Templates.
 */
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
        String name=request.getParameter("name");
        if(name==null){name="smit";}
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<html><body><h1> HELLO "  + name + "! </h1></body></html>");
        out.close();
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException {
        String name=request.getParameter("name");
        if(name==null){name="smit";}
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<html><body><h1> HELLO "  + name + "! </h1></body></html>");
        out.close();
    }
}
