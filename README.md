# Filmotheque Management System

A Spring Boot web application for managing a film library (filmotheque) with categories. This project provides a complete CRUD system for films and categories with a web interface.


## 🎯 Overview

This is a Java-based web application built with Spring Boot that allows users to manage a collection of films organized by categories. The application provides a clean web interface to view, add, update, and delete films and their associated categories.

## ✨ Features

- **Film Management**: Create, read, update, and delete films
- **Category Management**: Organize films by categories
- **Web Interface**: User-friendly web interface using Thymeleaf templates
- **Database Integration**: MySQL database with JPA/Hibernate
- **RESTful Architecture**: Clean separation of concerns with controllers, services, and repositories
- **Responsive Design**: Bootstrap-powered responsive UI

## 🛠 Technologies Used

- **Backend Framework**: Spring Boot 3.4.3
- **Java Version**: Java 17
- **Database**: MySQL
- **ORM**: Spring Data JPA / Hibernate
- **Template Engine**: Thymeleaf
- **Frontend**: HTML, CSS, Bootstrap 5.1.3
- **Build Tool**: Maven
- **Additional Libraries**:
  - Lombok (for reducing boilerplate code)
  - MySQL Connector/J



## 🚀 Installation

1. **Clone the repository**
2. **Set up MySQL Database**
   - Install and start MySQL server
   - Create a database named `bd-e1` (or let the application create it automatically)
   - Update database credentials in `application.properties` if needed

3. **Build the project**
   ```bash
   mvn clean install
   ```

## 💻 Usage

1. **Start the application** following the installation steps
2. **Access the web interface** at `http://localhost:8080`
3. **View films** by navigating to `http://localhost:8080/film/all`
4. **Manage data** through the web interface (additional controllers needed for full CRUD)
<img width="998" height="534" alt="Capture d’écran 2025-03-04 130515" src="https://github.com/user-attachments/assets/a1519e08-bade-4597-9097-707abbbabd88" />
<img width="1281" height="666" alt="Capture d’écran 2025-03-04 115752" src="https://github.com/user-attachments/assets/b51a6d3a-2752-423a-b121-69514c9fb1b6" />

