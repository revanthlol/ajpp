#!/bin/bash
javac -cp "../../lib/sqlite-jdbc.jar:." CreateTable.java && \
java -cp "../../lib/sqlite-jdbc.jar:." CreateTable
