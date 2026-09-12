<%-- Prog11_HelloWorldHits.jsp --%>
<%-- Unit 2: Write a JSP program to display "Hello World" and the number of hits. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Hello World & Hit Counter JSP</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin-top: 60px; }
        .card { display: inline-block; padding: 25px 40px; border: 2px solid #3498db; border-radius: 10px; background-color: #f8f9fa; }
        h1 { color: #2c3e50; }
        .counter { font-size: 24px; color: #e74c3c; font-weight: bold; }
    </style>
</head>
<body>

    <%-- 1. Declarative Tag: Declares variable at class level (persists across requests) --%>
    <%! 
        int hitCount = 0; 
    %>

    <%-- 2. Scriptlet Tag: Increments counter on every page visit / refresh --%>
    <% 
        hitCount++; 
    %>

    <div class="card">
        <h1>Hello World!</h1>
        <p>Welcome to Java Server Pages (JSP).</p>
        <hr>
        <p>Total Page Hits: <span class="counter"><%= hitCount %></span></p>
        <p><i>(Refresh the page to increase hit count)</i></p>
    </div>

</body>
</html>
