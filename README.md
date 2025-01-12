# SpringApp

SpringApp is a simple Spring Boot application.

### Prerequisites

- Java 11 or higher
- Maven

### Running the Application

1. Clone the repository:
    ```sh
    git clone <repository-url>
    cd JavaSpringApp/spring-app
    ```

2. Build the project using Maven:
    ```sh
    ./mvnw clean install
    ```

3. Run the application:
    ```sh
    ./mvnw spring-boot:run
    ```

4. The application will start and be accessible at `http://localhost:8080`.

### Endpoints

- `GET /strcodetest` - Returns a test string.

### Running Tests

To run the tests, use the following command:
```sh
./mvnw test
