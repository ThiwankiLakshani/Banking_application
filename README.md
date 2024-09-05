
# Banking Management System

This is a **Banking Management System** project using a **React.js** frontend and **Spring Boot** backend. It comprises five services: **User Management**, **Account Management**, **Employee Management**, **Loan Management**, and **Feedback System**. Each service operates as a microservice to enhance scalability and maintainability.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [System Architecture](#system-architecture)
- [Features](#features)
  - [User Management](#user-management)
  - [Account Management](#account-management)
  - [Employee Management](#employee-management)
  - [Loan Management](#loan-management)
  - [Feedback System](#feedback-system)
- [Setup Instructions](#setup-instructions)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

The Banking Management System allows users to manage their bank accounts, apply for loans, manage employees, and provide feedback. The project follows a **microservice architecture**, with each service responsible for a different part of the system.

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
4. **Loan Management Service**: Manages loan applications and repayments.
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

### Loan Management
- Apply for a loan
- View loan details
- Make loan payments
- View loan repayment schedule

### Feedback System
- Submit feedback for banking services
- View feedback history
- Manage feedback responses (admin functionality)

## Setup Instructions

### Backend Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/banking-management-system-backend.git
    cd banking-management-system-backend
    ```

2. Configure the database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/banking_system
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    ```

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Run the services:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup

1. Clone the frontend repository:
    ```bash
    git clone https://github.com/your-repo/banking-management-system-frontend.git
    cd banking-management-system-frontend
    ```

2. Install dependencies:
    ```bash
    npm install
    ```

3. Start the development server:
    ```bash
    npm start
    ```

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

### Loan Management Service
- **POST** `/api/loans/apply`: Apply for a loan
- **GET** `/api/loans/{id}`: Get loan details
- **PUT** `/api/loans/pay/{id}`: Make a loan payment

### Feedback Service
- **POST** `/api/feedback/submit`: Submit feedback
- **GET** `/api/feedback/all`: Get all feedback

## Contributing

Feel free to open issues or pull requests if you would like to contribute to this project. All contributions are welcome!


