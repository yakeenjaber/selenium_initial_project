
package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // 1. Private Constructor
    private Driver(){

    }

    // 2. Private Driver
    private static WebDriver driver;

    // 3. Get Driver and quit driver Method
    public static WebDriver getDriver(){
        if(driver == null){
            // Telling your system where your chrome driver is located
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\selenium_initial_project\\chromedriver.exe");
            // Create the object of the web browser that you are automating
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //waiting only that web element to be EXISTED
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://comfyelite.com/");
            WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
            if (contactUs.isEnabled() && contactUs.isDisplayed()) System.out.println("Contact Us Page Validation PASSED");
            else System.out.println("Contact Us Page Validation FAILED");
            contactUs.click();
            System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"));
        }
        return driver;
    }

    public static void quitDriver(){
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }
}