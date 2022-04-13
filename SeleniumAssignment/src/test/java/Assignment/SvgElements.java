package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SvgElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ho.raj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl ="https://boringavatars.com/?ref=onepagelove";
        driver.get(baseUrl);
        WebElement m=driver.findElement(By.xpath("((//div[@class='sc-kstrdz btjemE Avatar'])[3])//*[local-name()='svg']"));





    /*    Actions a = new Actions(driver);
        a.moveToElement(m).
                click().build().perform();

     */

       driver.quit();
    }
}
