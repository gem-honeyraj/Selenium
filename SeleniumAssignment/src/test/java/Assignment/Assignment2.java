package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Assignment2 {
    public static void main(String[] args) {

        //Automating amazon web page
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ho.raj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl ="https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hmh5l8jr5_e&adgrpid=61764313147&hvpone=&hvptwo=&hvadid=486381533661&hvpos=&hvnetw=g&hvrand=8211004445131449903&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050480&hvtargid=kwd-327061083&hydadcr=14455_2154377&gclid=EAIaIQobChMIrImj0aOQ9wIVQdtMAh1uxg2EEAAYASAAEgLT4fD_BwE";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        String givenSearch="books";

        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys(givenSearch);

        driver.findElement(By.xpath("//*[@class='nav-search-submit nav-sprite']")).click();

        WebElement resultFor=driver.findElement(By.xpath("//*[@id='search']//span[3]"));
        String resultForText= resultFor.getText();

       //
        if(resultForText.substring(1,resultForText.length()-1).equals(givenSearch))
        {
            System.out.println("Results are shown for "+resultForText);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


        WebElement ele = driver.findElement(By.xpath("//div[@data-index='2']//h2//span"));

        System.out.println("Name of the first Book Displayed is: " + ele.getText());

        driver.quit();

    }
}
