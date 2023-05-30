package techproed.day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       //Amazon sayfasına gidelim
       driver.get("https://amazon.com");

       //Sayfa başlığının Amazon içerdiğini test edelim
       String actualTitle= driver.getTitle();
       String expectedTitle ="Amazon";
       if(actualTitle.contains(expectedTitle)){
           System.out.println("Test PASSED");
       }else System.out.println("Test FAILED");

       //Url'in https://www.amazon.com olduğunu test edelim
       String actualUrl = driver.getCurrentUrl();
       String expectedUrl="https://amazon.com";
       if(actualUrl.equals(expectedUrl)){
           System.out.println("Test PASSED");

       }else System.out.println("Test FAILED ->"+actualUrl);//url yanslıs oldugu ucın fail verdi.sonunda bır/ daha var eklersem pass olur


       //Sayfayı kapatalım

       driver.close();//Browser'ı kapatır
       //driver.quit()==>Bırden fazla browser varsa hepsını  kapatır


    }
}
