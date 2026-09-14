<%@ page language="java" %>
<html>
<body>
    <%-- 1. Declarative Tag: declares variables or methods --%>
    <%! int square(int n) { return n * n; } %>

    <%-- 2. Scriptlet Tag: Java logic/statements --%>
    <%
        int a = 10;
        int b = 20;
        int sum = a + b;
    %>

    <%-- 3. Expression Tag: evaluates and prints directly --%>
    <h2>JSP Tags Demo</h2>
    <p>Sum of 10 and 20: <%= sum %></p>
    <p>Square of 5: <%= square(5) %></p>
</body>
</html>
