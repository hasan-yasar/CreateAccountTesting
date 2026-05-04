# Create Account Testing Project

## Project Description

This project is prepared for testing the Create New Account page.

The form includes these fields:

- First Name
- Last Name
- E-mail
- Date of Birth
- Password
- Confirm Password

The aim of this project is to validate user inputs and write automated unit tests for valid and invalid cases.

## Technologies Used

- Java
- Maven
- JUnit 5
- IntelliJ IDEA
- GitHub
- GitHub Actions

## Tested Fields

### First Name
- Empty first name
- Null first name
- Short first name
- Long first name
- First name with number
- Valid first name

### Last Name
- Empty last name
- Short last name
- Long last name
- Last name with number
- Valid last name

### E-mail
- Empty email
- Null email
- Email without @
- Email without domain
- Valid email

### Password
- Empty password
- Null password
- Short password
- Valid password

### Confirm Password
- Matching passwords
- Non-matching passwords
- Null password match

### Date of Birth
- Empty date
- Null date
- Invalid date format
- Invalid day
- Invalid month
- Invalid year
- Valid date

## Test Techniques Used

In this project, we used:

- Equivalence Partitioning
- Boundary Value Analysis
- Positive Testing
- Negative Testing

## JUnit Features Used

- `@Test`
- `@BeforeEach`
- `@AfterEach`
- `assertTrue`
- `assertFalse`

## How to Run Tests

To run the tests, use this command:

```bash
mvn test

## PR Demo
test

## PR Demo
123

## PR TEST 2
abc123
