package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators01 {
    //        Create a class : LocatorsIntro
//        Create main method and complete the following task.
//        When user goes to http://a.testaddressbook.com/sign_in
//        Locate the elements of email textbox,password textbox, and signin button
//        Enter below username and password then click sign in button
//        Username :  testtechproed@gmail.com
//        Password : Test1234!
//        Then that the expected user id  testtechproed@gmail.com
//        Verify the Addresses and Sign Out  texts are displayed
//        Find the number of total link on the page
//        Sign out from the page
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        WebElement userID = driver.findElement(By.className("navbar-text"));
        System.out.println("USER ID WEB ELEMENT: "+userID);
        //System.out.println("USER ID TEXT: "+userID.getText());
        String actualUserID = userID.getText();
        System.out.println("USER ID TEXT: "+actualUserID);
        String expectedUserID ="testtechproed@gmail.com";
        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID: "+actualUserID);
            System.out.println("EXPECTED USER ID: "+expectedUserID);

        }

        //        Find the number of total link on the page
        // findElements() methodu birden cok element return eder. List<WebElement>
        List<WebElement> listOfLinkElements = driver.findElements(By.tagName("a"));
         System.out.println("Bu web sayfasinda "+listOfLinkElements.size()+" tane link vardir");

         System.out.println("1.link element: "+listOfLinkElements.get(0));
         System.out.println("1.link element text: "+listOfLinkElements.get(0).getText());
         System.out.println("2.link element: "+listOfLinkElements.get(1));
         System.out.println("2.link element text: "+listOfLinkElements.get(1).getText());
         System.out.println("3.link element: "+listOfLinkElements.get(2));
         System.out.println("3.link element text: "+listOfLinkElements.get(2).getText());

        for(WebElement element:listOfLinkElements){
            System.out.println(element.getText());
        }



    }
}
