# test_all.ps1 - PowerShell script for Windows users
Write-Host "==========================================================" -ForegroundColor Cyan
Write-Host "          ADVANCED JAVA PRACTICAL EXAM RUNNER             " -ForegroundColor Cyan
Write-Host "==========================================================" -ForegroundColor Cyan

Write-Host "`n[1/7] Running Unit 1 - Program 1 (Iterator Demo)..." -ForegroundColor Yellow
javac unit1/Prog01_IteratorDemo.java
java -cp unit1 Prog01_IteratorDemo

Write-Host "`n[2/7] Running Unit 1 - Program 2 (Comparable Interface)..." -ForegroundColor Yellow
javac unit1/Prog02_ComparableDemo.java
java -cp unit1 Prog02_ComparableDemo

Write-Host "`n[3/7] Running Unit 1 - Program 3 (Map Comparison)..." -ForegroundColor Yellow
javac unit1/Prog03_MapComparison.java
java -cp unit1 Prog03_MapComparison

Write-Host "`n[4/7] Running Unit 1 - Program 4 (List Methods)..." -ForegroundColor Yellow
javac unit1/Prog04_ListMethodsDemo.java
java -cp unit1 Prog04_ListMethodsDemo

Write-Host "`n[5/7] Running Unit 2 - Program 5 (JavaBean Demo)..." -ForegroundColor Yellow
javac unit2/Prog05_JavaBeanDemo.java
java -cp unit2 Prog05_JavaBeanDemo

Write-Host "`n[6/7] Running Unit 2 - Program 6 (XML Root & Child Nodes)..." -ForegroundColor Yellow
javac unit2/Prog06_XMLRootChildNodes.java
java -cp unit2 Prog06_XMLRootChildNodes

Write-Host "`n[7/7] Running Unit 2 - Program 7 (DOM Tree Structure)..." -ForegroundColor Yellow
javac unit2/Prog07_DOMTreeView.java
java -cp unit2 Prog07_DOMTreeView

Write-Host "`n[JDBC] Running Database Programs (Table -> Insert -> Select)..." -ForegroundColor Yellow
if (Test-Path "college.db") { Remove-Item "college.db" }
javac -cp "lib/sqlite-jdbc.jar" unit2/jdbc/*.java
java -cp "unit2/jdbc;lib/sqlite-jdbc.jar" Prog13_CreateTable
java -cp "unit2/jdbc;lib/sqlite-jdbc.jar" Prog14_InsertData
java -cp "unit2/jdbc;lib/sqlite-jdbc.jar" Prog15_SelectData

Write-Host "`n==========================================================" -ForegroundColor Green
Write-Host "          ALL CONSOLE PROGRAMS EXECUTED SUCCESSFULLY!      " -ForegroundColor Green
Write-Host "==========================================================" -ForegroundColor Green
