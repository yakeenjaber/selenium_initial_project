package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1 {

    public static void main(String[] args) {


        //Given user navigates to “https://comfyelite.com/”
        //When user clicks on “CONTACT US” link in the header
        //Then user should be navigated to “CONTACT US” page
        //And user should be able to see ComfyElite logo
        //And user should be able to see heading2 as “High quality comfy pillows and accessories for travel, office and home.”

        WebDriver driver = Driver.getDriver();

        WebElement logoImage = driver.findElement(By.xpath("//*[@id=\"n-48560\"]"));

        if(logoImage.isDisplayed()) System.out.println("Comfy Elite image validation is PASSED");
        else System.out.println("Comfy Elite validation is FAILED!!!");

        WebElement heading2 = driver.findElement(By.xpath("//*[@id=\"n-48560\"]"));

        if(heading2.isDisplayed()) System.out.println("Comfy Elite slogan validation is PASSED");
        else System.out.println("Comfy Elite slogan validation is FAILED!!!");

        Driver.quitDriver();
    }
}
