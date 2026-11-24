# grade-app-cicd

Java application built and delivered through a CI/CD pipeline on Docker.

## Pipeline
GitHub -> Jenkins -> Maven (build and test) -> SonarQube (analysis) -> Quality Gate -> Maven (package) -> JAR -> Nexus

## Tools
- GitHub: source code
- Jenkins: pipeline automation
- Maven: build, test and packaging
- SonarQube: code quality analysis and Quality Gate
- Nexus: artifact (JAR) storage
- Docker: runs Jenkins, SonarQube and Nexus

## Project structure
- `pom.xml`: Maven build instructions
- `src/main/java`: application code (GradeCalculator)
- `src/test/java`: unit tests (JUnit)

## Build locally
    mvn clean package

The JAR is created in `target/`.
