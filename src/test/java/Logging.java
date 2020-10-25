import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logging {
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
        System.out.println("Go to site method");
        WebElement inputLink = driver.findElement(By.cssSelector("div.header__button.enter"));
        inputLink.click();
        WebElement inputEmail = driver.findElement(By.name("user_login"));
        WebElement inputPass = driver.findElement(By.name("user_pw"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"popup-auth-form\"]/div[3]/button"));

        inputEmail.sendKeys("Svitlana");
        inputPass.sendKeys("Password1");
        submitButton.click();

        System.out.println("Open Browser method");
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
        System.out.println("Close Browser method");
    }
}
