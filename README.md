
# Banking Management System

Here is the updated `README.md` file for your banking management system, now with both the **Transaction Service** and the **Employee Management System** included:

---

# Banking Management System

This is a **Banking Management System** project using a **React.js** frontend and **Spring Boot** backend. It comprises six services: **User Management**, **Account Management**, **Employee Management**, **Transaction Management**, **Loan Management**, and **Feedback System**. Each service operates as a microservice to enhance scalability and maintainability.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [System Architecture](#system-architecture)
- [Features](#features)
  - [User Management](#user-management)
  - [Account Management](#account-management)
  - [Employee Management](#employee-management)
  - [Transaction Management](#transaction-management)
  - [Loan Management](#loan-management)
  - [Feedback System](#feedback-system)
- [Setup Instructions](#setup-instructions)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)


## Project Overview

The Banking Management System allows users to manage their bank accounts, perform transactions, manage employees, apply for loans, and provide feedback. The project follows a **microservice architecture**, with each service responsible for a different part of the system.

## Technologies Used

### Frontend
- **React.js** with Hooks and Context API
- **Tailwind CSS** for styling
- **Axios** for API requests

### Backend
- **Spring Boot** with Microservices architecture
- **Spring Data JPA** for database interaction
- **MySQL** for data storage
- **Spring Security** for authentication and authorization
- **Lombok** for simplifying boilerplate code

### Tools
- **Postman** for API testing
- **Maven** for project build and dependency management

## System Architecture

The system is composed of multiple microservices that communicate with each other using REST APIs:

1. **User Management Service**: Manages user information and authentication.
2. **Account Management Service**: Handles account creation and management.
3. **Employee Management Service**: Manages employee records, roles, and assignments.
4. **Transaction Management Service**: Manages account transactions such as deposits, withdrawals, and transfers.
5. **Feedback Service**: Collects and manages feedback from users.

Each service is independently deployable and scalable.

## Features

### User Management
- Register a new user
- Login and logout
- Update user details
- Manage user roles (e.g., admin, customer)

### Account Management
- Open a new account
- View account details
- Update account information
- Close an account

### Employee Management
- Add a new employee
- View employee details
- Update employee information
- Manage employee roles (e.g., manager, teller)
- Remove an employee

### Transaction Management
- Deposit money into an account
- Withdraw money from an account
- Transfer funds between accounts
- View transaction history

### Feedback System
- Submit feedback for banking services
- View feedback history
- Manage feedback responses (admin functionality)

## API Endpoints

### User Management Service
- **POST** `/api/users/register`: Register a new user
- **POST** `/api/users/login`: User login
- **PUT** `/api/users/update`: Update user information

### Account Management Service
- **POST** `/api/accounts/create`: Create a new account
- **GET** `/api/accounts/{id}`: Get account details
- **PUT** `/api/accounts/update/{id}`: Update account info

### Employee Management Service
- **POST** `/api/employees/add`: Add a new employee
- **GET** `/api/employees/{id}`: Get employee details
- **PUT** `/api/employees/update/{id}`: Update employee info
- **DELETE** `/api/employees/remove/{id}`: Remove an employee

### Transaction Management Service
- **POST** `/api/transactions/deposit`: Deposit money
- **POST** `/api/transactions/withdraw`: Withdraw money
- **POST** `/api/transactions/transfer`: Transfer money
- **GET** `/api/transactions/history/{accountId}`: Get transaction history


### Feedback Service
- **POST** `/api/feedback/submit`: Submit feedback
- **GET** `/api/feedback/all`: Get all feedback

## Contributing

Feel free to open issues or pull requests if you would like to contribute to this project. All contributions are welcome!

