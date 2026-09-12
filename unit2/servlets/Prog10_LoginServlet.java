// Prog10_LoginServlet.java
// Unit 2: Write a Servlet program to display/read parameters from a login page.

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Prog10_LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 1. Read parameters sent by the login HTML form
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        out.println("<html>");
        out.println("<head><title>Login Status</title></head>");
        out.println("<body style='font-family: Arial; margin: 40px;'>");
        out.println("<h2>Login Parameters Received</h2>");

        // 2. Display the received parameters
        out.println("<p><b>Username entered:</b> " + user + "</p>");
        out.println("<p><b>Password length:</b> " + (pass != null ? pass.length() : 0) + " characters</p>");

        out.println("<hr>");

        // 3. Simple credential authentication demonstration
        if ("admin".equalsIgnoreCase(user) && "admin123".equals(pass)) {
            out.println("<h3 style='color: green;'>Authentication Successful!</h3>");
            out.println("<p>Welcome back, " + user + "!</p>");
        } else {
            out.println("<h3 style='color: red;'>Authentication Failed!</h3>");
            out.println("<p>Invalid username or password. Please try again.</p>");
        }

        out.println("<br><a href='login.html'>&larr; Back to Login Page</a>");
        out.println("</body>");
        out.println("</html>");
    }

    // Redirect GET requests to login.html
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.html");
    }
}
