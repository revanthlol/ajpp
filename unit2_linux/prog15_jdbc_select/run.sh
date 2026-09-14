#!/bin/bash
javac -cp "../../lib/sqlite-jdbc.jar:." SelectData.java && \
java -cp "../../lib/sqlite-jdbc.jar:." SelectData
