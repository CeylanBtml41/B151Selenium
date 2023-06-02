package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_relativeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona gidelim
        driver.get("https://amazon.com");

       //city bike aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));//-->//*[@*='text']
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

      //relative locator kullanarak hybrid bike altindaki elemente tiklayalim
       WebElement hybridBike= driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));// --> //*[.='Hybrid Bikes']
        WebElement electricBike=driver.findElement(with(By.tagName("a")).below(hybridBike));
        WebElement completeBike =driver.findElement(with(By.tagName("a")).below(electricBike));
        completeBike.click();
    }


}