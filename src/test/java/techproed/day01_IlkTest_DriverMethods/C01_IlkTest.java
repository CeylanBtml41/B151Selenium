package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {


        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliiklerini ayarlamak için setProperty() methodu ile kullanırız.
        //setPropery methodu ile class'ımıza driver'ın fızıkı yolunu belırtırız


        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "value" a ulaşılabilir.

        WebDriver driver =new ChromeDriver();//chromedriver turunde yenı bır obje olusrurduk

        driver.get("http://techproeducation.com");//get() methodu ıle Strıng olarak gırılen url'e gıderız

    }

}
