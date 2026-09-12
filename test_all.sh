#!/bin/bash
# test_all.sh - Runs all non-web practical exam programs

echo "=========================================================="
echo "          ADVANCED JAVA PRACTICAL EXAM RUNNER             "
echo "=========================================================="

echo -e "\n[1/7] Running Unit 1 - Program 1 (Iterator Demo)..."
java -cp unit1 Prog01_IteratorDemo

echo -e "\n[2/7] Running Unit 1 - Program 2 (Comparable Interface)..."
java -cp unit1 Prog02_ComparableDemo

echo -e "\n[3/7] Running Unit 1 - Program 3 (Map Comparison)..."
java -cp unit1 Prog03_MapComparison

echo -e "\n[4/7] Running Unit 1 - Program 4 (List Methods)..."
java -cp unit1 Prog04_ListMethodsDemo

echo -e "\n[5/7] Running Unit 2 - Program 5 (JavaBean Demo)..."
java -cp unit2 Prog05_JavaBeanDemo

echo -e "\n[6/7] Running Unit 2 - Program 6 (XML Root & Child Nodes)..."
java -cp unit2 Prog06_XMLRootChildNodes

echo -e "\n[7/7] Running Unit 2 - Program 7 (DOM Tree Structure)..."
java -cp unit2 Prog07_DOMTreeView

echo -e "\n[JDBC] Running Database Programs (Table -> Insert -> Select)..."
rm -f college.db
java -cp "unit2/jdbc:lib/sqlite-jdbc.jar" Prog13_CreateTable
java -cp "unit2/jdbc:lib/sqlite-jdbc.jar" Prog14_InsertData
java -cp "unit2/jdbc:lib/sqlite-jdbc.jar" Prog15_SelectData

echo -e "\n=========================================================="
echo "          ALL CONSOLE PROGRAMS EXECUTED SUCCESSFULLY!      "
echo "=========================================================="
