# Welcome to *api-hack-the-room*

"Hack the Room" is a web application project that aims to provide an interactive learning experience through
gamification. The project leverages the GPT-3 API to create educational games that teach users various topics, with a
focus on coding challenges.<br>
**This document provides an overview of the key components and functionalities of the backend of the project.**

## Project Overview

The backend project is implemented using the Spring Boot framework and consists of several components, including
controllers, repositories, and model classes. Below is an overview of the key components:

### `User Component`

The User component manages user data and provides API endpoints for user-related operations, including user profile
retrieval, score tracking, and profile updates. It includes a User model class, a controller (UserController), a
repository (UserRepository), and a data transfer object (UserDTO).

### `Security Component`

The security component of the application provides user authentication and authorization functionalities. It includes:

- `EncryptionConfig`: Configuration for encrypting user passwords using BCrypt.
- `MyUserDetails`: Custom implementation of UserDetails to map user details from the database to Spring Security.
- `MyUserDetailsService`: Service responsible for loading user details and saving new users to the database.
- `SecurityConfiguration`: Configuration for security filters, CORS (Cross-Origin Resource Sharing), and URL
  authorization rules.
  This component ensures secure access to the application's endpoints and user authentication.

### `Learn Object Component`

The "Learn Object" component manages and provides information about different learning objects. It includes an entity
class representing learning objects with attributes.
It also has a controller class that handles requests for retrieving learning objects by their ID.

### `AI Component`

The "AI" component is a RESTful API that interacts with an AI service, likely a language model like GPT. It includes a
controller with endpoints for tasks such as generating fortune cookie quotes, evaluating code, providing code hints,
getting binary answers to code challenges, and obtaining solutions to coding challenges.
The AI service (AiService) communicates with the external AI service to generate responses based on user requests.

## Running the Application

To run this backend project locally, follow these steps:

1. Ensure Java and Maven are Installed.
2. Clone the Project Repository.
3. Build the project using Maven:
   ```bash
   mvn clean install
4. Run the application:
    ```bash
    java -jar target/demo-0.0.1-SNAPSHOT.jar

The backend server will start and be accessible at *http://localhost:8080*. Make requests to the provided endpoints as
needed for your application.

## Note

This is a high-level overview of the backend project. For more detailed information on each component, please refer to
the source code and comments within the codebase. Make sure to set up the necessary database and dependencies to run the
application successfully.
If you have any questions or need further assistance, please don't hesitate to reach out.
