@echo off
echo DAA Assignment 2 - Linear Array Algorithms
echo ==========================================
echo.

echo Checking Java installation...
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Java is not installed or not in PATH
    echo Please install Java 11 or higher and add it to your PATH
    pause
    exit /b 1
)

echo Checking Maven installation...
mvn -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Maven is not installed or not in PATH
    echo Please install Maven 3.6 or higher and add it to your PATH
    pause
    exit /b 1
)

echo.
echo Building project...
mvn clean compile

if %errorlevel% neq 0 (
    echo ERROR: Build failed
    pause
    exit /b 1
)

echo.
echo Running tests...
mvn test

if %errorlevel% neq 0 (
    echo ERROR: Tests failed
    pause
    exit /b 1
)

echo.
echo Starting CLI benchmark tool...
mvn exec:java

pause


