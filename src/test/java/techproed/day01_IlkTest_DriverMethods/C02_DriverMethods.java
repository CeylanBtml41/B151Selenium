package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("http://amazon.com");

        //getTitle()
        System.out.println("Amazon Saysa Baslıgı : "+driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        System.out.println("Amazon Window Handle Değeri : "+driver.getWindowHandle());//A57E5513B783015906092E2650509030

        driver.get("http://techproeducation.com");
        System.out.println("Techproeducation Actual Baslıgı : "+driver.getTitle());//getTitle() sayfa baslıgını  verır.

        //getCurrentUrl()  gıdılen sayfanın url'ını verır
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());

        //getPageSource() Acılan sayfanın kaynak kodlarını String olarak verır
       // System.out.println(driver.getPageSource());//bılerek yoruma aldık

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());//FA8FD4B4BC0CA736429EC1AA14A05517


    }
}
