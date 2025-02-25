# selenium-webdriver
To set up Selenium WebDriver for Java, follow these steps:

1. **Install Java Development Kit (JDK)**:
   Ensure you have JDK installed on your system. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Set Up Maven Project**:
   Create a Maven project or use an existing one. Maven helps manage dependencies and build the project.

3. **Add Selenium Dependency**:
   Add the Selenium WebDriver dependency to your `pom.xml` file. This will download the necessary Selenium libraries.

   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.29.0</version>
       </dependency>
   </dependencies>
   ```

4. **Write Test Code**:
   Write your test code to use Selenium WebDriver. Here is an example:

   ```java
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;

   public class ChromeTest {
       public static void main(String[] args) throws InterruptedException {
           // Set the path to the ChromeDriver executable
           System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

           // Create a new instance of the ChromeDriver
           WebDriver driver = new ChromeDriver();

           // Maximize the browser window
           driver.manage().window().maximize();

           // Navigate to a website
           driver.get("https://roboticqa.com");

           Thread.sleep(5000);

           // Close the browser
           driver.quit();
       }
   }
   ```

5. **Run Your Test**:
   Compile and run your test code using your IDE or Maven commands.

By following these steps, you will have set up Selenium WebDriver for Java and can start writing and running your automated tests.
