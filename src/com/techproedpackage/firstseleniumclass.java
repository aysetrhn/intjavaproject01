package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver_win32\\chromedriver.exe");

        //creating chrome webdriver
        WebDriver driver = new ChromeDriver();

        //going to the website use get() ; method
        driver.get("https://www.google.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //To close the web driver webdriver we use close()  or quit()
        //What is the difference between close() and quit()
        //close() is closing only the current page but quit() all pages.
        driver.quit();

    }
}
