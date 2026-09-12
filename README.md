# Advanced Java Programming - Practical Exam Programs

This repository contains concise, well-documented, and thoroughly tested solutions for all 15 practical exam questions across Unit 1 and Unit 2, fully compatible with **both Windows and Linux**.

---

## One-Click Execution

### On Linux / macOS:
```bash
chmod +x test_all.sh
./test_all.sh
```

### On Windows:
- Double click **`test_all.bat`** in File Explorer
- OR in Command Prompt: `test_all.bat`
- OR in PowerShell: `.\test_all.ps1`

---

## Cross-Platform Differences Explained

| Feature | Linux / macOS | Windows (CMD / PowerShell) |
| :--- | :--- | :--- |
| **Classpath Separator** | Colon (`:`) | Semicolon (`;`) |
| **Path Separator** | Forward slash (`/`) | Backslash (`\`) or (`/`) |
| **JDBC Classpath Example** | `-cp "unit2/jdbc:lib/sqlite-jdbc.jar"` | `-cp "unit2\jdbc;lib\sqlite-jdbc.jar"` |
| **Deleting Temp DB** | `rm -f college.db` | `del /f /q college.db` |

> *Note:* In Java source code, file paths have been implemented using `File.separator` and embedded fallbacks so that programs compile and run identically on both Windows and Linux without any manual path adjustments.

---

## Directory Structure

```
ajpp/
├── lib/
│   ├── javax.servlet-api-4.0.1.jar   # Servlet API for compilation
│   └── sqlite-jdbc.jar               # Standalone JDBC driver
├── test_all.sh                       # One-click execution script (Linux / Mac)
├── test_all.bat                      # One-click execution script (Windows CMD)
├── test_all.ps1                      # One-click execution script (Windows PowerShell)
├── programs.txt                      # Original exam question list
├── unit1/
│   ├── Prog01_IteratorDemo.java      # Q1: Collection using Iterator
│   ├── Prog02_ComparableDemo.java    # Q2: Comparable interface
│   ├── Prog03_MapComparison.java     # Q3: HashMap vs LinkedHashMap vs TreeMap
│   └── Prog04_ListMethodsDemo.java   # Q4: ArrayList and LinkedList methods
└── unit2/
    ├── sample.xml                    # Sample XML file for XML questions
    ├── Prog05_JavaBeanDemo.java      # Q5: Simple JavaBean
    ├── Prog06_XMLRootChildNodes.java # Q6: XML root and child nodes display
    ├── Prog07_DOMTreeView.java       # Q7: Hierarchical DOM tree viewer
    ├── servlets/
    │   ├── Prog08_HelloWorldServlet.java # Q8: Hello World Servlet
    │   ├── Prog09_ArithmeticServlet.java # Q9: Arithmetic calculator Servlet
    │   ├── calc.html                     # HTML form for calculator
    │   ├── Prog10_LoginServlet.java      # Q10: Read login parameters Servlet
    │   ├── login.html                    # HTML form for login
    │   └── web.xml                       # Standard deployment descriptor
    ├── jsp/
    │   ├── Prog11_HelloWorldHits.jsp # Q11: Hello World and hit counter
    │   └── Prog12_JSPTagsDemo.jsp    # Q12: Declarative, Scriptlet & Expression tags
    └── jdbc/
        ├── Prog13_CreateTable.java   # Q13: JDBC Create Table
        ├── Prog14_InsertData.java    # Q14: JDBC Insert Data
        └── Prog15_SelectData.java    # Q15: JDBC Select Data
```

---

## Index of Programs

### Unit 1
- **Program 1:** [Access a collection using an Iterator](unit1/Prog01_IteratorDemo.java)
- **Program 2:** [Implement the Comparable interface](unit1/Prog02_ComparableDemo.java)
- **Program 3:** [Differentiate between different Map classes](unit1/Prog03_MapComparison.java)
- **Program 4:** [Methods of LinkedList and ArrayList](unit1/Prog04_ListMethodsDemo.java)

### Unit 2
- **Program 5:** [Create a simple JavaBean](unit2/Prog05_JavaBeanDemo.java)
- **Program 6:** [Display root node and child nodes of XML document](unit2/Prog06_XMLRootChildNodes.java)
- **Program 7:** [View DOM tree hierarchy](unit2/Prog07_DOMTreeView.java)
- **Program 8:** [Servlet: Display "Hello World"](unit2/servlets/Prog08_HelloWorldServlet.java)
- **Program 9:** [Servlet: Arithmetic operations](unit2/servlets/Prog09_ArithmeticServlet.java)
- **Program 10:** [Servlet: Read parameters from login page](unit2/servlets/Prog10_LoginServlet.java)
- **Program 11:** [JSP: Hello World and number of hits](unit2/jsp/Prog11_HelloWorldHits.jsp)
- **Program 12:** [JSP: Scriptlet, Expression, and Declarative tags](unit2/jsp/Prog12_JSPTagsDemo.jsp)
- **Program 13:** [JDBC: Create table in database](unit2/jdbc/Prog13_CreateTable.java)
- **Program 14:** [JDBC: Insert data into table](unit2/jdbc/Prog14_InsertData.java)
- **Program 15:** [JDBC: SELECT operation on database](unit2/jdbc/Prog15_SelectData.java)

---

## Compilation & Execution Commands

### Unit 1 (Both Windows & Linux)
```bash
# Program 1
javac unit1/Prog01_IteratorDemo.java
java -cp unit1 Prog01_IteratorDemo

# Program 2
javac unit1/Prog02_ComparableDemo.java
java -cp unit1 Prog02_ComparableDemo

# Program 3
javac unit1/Prog03_MapComparison.java
java -cp unit1 Prog03_MapComparison

# Program 4
javac unit1/Prog04_ListMethodsDemo.java
java -cp unit1 Prog04_ListMethodsDemo
```

### Unit 2 (XML & JavaBean)
```bash
# Program 5
javac unit2/Prog05_JavaBeanDemo.java
java -cp unit2 Prog05_JavaBeanDemo

# Program 6
javac unit2/Prog06_XMLRootChildNodes.java
java -cp unit2 Prog06_XMLRootChildNodes

# Program 7
javac unit2/Prog07_DOMTreeView.java
java -cp unit2 Prog07_DOMTreeView
```

### Unit 2 JDBC Programs

#### On Linux / macOS:
```bash
javac -cp lib/sqlite-jdbc.jar unit2/jdbc/*.java

# Run Q13 (Create Table)
java -cp "unit2/jdbc:lib/sqlite-jdbc.jar" Prog13_CreateTable

# Run Q14 (Insert Data)
java -cp "unit2/jdbc:lib/sqlite-jdbc.jar" Prog14_InsertData

# Run Q15 (Select Data)
java -cp "unit2/jdbc:lib/sqlite-jdbc.jar" Prog15_SelectData
```

#### On Windows (CMD or PowerShell):
```cmd
javac -cp "lib\sqlite-jdbc.jar" unit2\jdbc\*.java

# Run Q13 (Create Table)
java -cp "unit2\jdbc;lib\sqlite-jdbc.jar" Prog13_CreateTable

# Run Q14 (Insert Data)
java -cp "unit2\jdbc;lib\sqlite-jdbc.jar" Prog14_InsertData

# Run Q15 (Select Data)
java -cp "unit2\jdbc;lib\sqlite-jdbc.jar" Prog15_SelectData
```

> **Note for College Labs (MySQL):**
> Each JDBC file contains pre-commented MySQL credentials. To switch to MySQL in your college lab, simply uncomment the MySQL lines at the top of the file:
> ```java
> static final String DRIVER = "com.mysql.cj.jdbc.Driver";
> static final String URL = "jdbc:mysql://localhost:3306/collegedb";
> static final String USER = "root";
> static final String PASS = "root";
> ```
