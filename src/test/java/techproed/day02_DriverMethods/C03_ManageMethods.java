package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu : "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları : "+driver.manage().window().getSize());

        //Browser'ı maximize edelım
        driver.manage().window().maximize();
        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim web elementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */

        //Techproeducatıon sayfasına  gıdelım
        driver.get("https:techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu : "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları : "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize edelım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));//istedıgımız konuma getırıyor
        driver.manage().window().setSize(new Dimension(600,600));//istedıgımız sıze'a getırıyor
        Thread.sleep(3000);

        //sayfayı kapatalım
        driver.close();



//Thread.sleep Javadan gelir kac saniye dersek kodu bekletir ama
        // implicitlyWait() methodu Selenium dan gelir ve istenilen sayfa acilincaya kadar bekleme suresini belirtir.
        // implicitlyWait() methodu ile istedigimiz kadar bekleme suresi koyabiliriz.
        // Web elementini gordugu anda bir alt satira gecerek kodu okumaya devam eder


    }
}
