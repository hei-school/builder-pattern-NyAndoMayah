# Builder Design Pattern Example

This project serves as an example of implementing the Builder Design Pattern in Java. It includes a `Main.java` file demonstrating the usage of the Builder pattern to construct objects.

## Prerequisites

- JDK 17 (or a compatible version) installed on your machine.
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (or any other Java IDE of your choice).

## Getting Started

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/your-username/builder-design-pattern-example.git
    cd builder-design-pattern-example
    ```

2. **Import Project into IntelliJ IDEA:**

    Open IntelliJ IDEA, choose "Open" from the main menu, and select the project folder. IntelliJ IDEA should automatically recognize it as a Java project.

3. **Apply Default IntelliJ IDEA Formatter:**

    The project uses the default IntelliJ IDEA code style. Ensure that your code is formatted according to this style. You can find the default IntelliJ IDEA code style settings in the `.editorconfig` file and the `.idea/codeStyles` directory.

4. **Compile the Source Code:**

    Compile the Java source code using the following command:

    ```bash
    javac -d out $(find . -name "*.java" ! -name "ClientTest.java")
    ```

5. **Run the Main Application:**

    Execute the `Main.java` file to see the Builder Design Pattern in action:

    ```bash
    java -cp out Main
    ```

    This should output the results of constructing objects using the Builder pattern.

6. **Run Tests:**

    The project includes a test class named `ClientTest.java`. To run the tests, first, ensure that you have JUnit Platform Console Standalone JAR downloaded. If not, you can download it using the following:

    ```bash
    mkdir -p lib
    curl -L -o lib/junit-platform-console-standalone.jar https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.2/junit-platform-console-standalone-1.7.2.jar
    ```

    Now, you can run the tests:

    ```bash
    java -cp out:lib/* org.junit.platform.console.ConsoleLauncher --scan-classpath
    ```

    This will execute the tests in the project.

## Code Formatting

The project uses the default IntelliJ IDEA code style. Make sure to apply the code formatter to maintain consistent code style.

## Project Structure

- `src/`: Contains the Java source files, including the `Main.java` file that demonstrates the Builder Design Pattern.
- `out/`: The directory where compiled classes are generated.
- `lib/`: The directory where the JUnit Platform Console Standalone JAR is stored for running tests.

## Additional Information

- [Builder Design Pattern](https://en.wikipedia.org/wiki/Builder_pattern): Learn more about the Builder Design Pattern.
- [Builder Design Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/builder): A comprehensive guide to the Builder Design Pattern on refactoring.guru.

Feel free to explore and modify the code to better understand the implementation of the Builder pattern in Java.
