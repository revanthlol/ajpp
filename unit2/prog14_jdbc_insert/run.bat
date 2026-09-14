@echo off
javac -cp "..\..\lib\sqlite-jdbc.jar;." InsertData.java
java -cp "..\..\lib\sqlite-jdbc.jar;." InsertData
pause
