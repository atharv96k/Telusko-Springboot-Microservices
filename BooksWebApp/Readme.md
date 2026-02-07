📝 Log4j2 Implementation in Spring Boot
This module demonstrates how to integrate and configure Log4j2 for advanced logging within a Spring Boot microservice. Moving beyond standard console printing, this setup allows for structured logging, file-based storage, and custom log levels.

🚀 Why Log4j2?
In a microservices architecture (like the one used in this repository), standard System.out.println() is insufficient. Log4j2 provides:

Performance: Faster than Logback (the Spring Boot default).

Flexibility: Easy routing of logs to the console, files, or external monitoring tools.

Log Levels: Granular control using DEBUG, INFO, WARN, ERROR, and FATAL.

🛠️ Tech Stack
Framework: Spring Boot

Logging Library: Log4j2 (Starter)

Build Tool: Maven

⚙️ Configuration Steps
1. Dependency Management
To use Log4j2, the default Spring Boot starter logging (Logback) must be excluded in the pom.xml:

XML
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-log4j2</artifactId>
</dependency>
2. The Log4j2 XML Configuration
The behavior of the logger is defined in src/main/resources/log4j2.xml. It handles:

Appenders: Defining where logs go (Console, RollingFile).

Pattern Layout: Formatting the timestamp, thread name, log level, and message.

Loggers: Setting specific levels for different packages.

💻 Usage Example
In your Java classes, initialize the logger as follows:

Java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("Hello API was accessed");
        logger.error("Example of an error log level");
        return "Log4j2 is working!";
    }
}
📂 Project Structure
Plaintext
Log4J/
├── src/
│   ├── main/
│   │   ├── java/        # Controller and Logic
│   │   └── resources/
│   │       └── log4j2.xml  # Core logging configuration
└── pom.xml              # Dependency exclusions
✅ Key Takeaways
Always exclude the default logging starter to avoid dependency conflicts.

Use RollingFile appenders in production to prevent log files from growing infinitely.

Use different patterns for console (colorful) and files (structured) to make debugging easier.

💡 Suggestions for your Repo:
Add a logs/ folder: Mention that logs are stored in a local directory (and remember to add /logs to your .gitignore!).

Integration: In a microservices context, these logs are usually the first step before sending data to Zipkin or ELK Stack