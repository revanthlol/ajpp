// CalcServlet.java - Q9: Arithmetic operations Servlet
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        double a = Double.parseDouble(req.getParameter("num1"));
        double b = Double.parseDouble(req.getParameter("num2"));
        String op = req.getParameter("op");
        double ans = 0;

        if (op.equals("+")) ans = a + b;
        else if (op.equals("-")) ans = a - b;
        else if (op.equals("*")) ans = a * b;
        else if (op.equals("/") && b != 0) ans = a / b;

        out.println("<h2>Result: " + a + " " + op + " " + b + " = " + ans + "</h2>");
        out.println("<br><a href='calc.html'>Back</a>");
    }
}
