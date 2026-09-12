// Prog09_ArithmeticServlet.java
// Unit 2: Write a Servlet program to display arithmetic operations.

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class Prog09_ArithmeticServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 1. Read request parameters from the form
        String str1 = request.getParameter("num1");
        String str2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        out.println("<html>");
        out.println("<head><title>Calculation Result</title></head>");
        out.println("<body style='font-family: Arial; margin: 40px;'>");
        out.println("<h2>Calculation Result</h2>");

        try {
            double n1 = Double.parseDouble(str1);
            double n2 = Double.parseDouble(str2);
            double result = 0;
            String opSymbol = "";
            boolean valid = true;

            // 2. Perform selected arithmetic operation
            switch (operation) {
                case "add":
                    result = n1 + n2;
                    opSymbol = "+";
                    break;
                case "sub":
                    result = n1 - n2;
                    opSymbol = "-";
                    break;
                case "mul":
                    result = n1 * n2;
                    opSymbol = "*";
                    break;
                case "div":
                    if (n2 == 0) {
                        out.println("<p style='color:red;'>Error: Division by zero is not allowed!</p>");
                        valid = false;
                    } else {
                        result = n1 / n2;
                        opSymbol = "/";
                    }
                    break;
                default:
                    out.println("<p style='color:red;'>Invalid operation!</p>");
                    valid = false;
            }

            // 3. Display result
            if (valid) {
                out.println("<p><b>Expression:</b> " + n1 + " " + opSymbol + " " + n2 + "</p>");
                out.println("<h3 style='color: green;'>Result: " + result + "</h3>");
            }

        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Error: Please enter valid numbers.</p>");
        }

        out.println("<br><a href='calc.html'>&larr; Back to Calculator</a>");
        out.println("</body>");
        out.println("</html>");
    }

    // Redirect GET requests to the HTML form
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("calc.html");
    }
}
