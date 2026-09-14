#!/bin/bash
# test_all.sh - Runs all practical exam programs on Linux

echo "=========================================================="
echo "      ADVANCED JAVA PRACTICAL EXAM RUNNER (LINUX)         "
echo "=========================================================="

echo -e "\n--- UNIT 1 ---"
echo "[1/4] Unit 1 - Program 1 (Iterator Demo)..."
javac unit1/Prog01_IteratorDemo.java && java -cp unit1 Prog01_IteratorDemo

echo -e "\n[2/4] Unit 1 - Program 2 (Comparable Interface)..."
javac unit1/Prog02_ComparableDemo.java && java -cp unit1 Prog02_ComparableDemo

echo -e "\n[3/4] Unit 1 - Program 3 (Map Comparison)..."
javac unit1/Prog03_MapComparison.java && java -cp unit1 Prog03_MapComparison

echo -e "\n[4/4] Unit 1 - Program 4 (List Methods)..."
javac unit1/Prog04_ListMethodsDemo.java && java -cp unit1 Prog04_ListMethodsDemo

echo -e "\n--- UNIT 2 (LINUX) ---"
echo "[1/6] Program 5 (JavaBean: JellyBean + JAR)..."
(cd unit2/prog05_javabean && javac JellyBeanDemo.java && jar cfm JellyBean.jar manifest.mft JellyBean.class && echo "JellyBean compiled and packaged successfully.")

echo -e "\n[2/6] Program 6 (XML Root & Child Nodes)..."
(cd unit2/prog06_xml_nodes && ./run.sh)

echo -e "\n[3/6] Program 7 (DOM Tree Structure)..."
(cd unit2/prog07_dom_tree && ./run.sh)

echo -e "\n[4/6] Compiling Servlets (Prog 8, 9, 10)..."
(cd unit2/prog08_servlet_hello && ./compile.sh)
(cd unit2/prog09_servlet_calculator && ./compile.sh)
(cd unit2/prog10_servlet_login && ./compile.sh)

echo -e "\n[5/6] Running JDBC Create Table & Insert Data..."
(cd unit2/prog13_jdbc_create_table && ./run.sh)
(cd unit2/prog14_jdbc_insert && ./run.sh)

echo -e "\n[6/6] Running JDBC Select Data..."
(cd unit2/prog15_jdbc_select && ./run.sh)

# Clean temporary build files
find unit1 unit2 -name "*.class" -o -name "*.db" -delete 2>/dev/null

echo -e "\n=========================================================="
echo "          ALL PROGRAMS EXECUTED SUCCESSFULLY!              "
echo "=========================================================="
