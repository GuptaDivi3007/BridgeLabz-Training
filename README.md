# Daily updates of Refresher Training

## Day 1 — DBMS Fundamentals & RDBMS Basics

### 📌 31/07/2026

- Learned the foundational hierarchy: **Data → Database → DBMS → RDBMS**.
- Compared **File Systems vs DBMS**, and understood DBMS advantages (reduced redundancy, integrity, security, concurrency).
- Explored **types of DBMS** (Hierarchical, Network, Relational, Object-Oriented, NoSQL).
- Deeply understood **RDBMS features**, and made the critical **SQL vs NoSQL** decision framework.
- Installed **MySQL** on Windows, understood its **internal architecture** (Connection → SQL → Storage Engine layers).
- Practiced **DDL** (CREATE, ALTER, DROP, TRUNCATE, RENAME) and **DML** (INSERT, UPDATE, DELETE).
- Got introduced to **TCL** (COMMIT/ROLLBACK) and **DCL** (GRANT/REVOKE).
- Built the first two tables of our Health Clinic Database: `patients` and `doctors`.

## Day 2 - ER Diagram, Indexing, Database Normalization

### 📌 03/08/2026

- Learned formal **ER Diagram** components: Entity, Attribute, Relationship, Cardinality, Participation, Primary/Foreign Keys.
- Designed the **complete ER Diagram** for the Health Clinic Application, resolving the Doctor ↔ Specialization M:N relationship via a junction table.
- Deep-dived into **Indexing**: B+ Tree internals, Clustered vs Non-Clustered, Composite (leftmost prefix rule), Unique, and Covering indexes.
- Used `EXPLAIN` to measure real performance impact of indexes.
- Covered **Normalization** from 1NF → BCNF, fixing update/insertion/deletion anomalies via functional dependency analysis.
- Learned **Denormalization** as a deliberate, targeted performance trade-off for OLAP/reporting systems.
- Built the **fully normalized Health Clinic schema** with proper indexes.

## Day 3 — SQL Joins, Stored Procedures, Triggers

### 📌 04/08/2026

- Moved from single-table queries to combining data across multiple related tables using all major JOIN types: INNER, LEFT, RIGHT, FULL OUTER, SELF, and CROSS JOIN.
- Wrote real multi-table joins across the normalized Health Clinic schema (Patients, Doctors, Appointments, Billing, Visit History) to pull meaningful combined reports.
- Learned why MySQL doesn't natively support FULL OUTER JOIN, and how to simulate it using UNION.
- Practiced Multiple Table Joins, chaining several JOIN clauses into one full appointment report query.
- Learned Stored Procedures — precompiled, reusable SQL logic stored inside the database itself.
- Practiced creating and calling procedures using DELIMITER, and working with IN, OUT, and INOUT parameter types.
- Implemented Error Handling in procedures using DECLARE ... HANDLER, paired with transactions (COMMIT/ROLLBACK).
- Learned Triggers — automatic database actions that fire in response to INSERT/UPDATE/DELETE events.
- Built BEFORE and AFTER triggers for INSERT, UPDATE, and DELETE, understanding the NEW vs OLD row distinction.
- Built the Appointment Procedure, Billing Procedure, Visit History Trigger, and Audit Trigger for the Health Clinic project — to be reused directly in Day 4's final JDBC application.
- Went through and answered all the practice and interview questions for the day.

## Day 4 — JDBC, Transactions & Health Clinic Console Application

### 📌 05/08/2026

- Connected Java with MySQL using JDBC.
- Learned DriverManager, PreparedStatement, ResultSet, and Exception Handling.
- Understood SQL Injection prevention using PreparedStatement.
- Implemented Transaction Management (`commit`, `rollback`, `savepoint`).
- Learned HikariCP Connection Pooling and compared it with DriverManager.
- Built a layered Java application using **DTO → DAO → Service → UI** architecture.
- Implemented CRUD operations for **Patients, Doctors, Appointments, Billing, and Visit History**.
- Completed the **Health Clinic Console Application** using Java, JDBC, Maven, and MySQL.

## Day 5 — Tomcat, Servlets & Spring Introduction

### 📌 06/08/2026

- Learned the role of **Apache Tomcat** as a Web/Servlet Container and how it executes Servlets.
- Understood the **Servlet Lifecycle** and the complete Browser → Tomcat → Servlet → Browser request-response flow.
- Configured **Apache Tomcat** with IntelliJ IDEA using Smart Tomcat.
- Built and successfully deployed the **First Servlet Application**.
- Learned URL mapping using `@WebServlet` and request handling through `doGet()`.
- Explored the basics of the **Spring Framework** and why it is used.
- Learned the core concepts of **Inversion of Control (IoC)** and **Dependency Injection (DI)**.
- Related Spring's dependency injection to manual object creation (`new`) used in previous Java console applications.
- Deployed basic servlet on tomcat.
- Explore Spring's IoC container with a simple bean example.

## Day 6 — Spring MVC

### 📌 07/08/2026

- Understood **Spring MVC architecture** and the role of `DispatcherServlet`.
- Learned how **Controllers and Views** work in Spring MVC.
- Learned request mapping and request handling using `@Controller`, `@RequestMapping`, `@GetMapping`, and `@PostMapping`.
- Understood how `DispatcherServlet` acts as the single entry point for HTTP requests.
- Built the required **My Greetings App** using Spring MVC.
- Learned how Spring MVC connects the **Controller → Service → DAO** layers.
- Tested HTTP requests and responses through Spring MVC endpoints.

