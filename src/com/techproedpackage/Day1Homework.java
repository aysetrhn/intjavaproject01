package com.techproedpackage;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Homework {
//            Create a new class : Day1Homework
//           1. Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
//           2.Verify if the page URL contains facebook; if not, print the right url.
//           3.Then Navigate to https://www.walmart.com/
//            Verify if the walmart page title includes “Walmart.com”
//           4. Navigate back to facebook
//            Refresh the page
//            Maximize the window
//            Close the browser
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
               //1.step
               String actualFacebookTitle =  driver.getTitle();
               String expectedFacebookTitle = "facebook";
            if(actualFacebookTitle.equals(expectedFacebookTitle)){
                System.out.println("PASS");
            }else {
                System.out.println("FAIL");
                System.out.println("Actual Facebook title is: " + actualFacebookTitle);
            }
                //2.step
            String actualFacebookURL = driver.getCurrentUrl();
            String expectedFacebookURL = "facebook";
            if(actualFacebookURL.contains(expectedFacebookURL )){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("CORRECT URL IS: "+actualFacebookURL);
            }

            //3.step
            driver.navigate().to(" https://www.walmart.com/");
            String actualWalmartTitle = driver.getTitle();
            String expectedWalmartTitle = "Walmart.com";
            if(actualWalmartTitle.contains(expectedWalmartTitle)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }

            //4.step
            driver.navigate().back();
            driver.navigate().refresh();
            driver.manage().window().maximize();
            driver.quit();
            }
}
