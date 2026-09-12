// Prog08_HelloWorldServlet.java
// Unit 2: Write a Servlet program to display "Hello World".

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Annotation mapping URL pattern to this servlet
@WebServlet("/hello")
public class Prog08_HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Set response content type to HTML
        response.setContentType("text/html");

        // 2. Get PrintWriter object
        PrintWriter out = response.getWriter();

        // 3. Write HTML response
        out.println("<html>");
        out.println("<head><title>Hello World Servlet</title></head>");
        out.println("<body style='font-family: Arial; text-align: center; margin-top: 50px;'>");
        out.println("<h1 style='color: #2c3e50;'>Hello World</h1>");
        out.println("<p>Welcome to Advanced Java Servlet Programming!</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
