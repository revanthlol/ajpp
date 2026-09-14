// LoginServlet.java - Q10: Read login parameters Servlet
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        out.println("<h2>Username Entered: " + user + "</h2>");
        out.println("<h2>Password Entered: " + pass + "</h2>");

        if ("admin".equals(user) && "admin123".equals(pass)) {
            out.println("<h3 style='color:green;'>Login Successful!</h3>");
        } else {
            out.println("<h3 style='color:red;'>Invalid Credentials!</h3>");
        }
        out.println("<br><a href='login.html'>Back</a>");
    }
}
