import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("SetUp method");
    }

    @Test
    public void openBrowser(){
        driver.get("https://panama.ua/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.get("https://rozetka.com.ua/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
        System.out.println("Close Browser method");
    }
}
