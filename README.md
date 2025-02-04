# Spring Boot Project: Basic Controller Example

This project is a simple Spring Boot application created from scratch. It demonstrates how to set up a basic controller, handle HTTP requests, and use the `@ResponseBody` annotation to return data in the response.

## Features

- Basic Spring Boot project setup.
- Simple controller to handle HTTP GET requests.
- Demonstration of `@ResponseBody` annotation for returning data.
- HTTP request testing.


### Prerequisites

- Java 17 or higher
- Maven or Gradle
- An IDE such as IntelliJ IDEA or Eclipse


### Testing the Controller


- Send an HTTP GET request to the endpoint:
  ```
  //http://localhost:8080/greeting?name=Vistula
  ```
- The response should return message (e.g., "Hello, Vistula!") and img.


```

### Explanation

- `@RestController`: Combines `@Controller` and `@ResponseBody` to simplify RESTful web service development.
- `@GetMapping`: Maps HTTP GET requests to the `HelloController` method.
- `@ResponseBody`: Ensures the return value is written directly to the HTTP response body.

## Technologies Used

- Spring Boot
- Java
- Maven



---

Enjoy building with Spring Boot!
