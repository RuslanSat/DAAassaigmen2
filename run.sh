#!/bin/bash

echo "DAA Assignment 2 - Linear Array Algorithms"
echo "=========================================="
echo

echo "Checking Java installation..."
if ! command -v java &> /dev/null; then
    echo "ERROR: Java is not installed or not in PATH"
    echo "Please install Java 11 or higher and add it to your PATH"
    exit 1
fi

echo "Checking Maven installation..."
if ! command -v mvn &> /dev/null; then
    echo "ERROR: Maven is not installed or not in PATH"
    echo "Please install Maven 3.6 or higher and add it to your PATH"
    exit 1
fi

echo
echo "Building project..."
mvn clean compile

if [ $? -ne 0 ]; then
    echo "ERROR: Build failed"
    exit 1
fi

echo
echo "Running tests..."
mvn test

if [ $? -ne 0 ]; then
    echo "ERROR: Tests failed"
    exit 1
fi

echo
echo "Starting CLI benchmark tool..."
mvn exec:java


