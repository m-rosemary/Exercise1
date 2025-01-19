# Spring Boot Project: Basic Controller Example

This project is a simple Spring Boot application created from scratch. It demonstrates how to set up a basic controller, handle HTTP requests, and use the `@ResponseBody` annotation to return data in the response.

## Features

- Basic Spring Boot project setup.
- Simple controller to handle HTTP GET requests.
- Demonstration of `@ResponseBody` annotation for returning data.
- HTTP request testing.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven or Gradle
- An IDE such as IntelliJ IDEA or Eclipse

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

### Running the Application

1. Start the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
2. The application will run on `http://localhost:8080` by default.

### Testing the Controller

- Send an HTTP GET request to the endpoint:
  ```
  http://localhost:8080/greeting
  ```
- The response should return a simple message (e.g., "Hello, World!").

## Example Code

### Controller

```java
@Controller
//@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String hello() { return "Hello Vistula, in my first Spring controller."; }

    @GetMapping(value = "/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    //http://localhost:8080/greeting
}
```

### Explanation

- `@RestController`: Combines `@Controller` and `@ResponseBody` to simplify RESTful web service development.
- `@GetMapping`: Maps HTTP GET requests to the `sayHello` method.
- `@ResponseBody`: Ensures the return value is written directly to the HTTP response body.

## Technologies Used

- Spring Boot
- Java
- Maven



---

Enjoy building with Spring Boot!
