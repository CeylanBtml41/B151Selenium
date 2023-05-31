package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

         // Sayfadakı linlerın sayısını ve linleri yazdıralım
     /*
       findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodunu kullanırız.
       Bu webelementlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola yazdırabilmek için
       List<Webelement> linklerLlistesi=driver.findelements(By.locator("locator değeri")) olarak kullanırız.
       Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
        */

        List<WebElement> linklerListesi =driver.findElements(By.tagName("a"));
        System.out.println("Linklerın Sayısı : "+linklerListesi.size());

        // Linkleri konsolda yazdırın

       /*
         for (WebElement w:linklerListesi) {
             System.out.println(w.getText());//Webelement'in üzerindeki yazıyı almak istiyorsak getText()methodunu kullanırız.
         }
       -------------------------------------------------------------

       for (WebElement w:linklerListesi) {
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }
        }
        */

        //lambda ile yazdıralım

        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});


        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());
        //webelemntın uzerındekı yazıyı almak ıstıyorsak getText() methodunu kullanırız

        driver.close();



    }
}
            /*
            Amazon sayfasına gıdınız
            iphone aratınız
            cıkan saonuc yazısını konsola yazdırınız
            cıkan urunlerden ilk 5 tanesıne tıklayıp sayfa baslıklarını yazdırınız
          */