# EasyCV Backend

Backend service for the EasyCV application, designed for easy CV creation.

## About

This backend provides a RESTful API for managing CV data. Users can create, retrieve, update, and delete their CVs and associated sections.

## Technologies Used

*   Java 17+
*   Spring Boot 3.x
*   Spring Data JPA
*   H2 Database (In-Memory for development)
*   Maven
*   Lombok

## Getting Started

1.  Clone the repository: `git clone <repository_url>`
2.  Navigate to the project directory: `cd easy-cv-backend`
3.  Build the project: `mvn clean install`
4.  Run the application: `mvn spring-boot:run`

The API will be accessible at `http://localhost:8080/api/cvs`.

## API Endpoints

*   `GET /api/cvs`: Retrieve all CVs.
*   `GET /api/cvs/{id}`: Retrieve a specific CV by ID.
*   `POST /api/cvs`: Create a new CV (send CV data as JSON in the request body).
*   `PUT /api/cvs/{id}`: Update an existing CV (send updated CV data as JSON).
*   `DELETE /api/cvs/{id}`: Delete a CV.

## Development Notes

*   An in-memory H2 database is used for development. For production, a persistent database (e.g., PostgreSQL, MySQL) should be configured.
*   Future enhancements could include user authentication, CV templates, PDF export functionality, and more robust validation.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request.
