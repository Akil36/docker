# Spring Boot MongoDB Notes App

This is a simple Notes application built with Spring Boot with two api's and MongoDB from docker image, fully Dockerized.

## Features

- CRUD operations on notes (Create, Read, Update, Delete)
- MongoDB as the backend database
- Docker Compose setup to run both Spring Boot app and MongoDB container
- REST API endpoint: `/notes` to manage notes

## Getting Started

### Prerequisites

- Docker and Docker Compose installed
- Java 17 and Maven (if running locally)

### Run with Docker Compose

```bash
docker-compose up --build

