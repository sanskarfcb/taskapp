#  Task Manager App (Spring Boot + Thymeleaf + Docker)

This is a simple web-based Task Manager application built using **Spring Boot**, **Thymeleaf**, and **Docker**. It allows users to add and delete tasks with a clean UI. This project is Dockerized so it can be easily run on any machine with Docker installed.
This is the first project with which I'm learning docker.

---

##  Features

- Add tasks 
- Delete tasks 
- Beautiful UI with **Thymeleaf**
- Lightweight **H2 database**
- Dockerized for easy deployment 

---

##  Project Structure
    ├── src/                 # Java source code
    │   └── main
    │       ├── java
    │       │   └── com.example.taskapp
    │       │       ├── Controller
    │       │       ├── Model
    │       │       ├── Repository
    │       │       └── TaskAppApplication.java
    │       └── resources
    │           └── templates
    │               └── index.html
    ├── target/              # Built JAR (after mvn package)
    ├── Dockerfile           # Docker config
    ├── pom.xml              # Maven dependencies
    └── README.md            # This file

---

##  Prerequisites

- Java 21+
- Maven
- Docker

---

## ⚙️ How to Run with dockerhub

    ##  Prerequisites

    - Install [Docker Desktop](https://www.docker.com/products/docker-desktop) (Windows/macOS) or Docker CLI (Linux)
    - Make sure Docker is running:
    ```bash
    docker --version
    
    How to Run the App
    docker run -p 8080:8080 sanskarfcb/task-app:latest

    Now open your browser and go to:
    http://localhost:8080

  Author

    Sanskar Mishra
    sanskarmishra.work@gmail.com

