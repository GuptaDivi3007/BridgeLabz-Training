# Daily updates of Refresher Training

## Day 1 — DBMS Fundamentals & RDBMS Basics

### 📌 31/07/2026

- Learned the foundational hierarchy: **Data → Database → DBMS → RDBMS**
- Compared **File Systems vs DBMS**, and understood DBMS advantages (reduced redundancy, integrity, security, concurrency)
- Explored **types of DBMS** (Hierarchical, Network, Relational, Object-Oriented, NoSQL)
- Deeply understood **RDBMS features**, and made the critical **SQL vs NoSQL** decision framework
- Installed **MySQL** on Windows, understood its **internal architecture** (Connection → SQL → Storage Engine layers)
- Practiced **DDL** (CREATE, ALTER, DROP, TRUNCATE, RENAME) and **DML** (INSERT, UPDATE, DELETE)
- Got introduced to **TCL** (COMMIT/ROLLBACK) and **DCL** (GRANT/REVOKE)
- Built the first two tables of our Health Clinic Database: `patients` and `doctors`

## Day 2 - ER Diagram, Indexing, Database Normalization

### 📌 03/08/2026

- Learned formal **ER Diagram** components: Entity, Attribute, Relationship, Cardinality, Participation, Primary/Foreign Keys
- Designed the **complete ER Diagram** for the Health Clinic Application, resolving the Doctor ↔ Specialization M:N relationship via a junction table
- Deep-dived into **Indexing**: B+ Tree internals, Clustered vs Non-Clustered, Composite (leftmost prefix rule), Unique, and Covering indexes
- Used `EXPLAIN` to measure real performance impact of indexes
- Covered **Normalization** from 1NF → BCNF, fixing update/insertion/deletion anomalies via functional dependency analysis
- Learned **Denormalization** as a deliberate, targeted performance trade-off for OLAP/reporting systems
- Built the **fully normalized Health Clinic schema** with proper indexes.

