<%-- Prog12_JSPTagsDemo.jsp --%>
<%-- Unit 2: Write a JSP program to demonstrate Scriptlet, Expression, and Declarative tags. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Tags Demonstration</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; background-color: #f4f6f9; }
        .section { background: white; padding: 15px 25px; margin-bottom: 20px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1); }
        h2 { color: #2c3e50; }
        code { background: #eee; padding: 2px 6px; border-radius: 4px; font-weight: bold; }
        .result { color: #27ae60; font-weight: bold; }
    </style>
</head>
<body>

    <h1>Demonstration of JSP Tags</h1>

    <%-- ================================================================
         1. DECLARATIVE TAG: <%! ... %>
         Used to declare variables and methods at the class/servlet level.
         ================================================================ --%>
    <%!
        // Class-level field
        int accessCount = 0;

        // Class-level method
        int calculateCube(int n) {
            return n * n * n;
        }
    %>
    <div class="section">
        <h2>1. Declarative Tag: <code>&lt;%! ... %&gt;</code></h2>
        <p>Declares class-level instance variables and helper methods.</p>
        <p>Declared method: <code>int calculateCube(int n) { return n * n * n; }</code></p>
    </div>


    <%-- ================================================================
         2. SCRIPTLET TAG: <% ... %>
         Used to execute multiple Java statements inside _jspService().
         ================================================================ --%>
    <%
        accessCount++;
        int a = 20;
        int b = 30;
        int total = a + b;
        String greeting = "Welcome to Java Server Pages!";
    %>
    <div class="section">
        <h2>2. Scriptlet Tag: <code>&lt;% ... %&gt;</code></h2>
        <p>Executes arbitrary Java statements, loops, or logic.</p>
        <p>Code executed: <code>accessCount++; int a = 20, b = 30; int total = a + b;</code></p>
    </div>


    <%-- ================================================================
         3. EXPRESSION TAG: <%= ... %>
         Evaluates an expression, converts to String, and prints output.
         NOTE: Never ends with a semicolon!
         ================================================================ --%>
    <div class="section">
        <h2>3. Expression Tag: <code>&lt;%= ... %&gt;</code></h2>
        <p>Directly renders expression output into HTML response.</p>
        <ul>
            <li>Greeting: <span class="result"><%= greeting %></span></li>
            <li>Sum of <%= a %> and <%= b %>: <span class="result"><%= total %></span></li>
            <li>Cube of 4 using declared method: <span class="result"><%= calculateCube(4) %></span></li>
            <li>Total Page Accesses: <span class="result"><%= accessCount %></span></li>
            <li>Current Server Time: <span class="result"><%= new java.util.Date() %></span></li>
        </ul>
    </div>

</body>
</html>
