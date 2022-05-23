package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase3 {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement contactUs = driver.findElement(By.cssSelector("[data-aid = 'CONTACT_SECTION_TITLE_REND']"));
        if (contactUs.isDisplayed() && contactUs.isEnabled()) System.out.println("Heading 2 (Contact Us) PASSED");
        else System.out.println("Heading 2 (Contact Us) FAILED");

        WebElement sendMsg = driver.findElement(By.cssSelector("[data-aid = 'CONTACT_FORM_TITLE_REND']"));
        if (sendMsg.isDisplayed() && sendMsg.isEnabled()) System.out.println("Heading 4 (Send us a message) PASSED");
        else System.out.println("Heading 4 (Send us a message) FAILED");

        Driver.quitDriver();
    }
}
