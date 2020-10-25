import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\geckodriver.exe");
        System.out.println("SetUp FireFox method");
        WebDriver driverFirefox = new FirefoxDriver();
        driverFirefox.get("https://rozetka.com.ua/");
        System.out.println("Go to ROZETKA site");
        driverFirefox.quit();
        System.out.println("Close FireFox method");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        System.out.println("SetUp Chrome method");
        WebDriver driverChrome = new ChromeDriver();
        driverChrome.get("https://panama.ua/");
        System.out.println("Go to PANAMA site");
        driverChrome.quit();
        System.out.println("Close Chrome method");
    }
}

