package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //aramakutusunu locate ediniz iphone aratınız
       WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
       aramaKutusu.sendKeys("iphone");
       Thread.sleep(3000);
       aramaKutusu.submit();//submit() methodu ıle enter'a bastık.
       //2.arama yapmak istersem
      //driver.findElement(By.name("field-keywords"));
      // driver.findElement(By.name("field-keywords")).sendKeys("iphone");
      // Thread.sleep(3000);
      // driver.findElement(By.name("field-keywords")).submit();
      // driver.navigate().back();
      // driver.findElement(By.name("field-keywords")).sendKeys("samsung");
      // driver.findElement(By.name("field-keywords")).submit();


         driver.close();
    }
}
