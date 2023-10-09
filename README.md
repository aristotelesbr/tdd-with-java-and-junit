# TDD With Java and JUnit

## Dependencies

- Java 20 (or higher)
- Maven 3.6.3 (or higher)
- JUnit 5 (or higher)

## How to run the application in development mode

```bash
$ mvn clean install
```

After this, you can run the tests with:

## How to run the tests

To run the tests, you can use the following command:

```bash
$ mvn test
```

## What is mvn?

"mvn" or Maven is a build automation tool used primarily for Java projects. Maven addresses two aspects of building software: first, it describes how software is built, and second, it describes its dependencies.

if you see the following output, you are ready to go:

```bash
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running br.com.aristoteles.PersonServiceTest
Person created!
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.060 s -- in br.com.aristoteles.PersonServiceTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.763 s
[INFO] Finished at: 2023-10-09T10:54:46-03:00
[INFO] ------------------------------------------------------------------------
```

## What is TDD?

TDD stands for Test Driven Development. It is a software development process that relies on the repetition of a very short development cycle. First the developer writes an (initially failing) automated test case that defines a desired improvement or new function, then produces the minimum amount of code to pass that test, and finally refactors the new code to acceptable standards.

## What is JUnit?

JUnit is a unit testing framework for the Java programming language.
