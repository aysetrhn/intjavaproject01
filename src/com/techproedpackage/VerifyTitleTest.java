package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {

    public static void main(String[] args) {
        //        Navigate to google homepage
        //        Verify if google title is “Google”

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //to get the page title we use
       String actualTitle =  driver.getTitle();
       String expectedTitle = "Google";
       if(actualTitle.equals(expectedTitle)){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
           System.out.println("Expected title: "+expectedTitle);
           System.out.println("Actual title: "+actualTitle);
       }
    }
}
