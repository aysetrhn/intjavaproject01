package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {
    public static void main(String[] args) {
//        1.Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
//        2.Verify if the page URL contains youtube if not, print the right url.
//        3.Then Navigate to https://www.amazon.com/
//          Navigate back to youtube
//          Refresh the page
//          Navigate forward to amazon
//          Maximize the window
//        4.Then verify if page title includes “Amazon”, If not, print the correct title.
//        5. Verify if the page URL is https://www.amazon.com/, if not print the correct url
//        Quit the browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String actualYoutubeTitle =  driver.getTitle();
        String expectedYoutubeTitle = "youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Youtube title is: "+actualYoutubeTitle);}

            String actualYoutubeURL = driver.getCurrentUrl();   //2.step
            String expectedYoutubeURL = "youtube";
            if(actualYoutubeURL.contains(expectedYoutubeURL )){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("CORRECT URL IS: "+actualYoutubeURL);
            }


            driver.navigate().to("https://www.amazon.com/");   //3.step
            //navigating back to previous page which is youtube
            driver.navigate().back();
            driver.navigate().refresh();
            driver.navigate().forward();
            driver.manage().window().maximize();

            String actualAmazonTitle = driver.getTitle();   //4.step
            String expectedAmazonTitle = "Amazon";

            if(actualAmazonTitle.contains(expectedAmazonTitle)){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("CORRECT TITLE IS: "+actualAmazonTitle);
            }

            String actualAmazonURL = driver.getCurrentUrl();   //5.step
            String expectedAmazonURL = "https://www.amazon.com/";
            if(actualAmazonURL.equals(expectedAmazonURL )){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("CORRECT AMAZON URL IS: "+actualAmazonURL);
            }

            //driver.quit();

        }
    }

