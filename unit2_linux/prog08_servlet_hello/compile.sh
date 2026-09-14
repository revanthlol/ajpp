#!/bin/bash
# Compiles using servlet-api from repo lib/ or Tomcat lib
javac -cp "../../lib/javax.servlet-api-4.0.1.jar:." HelloServlet.java
echo "HelloServlet compiled successfully."
