package com.techproedpackage;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

    // •1.Create a new class : AmazonSearch
    // •2.Go to https://www.amazon.com/
    // •3.Search for “porcelain teapot”
    // •4.Then click on "Best Sellers"
    // •5.Then print how many starts the first product have
    // •5.Then click on first product
    // •6.Then print the first product name
    // •7.Then click on "Add to Card" button
    // •8.Then verify the "Sing-In" text is visible. Use if-else statement to veryfy the expexted text

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
               WebDriver driver = new ChromeDriver();
               driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.name("field-keywords"));
            searchBox.sendKeys("porcelain teapot");
            searchBox.submit();

        driver.findElement((By.linkText("Today's Deals"))).click();

        WebElement howManyStars=driver.findElement(By.linkText("21"));
        System.out.println("RESULT :"+howManyStars.getText());

        WebElement productName =driver.findElement(By.className("a-declarative"));
        System.out.println("Product name: " +productName.getText());

        WebElement addToCart =driver.findElement(By.id("100 a8951db7-announce"));
        addToCart.click();

        WebElement signInElement=driver.findElement(By.linkText("Sign in"));
        String actualSignIn=signInElement.getText();
        String expectedSignIn= "Sing-In";
        if(actualSignIn.equals(expectedSignIn)){
            System.out.println("PASS: " + actualSignIn);
        }
        else {
            System.out.println("FAIL");
            System.out.println("ACTUAL TEXT IS " + actualSignIn);
            System.out.println("EXPEXTED TEXT IS " + expectedSignIn);
        }







    }










}
