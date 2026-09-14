@echo off
REM ==========================================================
REM      ADVANCED JAVA PRACTICAL EXAM RUNNER (WINDOWS)        
REM ==========================================================
echo ==========================================================
echo      ADVANCED JAVA PRACTICAL EXAM RUNNER (WINDOWS)        
echo ==========================================================

echo.
echo --- UNIT 1 ---
echo [1/4] Unit 1 - Program 1 (Iterator Demo)...
javac unit1\Prog01_IteratorDemo.java
java -cp unit1 Prog01_IteratorDemo

echo.
echo [2/4] Unit 1 - Program 2 (Comparable Interface)...
javac unit1\Prog02_ComparableDemo.java
java -cp unit1 Prog02_ComparableDemo

echo.
echo [3/4] Unit 1 - Program 3 (Map Comparison)...
javac unit1\Prog03_MapComparison.java
java -cp unit1 Prog03_MapComparison

echo.
echo [4/4] Unit 1 - Program 4 (List Methods)...
javac unit1\Prog04_ListMethodsDemo.java
java -cp unit1 Prog04_ListMethodsDemo

echo.
echo --- UNIT 2 ---
echo [1/6] Program 5 (JavaBean: JellyBean + JAR)...
pushd unit2\prog05_javabean
javac JellyBeanDemo.java
jar cfm JellyBean.jar manifest.mft JellyBean.class
echo JellyBean compiled and packaged with manifest.mft successfully.
popd

echo.
echo [2/6] Program 6 (XML Root & Child Nodes)...
pushd unit2\prog06_xml_nodes
javac XMLNodes.java
java XMLNodes
popd

echo.
echo [3/6] Program 7 (DOM Tree Structure)...
pushd unit2\prog07_dom_tree
javac DOMTreeView.java
java DOMTreeView
popd

echo.
echo [4/6] Compiling Servlets (Prog 8, 9, 10)...
javac -cp "lib\javax.servlet-api-4.0.1.jar;." unit2\prog08_servlet_hello\HelloServlet.java
javac -cp "lib\javax.servlet-api-4.0.1.jar;." unit2\prog09_servlet_calculator\CalcServlet.java
javac -cp "lib\javax.servlet-api-4.0.1.jar;." unit2\prog10_servlet_login\LoginServlet.java

echo.
echo [5/6] Running JDBC Create Table & Insert Data...
pushd unit2\prog13_jdbc_create_table
javac -cp "..\..\lib\sqlite-jdbc.jar;." CreateTable.java
java -cp "..\..\lib\sqlite-jdbc.jar;." CreateTable
popd

pushd unit2\prog14_jdbc_insert
javac -cp "..\..\lib\sqlite-jdbc.jar;." InsertData.java
java -cp "..\..\lib\sqlite-jdbc.jar;." InsertData
popd

echo.
echo [6/6] Running JDBC Select Data...
pushd unit2\prog15_jdbc_select
javac -cp "..\..\lib\sqlite-jdbc.jar;." SelectData.java
java -cp "..\..\lib\sqlite-jdbc.jar;." SelectData
popd

REM Clean temporary build files
del /s /q *.class >nul 2>&1
del /s /q *.db >nul 2>&1
del /s /q unit2\prog05_javabean\*.jar >nul 2>&1

echo.
echo ==========================================================
echo          ALL PROGRAMS EXECUTED SUCCESSFULLY!              
echo ==========================================================
pause
