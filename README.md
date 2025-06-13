# Djabu Web Application

## Description

This repository contains a dynamic web application designed to showcase legacy web development practices and technologies. The application is built with Java and demonstrates the use of servlets to create interactive web content.

## Features

- Interactive web pages using Java servlets
- Dynamic content generation based on user input
- Environment-based configuration for secure database access
- Simple and intuitive user interface

## Prerequisites

Before running this application, make sure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Apache Tomcat 10 or higher
- PostgreSQL database server

## Environment Variables Configuration

To improve security and flexibility, database credentials are managed using environment variables. Define the following variables in your system:

### Linux/macOS

```bash
export MYSQL_JDBC_URL="jdbc:postgresql://localhost:5432/djabu"
export MYSQL_JDBC_USER="djabu_user"
export MYSQL_JDBC_PASSWORD="jhondy12345"
```

### Windows CMD

```bash
set MYSQL_JDBC_URL=jdbc:postgresql://localhost:5432/djabu
set MYSQL_JDBC_USER=djabu_user
set MYSQL_JDBC_PASSWORD=jhondy12345
```

### IntelliJ IDEA

```bash
MYSQL_JDBC_URL=jdbc:postgresql://localhost:5432/djabu;
MYSQL_JDBC_USER=djabu_user;
MYSQL_JDBC_PASSWORD=jhondy12345;
```

## Installation

To set up the application on your local machine, follow these steps:

1. Clone the repository to your local machine:

```
git clone https://github.com/jhondyManrique/djabu-web-app.git
```
2. Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. Configure the project to use the appropriate JDK and Tomcat server.

## Database Setup


## Usage

To run the application:
1. Build the project using your IDE's build tools.
2. Start the Tomcat server.
3. Open a web browser and navigate to `http://localhost:8080`.
4. You should see the welcome message and a link to the servlet.

## Contributing

Contributions to this project are welcome! Please fork the repository and submit a pull request with your changes.

## License

The source code for the site is licensed under the MIT license, which you can find in
the MIT-LICENSE.txt file.

All graphical assets are licensed under the
[Creative Commons Attribution 3.0 Unported License](https://creativecommons.org/licenses/by/3.0/).
