Vulpe Andrei - Tema 5 - 05.08.2022
-------------------------------------------------------------------------------
The goal of this homework is to create a small working Java Spring API.
-------------------------------------------------------------------------------
Requirements:
• Implement DAO pattern for the project - customer, product, orders
• Create a simple HTML pages to display customers using thymeleaf
• All customers
• One customer by ID
• Filter customers by username, city, country
-------------------------------------------------------------------------------
Implementation:
The project contains six packages:
- Controllers
- Model
- DTO
- Mapper
- Repository
- Service

Each package contains Java Spring Classes for each table found in the database:
- Customer
- Orders
- Product

Notes:
Had lots of problems with dependencies, this resulting in not fully implementing DTO (wanted to implement DTO only for
customers). Also, the API does not run because of a problem of dependencies which I did not solve.
