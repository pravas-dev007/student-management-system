# 🎓 Student Management System
> A production-ready REST API built using Spring Boot with validation, exception handling, and layered architecture.


## 🚀 Project Overview
This is a backend REST API project built using Spring Boot.
It performs CRUD operations to manage student data.
The application follows a layered architecture with clean separation of concerns.

---

## 📋 Prerequisites
- Java 17 or higher
- PostgreSQL installed and running
- Maven installed
- IDE (IntelliJ IDEA / Eclipse / VS Code)
- Postman (for API testing)

---

## 🛠️ Tech Stack
- Java - Programming Language
- Spring Boot - Backend Framework
- Hibernate (JPA) - ORM / Database Mapping
- PostgreSQL - Relational Database
- Maven - Build & Dependency Management

---

## 🧠 Key Concepts Used
- REST API Design
- Layered Architecture (Controller, Service, Repository)
- Dependency Injection
- Data Validation
- Exception Handling

---

## ✨ Features
- Add Student
- View All Students
- Get Student by ID
- Update Student
- Delete Student
- Validation using annotations
- Global exception handling
- Proper HTTP status codes in responses

---

## 📂 Project Structure
src/main/java/com/pravas/studentmanagement/
├── controller/      → REST Controllers
├── service/         → Business Logic
├── repository/      → Database Layer (JPA)
├── entity/          → JPA Entity Classes
└── exception/       → Custom Exception Classes

---

## 🔗 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /students | Add a new student |
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| PUT | /students/{id} | Update student by ID |
| DELETE | /students/{id} | Delete student by ID |

---

## 🗄️ Database Configuration
Configure the following in `application.properties`:
```properties
server.port=9095
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run
1. Clone the project from GitHub
2. Open the project in your IDE
3. Create a PostgreSQL database named `studentdb`
4. Configure database credentials in `application.properties`
5. Run the application as a Spring Boot App
6. App starts on `http://localhost:9095`
7. Test APIs using Postman

---

## 📌 Sample JSON
```json
{
  "name": "Pravas",
  "age": 25,
  "email": "pravas@gmail.com",
  "course": "MCA",
  "fees": 50000,
  "status": "Active"
}
```

---

## 👨‍💻 Author
**Pravas Ranjan Tripathy**
- GitHub: https://github.com/pravas-dev007
- LinkedIn: https://www.linkedin.com/in/pravastri2000
