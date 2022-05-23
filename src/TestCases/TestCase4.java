package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase4 {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement firstNameBox = driver.findElement(By.cssSelector("[data-aid = 'First Name"));
        System.out.println(firstNameBox.isDisplayed() && firstNameBox.isEnabled() ? "First Name box PASSED" : "First Name box FAILED");
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        firstNameInput.sendKeys("Yakeen");
        System.out.println(firstNameInput.getAttribute("value").equals("Yakeen") ? "First name input validation PASSED" : "First name input validation failed");


        WebElement lastNameBox = driver.findElement(By.cssSelector("[data-aid = 'Last Name"));
        System.out.println((lastNameBox.isDisplayed() && lastNameBox.isEnabled()) ? "Last Name box PASSED" : "Last Name box FAILED");
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@data-aid= 'Last Name']"));
        lastNameInput.sendKeys("Jaber");
        System.out.println(lastNameInput.getAttribute("value").equals("Jaber") ? "Last name input validation PASSED" : "Last name input validation FAILED");


        WebElement email = driver.findElement(By.xpath("//div[@data-aid = 'CONTACT_FORM_EMAIL']"));
        System.out.println((email.isDisplayed() && email.isEnabled()) ?("Email box PASSED") : "Email Box FAILED");
        WebElement emailInput = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        emailInput.sendKeys("helloworld123@gmail.com");
        System.out.println(emailInput.getAttribute("value").equals("helloworld123@gmail.com") ? "Email Input Validation PASSED" : "Email Input Validation FAILED");


        WebElement messageBox = driver.findElement(By.cssSelector("[data-aid = 'CONTACT_FORM_MESSAGE'"));
        System.out.println((messageBox.isDisplayed() && messageBox.isEnabled()) ? "Message Box PASSED" : "Message Box FAILED");
        messageBox.sendKeys("This is the message Box");
        System.out.println(messageBox.getText().equals("This is the message Box") ? "Message Box Text PASSED" : "Message Box Test FAILED");

        Driver.quitDriver();
    }
}
