package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        WebElement checkBox = driver.findElement(By.cssSelector("[data-aid = 'CONTACT_FORM_EMAIL_OPT_IN'"));
        WebElement checkBoxInput = driver.findElement(By.xpath("(//input[@role='textbox'])[4]"));
        checkBox.click();
        System.out.println(checkBoxInput.isSelected() ? "Checkbox (Select) Validation PASSED" : "Checkbox (Select) Validation FAILED");
        checkBox.click();
        System.out.println(!checkBoxInput.isSelected() ? "Checkbox (Deselect) Validation PASSED" : "Checkbox (Deselect) Validation FAILED");


        Driver.quitDriver();
    }
}
