@echo off
REM ==========================================================
REM          ADVANCED JAVA PRACTICAL EXAM RUNNER (WINDOWS)     
REM ==========================================================
echo ==========================================================
echo           ADVANCED JAVA PRACTICAL EXAM RUNNER             
echo ==========================================================

echo.
echo [1/7] Running Unit 1 - Program 1 (Iterator Demo)...
javac unit1\Prog01_IteratorDemo.java
java -cp unit1 Prog01_IteratorDemo

echo.
echo [2/7] Running Unit 1 - Program 2 (Comparable Interface)...
javac unit1\Prog02_ComparableDemo.java
java -cp unit1 Prog02_ComparableDemo

echo.
echo [3/7] Running Unit 1 - Program 3 (Map Comparison)...
javac unit1\Prog03_MapComparison.java
java -cp unit1 Prog03_MapComparison

echo.
echo [4/7] Running Unit 1 - Program 4 (List Methods)...
javac unit1\Prog04_ListMethodsDemo.java
java -cp unit1 Prog04_ListMethodsDemo

echo.
echo [5/7] Running Unit 2 - Program 5 (JavaBean Demo)...
javac unit2\Prog05_JavaBeanDemo.java
java -cp unit2 Prog05_JavaBeanDemo

echo.
echo [6/7] Running Unit 2 - Program 6 (XML Root & Child Nodes)...
javac unit2\Prog06_XMLRootChildNodes.java
java -cp unit2 Prog06_XMLRootChildNodes

echo.
echo [7/7] Running Unit 2 - Program 7 (DOM Tree Structure)...
javac unit2\Prog07_DOMTreeView.java
java -cp unit2 Prog07_DOMTreeView

echo.
echo [JDBC] Running Database Programs (Table -^> Insert -^> Select)...
if exist college.db del /f /q college.db
javac -cp "lib\sqlite-jdbc.jar" unit2\jdbc\*.java
java -cp "unit2\jdbc;lib\sqlite-jdbc.jar" Prog13_CreateTable
java -cp "unit2\jdbc;lib\sqlite-jdbc.jar" Prog14_InsertData
java -cp "unit2\jdbc;lib\sqlite-jdbc.jar" Prog15_SelectData

echo.
echo ==========================================================
echo           ALL CONSOLE PROGRAMS EXECUTED SUCCESSFULLY!      
echo ==========================================================
pause
