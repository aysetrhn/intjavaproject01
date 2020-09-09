package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {
    public static void main(String[] args) {
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

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell E7250\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");


        //Locate the elements of email textbox,password textbox, and signin button
        //Writing locator for email textbox
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
        //We created the element for email textbox. It means we can use the methods of teh webelement
        emailTextbox.sendKeys("testtechproed@gmail.com");
        //Writing locator for password textbox
        WebElement passwordTextbox=driver.findElement(By.id("session_password"));
        passwordTextbox.sendKeys("Test1234!");
        //Writing the locator for signin button
        WebElement signInButon=driver.findElement(By.name("commit"));
        signInButon.click();
        //Then verify that the expected user id  testtechproed@gmail.com
        //locating the user id element
        WebElement userId=driver.findElement(By.className("navbar-text"));
        //Do you get testtechproed@gmail.com or NOT
        System.out.println("USER ID WEBELEMENT : "+userId);
        //getText(); method get the visible text of the element. It returned a string.
        String actualUserId= userId.getText();
        System.out.println("USER ID TEXT : "+actualUserId);
        String expectedUserID="testtechproed@gmail.com";
        //Verifying is the user id is as expected
        if (actualUserId.equals(expectedUserID)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ID IS : "+actualUserId);
            System.out.println("EXPECTED ID IS : " +expectedUserID);
        }
        //By.linkText(); method will work for links only.
        WebElement addressLink=driver.findElement(By.linkText("Addresses"));
        String actualAddressLink=addressLink.getText();
        String expextedAddressLInk="Addresses";
        if (actualAddressLink.equals(expextedAddressLInk)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ADDRESS LINK IS : "+actualAddressLink);
            System.out.println("EXPECTED ADDRESS LINK IS : " +expextedAddressLInk);
        }
        //Checking if Sign Out text is displayed as expected
        String expectedSignout= "Sign Out";
        //String actualSignout = driver.findElement(By.linkText("Sign out")).getText();
        //Or we can use below combination
        WebElement signOutElement=driver.findElement(By.linkText("Sign out"));
        String actualSignout=signOutElement.getText();
        if(actualSignout.equals(expectedSignout)){
            System.out.println("PASS: " + actualSignout);
        }
        else {
            System.out.println("FAIL");
            System.out.println("ACTUAL TEXT IS " + actualSignout);
            System.out.println("EXPEXTED TEXT IS " + expectedSignout);
        }

        //Find the number of total link on the page
        //findElements(); returns multiple elements -->list of webElements  List<WebElement>
        //findElement(); returns only one single webElements -> Returns a string
        List<WebElement> listOfLinkElement = driver.findElements(By.tagName("a"));
        System.out.println("There are "+listOfLinkElement.size()+" links on the page");
        //printing each link one by one
        //3 elements -> first index starts at get(0);
        System.out.println("The first webelement : "+listOfLinkElement.get(0));  //returns webelement
        //printing the first element -> index of second element is 0
        System.out.println("The first text: "+listOfLinkElement.get(0).getText()); //returns the text
        //printing the second element -> index of second element is 1
        System.out.println("The second text: "+listOfLinkElement.get(1).getText());
        //printing the third element -> index of second element is 2
        System.out.println("The third text: "+listOfLinkElement.get(2).getText());

        //print all elements that is a link using for each or for loop
        for(WebElement element :listOfLinkElement){
            System.out.println(element.getText());
        }
        //print Addresses and Sign out link partialLinkText
        WebElement addressByPartialLinkText = driver.findElement(By.partialLinkText("dresse"));
        String addressStringByPartialLinkText=addressByPartialLinkText.getText();
        System.out.println("Address by partial linktext: "+addressStringByPartialLinkText);
        //Printing Sign out using partial link text
        WebElement signOutByPartialLinkText = driver.findElement(By.partialLinkText("ign"));
        String signOutStringByPartialLinkText=signOutByPartialLinkText.getText();
        System.out.println("Signout by partial linktext: "+signOutStringByPartialLinkText);


        //Sign out from the page
        //WebElement signOutElement=driver.findElement(By.linkText("Sign out"));
        signOutElement.click();
    }
}
