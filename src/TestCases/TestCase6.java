package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase6 {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement sendButton = driver.findElement(By.cssSelector("[data-aid = 'CONTACT_SUBMIT_BUTTON_REND'"));

        if (sendButton.isDisplayed()) System.out.println("Send Button is displayed");
        String expectedText = "SEND";
        String actualText = sendButton.getText();

        if (expectedText.equals(actualText)) System.out.println("SEND Validation Passed");
        else System.out.println("SEND Validation FAILED");

        Driver.quitDriver();
    }
}

