package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //driver.navigate().to("https://www.google.com/");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";

        if (actualURL.equals(expectedURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL: " + actualURL);

        }
    }
}