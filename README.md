# Advanced Java Programming - Practical Exam Programs (Linux Branch)

This branch contains clean, concise, and tested solutions for all 15 practical exam questions across Unit 1 and Unit 2, tailored specifically for **Linux** lab environments.

- Every program in Unit 2 is in its **own isolated folder**.
- All scripts use Linux bash syntax (`./run.sh` / `./compile.sh`) and `:` classpath separators.
- Code is ultra-concise (10–22 lines per program) and uses `throws Exception`.

---

## One-Click Execution (Run All)

```bash
chmod +x test_all.sh
./test_all.sh
```

---

## Directory Structure

```
ajpp/
├── lib/
│   ├── javax.servlet-api-4.0.1.jar       # Servlet API library
│   └── sqlite-jdbc.jar                   # Standalone JDBC driver
├── test_all.sh                           # Linux test runner
├── unit1/                                # Unit 1 Core Collection Programs
│   ├── Prog01_IteratorDemo.java
│   ├── Prog02_ComparableDemo.java
│   ├── Prog03_MapComparison.java
│   └── Prog04_ListMethodsDemo.java
└── unit2/                                # Unit 2 Linux Programs (isolated folders)
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

| # | Topic | Folder Name | Run Command |
|---|---|---|---|
| **5** | **JavaBean** | `unit2/prog05_javabean` | `./run.sh` |
| **6** | **XML Root & Child Nodes** | `unit2/prog06_xml_nodes` | `./run.sh` |
| **7** | **DOM Tree View** | `unit2/prog07_dom_tree` | `./run.sh` |
| **8** | **Servlet: Hello World** | `unit2/prog08_servlet_hello` | `./compile.sh` |
| **9** | **Servlet: Calculator** | `unit2/prog09_servlet_calculator` | `./compile.sh` |
| **10** | **Servlet: Login Parameters** | `unit2/prog10_servlet_login` | `./compile.sh` |
| **11** | **JSP: Hit Counter** | `unit2/prog11_jsp_hits` | Copy `hits.jsp` to Tomcat webapps |
| **12** | **JSP: Tags Demo** | `unit2/prog12_jsp_tags` | Copy `tags.jsp` to Tomcat webapps |
| **13** | **JDBC: Create Table** | `unit2/prog13_jdbc_create_table`| `./run.sh` |
| **14** | **JDBC: Insert Data** | `unit2/prog14_jdbc_insert` | `./run.sh` |
| **15** | **JDBC: Select Data** | `unit2/prog15_jdbc_select` | `./run.sh` |
