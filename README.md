# Advanced Java Programming - Practical Exam Programs

This repository contains clean, concise, and tested solutions for all 15 practical exam questions across Unit 1 and Unit 2.

- **Exam-Optimized:** Each program in Unit 2 is in its **own isolated folder** (`unit2/prog05_javabean`, `unit2/prog06_xml_nodes`, etc.).
- **Ultra-Concise Code:** Stripped of unnecessary boilerplate (using `throws Exception`), averaging just 10–22 lines per program for easy memorization.
- **Windows-Ready (Default on `main`):** Includes ready-to-use `.bat` runners for Windows lab environments.
- **Linux Users:** Switch to the [`linux`](https://github.com/revanthlol/ajpp/tree/linux) branch (`git checkout linux`) for Linux bash runners and `:` classpath configurations.

---

## One-Click Execution (Windows)

- Double click **`test_all.bat`** in File Explorer
- OR run in Command Prompt:
  ```cmd
  test_all.bat
  ```

---

## Directory Structure

```
ajpp/
├── lib/
│   ├── javax.servlet-api-4.0.1.jar       # Servlet API library
│   └── sqlite-jdbc.jar                   # Standalone JDBC driver
├── test_all.bat                          # Master test runner (Windows)
├── unit1/                                # Unit 1 Core Collection Programs
│   ├── Prog01_IteratorDemo.java
│   ├── Prog02_ComparableDemo.java
│   ├── Prog03_MapComparison.java
│   └── Prog04_ListMethodsDemo.java
└── unit2/                                # Unit 2 Programs (isolated folders)
    ├── prog05_javabean/
    ├── prog06_xml_nodes/
    ├── prog07_dom_tree/
    ├── prog08_servlet_hello/
    ├── prog09_servlet_calculator/
    ├── prog10_servlet_login/
    ├── prog11_jsp_hits/
    ├── prog12_jsp_tags/
    ├── prog13_jdbc_create_table/
    ├── prog14_jdbc_insert/
    └── prog15_jdbc_select/
```

---

## Unit 2 Programs Quick Reference

| # | Topic | Folder Name | Windows Runner |
|---|---|---|---|
| **5** | **JavaBean (JellyBean)** | `unit2/prog05_javabean` | Double-click `run.bat` |
| **6** | **XML Root & Child Nodes** | `unit2/prog06_xml_nodes` | Double-click `run.bat` |
| **7** | **DOM Tree View** | `unit2/prog07_dom_tree` | Double-click `run.bat` |
| **8** | **Servlet: Hello World** | `unit2/prog08_servlet_hello` | Double-click `compile.bat` |
| **9** | **Servlet: Calculator** | `unit2/prog09_servlet_calculator` | Double-click `compile.bat` |
| **10** | **Servlet: Login Parameters** | `unit2/prog10_servlet_login` | Double-click `compile.bat` |
| **11** | **JSP: Hit Counter** | `unit2/prog11_jsp_hits` | Copy `hits.jsp` to Tomcat `webapps/ROOT/` |
| **12** | **JSP: Tags Demo** | `unit2/prog12_jsp_tags` | Copy `tags.jsp` to Tomcat `webapps/ROOT/` |
| **13** | **JDBC: Create Table** | `unit2/prog13_jdbc_create_table`| Double-click `run.bat` |
| **14** | **JDBC: Insert Data** | `unit2/prog14_jdbc_insert` | Double-click `run.bat` |
| **15** | **JDBC: Select Data** | `unit2/prog15_jdbc_select` | Double-click `run.bat` |

---

## For Linux Users
Switch to the Linux branch:
```bash
git checkout linux
chmod +x test_all.sh
./test_all.sh
```
