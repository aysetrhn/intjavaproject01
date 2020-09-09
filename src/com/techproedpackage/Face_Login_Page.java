package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page {
//        1. go to https://www.facebook.com/
//        2. Test if below username and password is valid.
//    username="testusername"
//    password="testpassword"
//    Step 1. locate the username box
//    Step 2/ locate the password box
//    Step 3. locate teh signin button
//    Ste4 4. click on the sign in button
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // I USE cssSelector() METHOD
//        WebElement emailBox=driver.findElement(By.cssSelector("#email"));
//        emailBox.sendKeys("testusername");
//
//        WebElement passwordBox=driver.findElement(By.cssSelector("#pass"));
//        passwordBox.sendKeys("testusername");

//        WebElement loginButton=driver.findElement(By.cssSelector("#u_0_b"));
//        loginButton.click();



        // I USE xpath() METHOD
//        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
//        email.sendKeys("testusername");
//
//        WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
//        password.sendKeys("testpassword");

//        WebElement signinButton=driver.findElement(By.xpath("//input[@type='submit']"));
//        signinButton.click();

        //locate radio buttons for all of them
        //On radio button, we can pick only one option.
        WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        female.click();
        WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

        WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));


//        1.Find the webelements of
//        "Sign Up"
//        "Connect with friends and the world around you on Facebook."
//        2.Locate and send text to
//        "First name"=testfirstname
//        "Last name"=testlastname
//        "Mobiel number or email"=test@gmail.com
//        "New Password"=testpassword

        WebElement signIn=driver.findElement(By.xpath("//h2[@class='_8est']"));
        System.out.println(signIn.getText());

        WebElement element=driver.findElement(By.xpath("//*[.='Connect with friends and the world around you on Facebook.']"));
        System.out.println(element.getText());

        WebElement firstName =driver.findElement(By.xpath("//input[@id='u_0_o']"));
        firstName.sendKeys("testfirstname");
        WebElement lastName =driver.findElement(By.xpath("//input[@id='u_0_q']"));
        lastName.sendKeys("testlastname");
        WebElement email =driver.findElement(By.xpath("//input[@id='u_0_t']"));
        email.sendKeys("test@gmail.com");
        WebElement newPassword =driver.findElement(By.xpath("//input[@id='u_0_y']"));
        newPassword.sendKeys("testpassword");


    }
}
