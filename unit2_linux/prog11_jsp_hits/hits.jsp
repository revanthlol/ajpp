<%@ page language="java" %>
<html>
<body>
    <%-- Declarative tag: retains count across multiple visits --%>
    <%! int count = 0; %>

    <%-- Scriptlet tag: increments count on each visit --%>
    <% count++; %>

    <h1>Hello World</h1>
    <p>Total Hits: <%= count %></p>
</body>
</html>
