package Facebookassignment;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
public class FacebookAssignmet {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ho.raj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.facebook.com/";

        driver.get(baseUrl);

        driver.manage().window().maximize();
        WebElement createNewAcc = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(createNewAcc).click().build().perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement fistName = driver.findElement(By.xpath("//*[@id='fullname_field']//input[@name='firstname']"));
        actions.moveToElement(fistName)
            .keyDown(Keys.SHIFT).sendKeys("s","a","m").keyUp(Keys.SHIFT)
                .keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c")
                .keyUp(Keys.CONTROL).build().perform();

        WebElement lastName = driver.findElement(By.xpath("//*[@id='fullname_field']//input[@name='lastname']"));
        Actions actions1 = new Actions(driver);

    //    actions1.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();//working paste

         actions1.moveToElement(lastName).contextClick(lastName).build().perform();
        try {
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement phoneNo = driver.findElement(By.xpath("//*[@name='reg_email__']"));

        actions.sendKeys(phoneNo,"7726287161").build().perform();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();




    }
}
