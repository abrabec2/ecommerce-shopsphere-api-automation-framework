# ecommerce-shopsphere-api-automation-framework


Authentication microservice built using Spring Boot.

## Features

- User Registration API
- DTO-based request/response handling
- Service Layer Architecture
- Spring Data JPA
- H2 Database
- Postman API Testing

## Tech Stack

- Java 21
- Spring Boot 4.x
- Maven
- H2 Database
- Spring Data JPA

## API

POST /auth/register

Request:

{
  "username": "john",
  "email": "john@test.com",
  "password": "password123"
}

Response:

{
  "message": "User registered successfully",
  "username": "john"
}
