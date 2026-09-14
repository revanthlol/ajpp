# Advanced Java Programming - Practical Exam Programs

This repository contains clean, concise, and tested solutions for all 15 practical exam questions across Unit 1 and Unit 2.

To make practical exam preparation completely stress-free:
1. **Each program in Unit 2 is in its OWN isolated folder.** When you pick a question in your exam, you only need to open that single folder.
2. **Dedicated OS Versions:**
   - [`unit2_linux/`](unit2_linux/): Configured with Linux bash scripts (`run.sh` / `compile.sh`) and `:` classpath.
   - [`unit2_windows/`](unit2_windows/): Configured with Windows batch scripts (`run.bat` / `compile.bat`) and `;` classpath.
3. **Ultra-Concise Code:** All unnecessary boilerplate and verbose try-catches have been eliminated (using `throws Exception`), bringing programs down to ~15-20 lines so they are easy to memorize and write by hand on exam answer sheets.

---

## One-Click Execution (Run All)

### On Linux / macOS:
```bash
chmod +x test_all.sh
./test_all.sh
```

### On Windows:
- Double click **`test_all.bat`** in File Explorer
- OR run in Command Prompt: `test_all.bat`

---

## Directory Structure

```
ajpp/
├── lib/
│   ├── javax.servlet-api-4.0.1.jar       # Servlet API library
│   └── sqlite-jdbc.jar                   # Standalone JDBC driver
├── test_all.sh                           # Master test script (Linux)
├── test_all.bat                          # Master test script (Windows)
├── unit1/                                # Unit 1 Core Collection Programs
│   ├── Prog01_IteratorDemo.java
│   ├── Prog02_ComparableDemo.java
│   ├── Prog03_MapComparison.java
│   └── Prog04_ListMethodsDemo.java
├── unit2_linux/                          # Unit 2 for Linux Labs (isolated folders)
│   ├── prog05_javabean/
│   ├── prog06_xml_nodes/
│   ├── prog07_dom_tree/
│   ├── prog08_servlet_hello/
│   ├── prog09_servlet_calculator/
│   ├── prog10_servlet_login/
│   ├── prog11_jsp_hits/
│   ├── prog12_jsp_tags/
│   ├── prog13_jdbc_create_table/
│   ├── prog14_jdbc_insert/
│   └── prog15_jdbc_select/
└── unit2_windows/                        # Unit 2 for Windows Labs (isolated folders)
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

| # | Topic | Folder Name | Key Files |
|---|---|---|---|
| **5** | **JavaBean** | `prog05_javabean` | `StudentBean.java` |
| **6** | **XML Root & Child Nodes** | `prog06_xml_nodes` | `XMLNodes.java`, `input.xml` |
| **7** | **DOM Tree View** | `prog07_dom_tree` | `DOMTreeView.java`, `input.xml` |
| **8** | **Servlet: Hello World** | `prog08_servlet_hello` | `HelloServlet.java`, `web.xml` |
| **9** | **Servlet: Calculator** | `prog09_servlet_calculator` | `CalcServlet.java`, `calc.html`, `web.xml` |
| **10** | **Servlet: Login Parameters** | `prog10_servlet_login` | `LoginServlet.java`, `login.html`, `web.xml` |
| **11** | **JSP: Hit Counter** | `prog11_jsp_hits` | `hits.jsp` |
| **12** | **JSP: Tags Demo** | `prog12_jsp_tags` | `tags.jsp` |
| **13** | **JDBC: Create Table** | `prog13_jdbc_create_table`| `CreateTable.java` |
| **14** | **JDBC: Insert Data** | `prog14_jdbc_insert` | `InsertData.java` |
| **15** | **JDBC: Select Data** | `prog15_jdbc_select` | `SelectData.java` |

---

## How to Run Any Single Program in Exam

### On Linux:
```bash
cd unit2_linux/prog05_javabean
./run.sh
```

### On Windows:
Double click `run.bat` (or `compile.bat` for servlets) inside the program's folder.
