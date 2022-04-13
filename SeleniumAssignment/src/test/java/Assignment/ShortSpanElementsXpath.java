package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class ShortSpanElementsXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ho.raj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl ="https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hmh5l8jr5_e&adgrpid=61764313147&hvpone=&hvptwo=&hvadid=486381533661&hvpos=&hvnetw=g&hvrand=8211004445131449903&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050480&hvtargid=kwd-327061083&hydadcr=14455_2154377&gclid=EAIaIQobChMIrImj0aOQ9wIVQdtMAh1uxg2EEAAYASAAEgLT4fD_BwE";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));

        Actions a = new Actions(driver);
        a.click(element).build().perform();

        WebElement elment = driver.findElement(By.xpath("(//*[@id=\"searchDropdownBox\"])//option[1]"));
        System.out.println(elment.getText());

        a.release();

        driver.quit();





    }
}
