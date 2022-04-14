package Facebookassignment;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class UploadingDocument {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\ho.raj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://smallseotools.com/plagiarism-checker/";

        driver.get(baseUrl);
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement uploadElement = driver.findElement(By.xpath("//*[@id='fileupload']"));


        uploadElement.sendKeys("C:\\Users\\ho.raj\\Downloads\\ting ting.txt");

        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();


    }
}
