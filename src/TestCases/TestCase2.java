package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = Driver.getDriver();

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Connect With Us']"));
        if (heading1.isDisplayed()) System.out.println("Heading 1 Validation PASSED");
        else System.out.println("Heading 1 Validation FAILED!");

        WebElement facebookIcon = driver.findElement(By.cssSelector("[aria-label='Facebook Social Link'"));
        if (facebookIcon.isDisplayed() && facebookIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601")) System.out.println("Facebook icon validation PASSED");
        else System.out.println("Facebook icon FAILED!");

        WebElement instagramIcon = driver.findElement(By.cssSelector("[aria-label='Instagram Social Link'"));
        if (instagramIcon.isDisplayed() && instagramIcon.getAttribute("href").equals("https://www.instagram.com/comfyelite")) System.out.println("Instagram icon validation PASSED");
        else System.out.println("Instagram icon FAILED!");

        Driver.quitDriver();
    }
}
