package techproed.day06_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {
    public static void main(String[] args) throws InterruptedException {

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
        //Webelemnetleri yazısını consola yazdısınız
        WebElement hybridBike= driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));// --> //*[.='Hybrid Bikes']
        System.out.println(hybridBike.getText());
        WebElement electricBike=driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike =driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());
        System.out.println("*****************************************");

        //Bikes Altındaki tum lınklerı(webelement) consola yazdırın
        List<WebElement> linklerListesi =driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
        /*
         XPATH kullanımda bır sayfadakı webelementlerı mudehale etmek ıstedıgımızde xpath ıle locate aldıgımızda bırden fazla sonuc verebılır .
         [position()>=10 and position()<=16] bu kullanımla aralık belırterek ıstedıgımız webelemntlerı secıp mudehale edebılırız.
         */


       //lambda ıle yazdırdık
       linklerListesi.forEach(t-> System.out.println(t.getText()));
        System.out.println("*******************************************");
        //foreach ıle yaptık
        for (WebElement w:linklerListesi) {
            System.out.println(w.getText());
        }

        //Bu lınklerı hepsını tıklayalım ve sayfa baslıklarını alalım.
        for (int i = 0; i < linklerListesi.size(); i++) {
           linklerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(linklerListesi.get(i).getText());
            linklerListesi.get(i).click();
            Thread.sleep(3000);

            driver.navigate().back();

            Thread.sleep(3000);

        }


    }
}
