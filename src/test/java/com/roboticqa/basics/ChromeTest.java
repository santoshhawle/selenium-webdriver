    package com.roboticqa.basics;
    import org.openqa.selenium.chrome.ChromeDriver;
    /**
     * This class contains a simple test to open a website in the Chrome browser using Selenium WebDriver.
     */
    class ChromeTest {

        /**
         * The main method to execute the test.
         * It opens the Chrome browser, maximizes the window, navigates to the specified URL, waits for 5 seconds, and then closes the browser.
         *
         * @param args Command line arguments (not used in this test).
         * @throws InterruptedException If the thread is interrupted while sleeping.
         */
        public static void main(String[] args) throws InterruptedException {
            // Create a new instance of the ChromeDriver
            ChromeDriver chromeDriver = new ChromeDriver();

            // Maximize the browser window
            chromeDriver.manage().window().maximize();

            // Navigate to the specified URL
            chromeDriver.get("https://roboticqa.com");

            // Wait for 5 seconds
            Thread.sleep(5000);

            // Close the browser
            chromeDriver.quit();
        }
    }