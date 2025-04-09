
# 🎓 Student Management Console App (Java + MySQL)

Welcome to the **Student Management Console Application** — a simple Java project that uses **JDBC** to connect to a **MySQL database** and perform basic **CRUD operations** (Create, Read, Update, Delete) on student records.

---

## 📌 About the Project

This is a **console-based Java application** designed for:
- Adding new students to a database
- Updating student information
- Deleting student records
- Viewing all students stored in the database

It helps beginners understand how **Java** interacts with **databases** using **JDBC (Java Database Connectivity)**.

---

## 🛠️ Tech Stack

- Java (Core Java, JDBC API)
- MySQL Database
- IntelliJ IDEA / Eclipse / VS Code (Any Java IDE)

---

## 📂 Project Structure

```bash
StudentManagementApp/
├── DatabaseConnection.java    # Handles database connectivity
├── StudentDAO.java             # Manages CRUD operations
├── Main.java                   # User interface (console-based)
├── README.md                   # Project documentation
├── .gitignore                  # Git ignore rules

```

## 🚀 How to Run

Follow these steps to set up and run the project locally.

---

### 1. Set up MySQL Database

Create a database and table using the following SQL commands:

```sql
CREATE DATABASE forjdbc;

USE forjdbc;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    department VARCHAR(255)
);
```

### 🔐 Update Database Credentials

Modify the following lines in `DatabaseConnection.java`:

```java
private static String url = "jdbc:mysql://localhost:3306/forjdbc";
private static String name = "your_mysql_username";
private static String password = "your_mysql_password";
```

## ⚙️ Compile and Run the Application

Use the following commands to compile and run the Java files:

```bash
# Compile all Java files
javac *.java

# Run the Main class
java Main
```

---

## ✨ Features

- ➕ Add New Student
- ✏️ Update Existing Student Details
- ❌ Delete Student by ID
- 📋 View All Students in the Database

---

## 📢 Usage

You are free to use, modify, and share this project for educational and personal purposes.

---

## 🙋‍♂️ Author

- **Rajnikant**  
  [GitHub Profile](https://github.com/rajni2209)
