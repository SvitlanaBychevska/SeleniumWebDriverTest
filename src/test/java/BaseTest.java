import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("SetUp method");
    }

    @Test
    public void openBrowser(){
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().fullscreen();
        driver.findElement(By.cssSelector("a.header-topline__user-link")).click();
        WebElement inputEmail = driver.findElement(By.id("auth_email"));
        WebElement inputPass = driver.findElement(By.id("auth_pass"));
        WebElement submitButton = driver.findElement(By.className("auth-modal__submit"));
        inputEmail.sendKeys("Svitlana");
        inputPass.sendKeys("Password1");
        submitButton.click();

        System.out.println(inputEmail.getText());
String emailText = inputEmail.getText();

inputEmail.clear();

        System.out.println("Open Browser method");

    }

    @After
    public void tearDown(){
        //driver.close();
        driver.quit();
        System.out.println("Close Browser method");
    }
}
