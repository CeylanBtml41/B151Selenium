package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasına gidelım
        driver.navigate().to("https://techproeducation.com");//get() methodu ıle aynı mantıkta calısır
        Thread.sleep(3000);//Java kodlarını bekletmek ıcın Thread.sleep kullanırız.

        //Amazon sayfasına gıdelım
        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasını  baslıgını yazdıralım
        System.out.println("Amazon sayfa baslıgı :"+driver.getTitle());
        Thread.sleep(3000);

        //Techproeducatıon sayfasına gerı donelım
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa baslıgını yazdıralım
        System.out.println("Techproeducation Sayfa Baslıgı : "+driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasına tekrar gıdıp url'ı yazdıralım
        driver.navigate().forward();
        Thread.sleep(3000);

        System.out.println("Amazon sayfası Url'ı : "+driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasında ıken sayfayı yenıleyelım
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayı kapatalım
        driver.close();




    }
}
