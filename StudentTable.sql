/* 1. create student table contains columns id int primary key,name varchar(10) not null,address varchar(10) not null,age int not null. insert 5 records in student tables . and perform all aggregate function (sum,avg,min,max.count)in age column. */

mysql> show databases;
+-------------------------------+
| Database                      |
+-------------------------------+
| anp_d4848                     |
| bank_db                       |
| coffee_shop_sales_db          |
| college_db                    |
| company_db                    |
| customer_churn                |
| ecommerce_db                  |
| employees_table               |
| fake_news_db                  |
| hospital_management_system    |
| hospital_management_system_db |
| information_schema            |
| institute                     |
| iris_project                  |
| mysql                         |
| performance_schema            |
| portfolio_db                  |
| practice_database             |
| school_db                     |
| smart_portfolio               |
| store_db                      |
| sys                           |
+-------------------------------+
22 rows in set (0.05 sec)

mysql> use anp_d4848;
Database changed
mysql> show tables;
+---------------------+
| Tables_in_anp_d4848 |
+---------------------+
| product             |
+---------------------+
1 row in set (0.02 sec)

mysql> CREATE TABLE student (
    ->     id INT PRIMARY KEY,
    ->     name VARCHAR(10) NOT NULL,
    ->     address VARCHAR(10) NOT NULL,
    ->     age INT NOT NULL
    -> );
Query OK, 0 rows affected (0.10 sec)

mysql> INSERT INTO student (id, name, address, age) VALUES
    -> (1, 'Amit', 'Mumbai', 20),
    -> (2, 'Sneha', 'Pune', 22),
    -> (3, 'Raj', 'Delhi', 19),
    -> (4, 'Priya', 'Chennai', 21),
    -> (5, 'Karan', 'Kolkata', 23);
Query OK, 5 rows affected (0.02 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from student;
+----+-------+---------+-----+
| id | name  | address | age |
+----+-------+---------+-----+
|  1 | Amit  | Mumbai  |  20 |
|  2 | Sneha | Pune    |  22 |
|  3 | Raj   | Delhi   |  19 |
|  4 | Priya | Chennai |  21 |
|  5 | Karan | Kolkata |  23 |
+----+-------+---------+-----+
5 rows in set (0.00 sec)

mysql> select sum(age) from student;
+----------+
| sum(age) |
+----------+
|      105 |
+----------+
1 row in set (0.01 sec)

mysql> select max(age) from student;
+----------+
| max(age) |
+----------+
|       23 |
+----------+
1 row in set (0.01 sec)

mysql> select min(age) from student;
+----------+
| min(age) |
+----------+
|       19 |
+----------+
1 row in set (0.00 sec)

mysql> select avg(age) from student;
+----------+
| avg(age) |
+----------+
|  21.0000 |
+----------+
1 row in set (0.00 sec)

mysql> select count(age) from student;
+------------+
| count(age) |
+------------+
|          5 |
+------------+
1 row in set (0.03 sec)