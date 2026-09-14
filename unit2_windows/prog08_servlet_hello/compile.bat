@echo off
REM Compiles using servlet-api jar
javac -cp "..\..\lib\javax.servlet-api-4.0.1.jar;." HelloServlet.java
echo HelloServlet compiled successfully.
pause
