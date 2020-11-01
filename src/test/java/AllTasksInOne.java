import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllTasksInOne {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void booking(){
        driver.get("https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics");
        System.out.println("Open Browser method");
        driver.manage().window().fullscreen();
        WebElement logo = driver.findElement(By.xpath("//div[@class=\"js-mobile-logo\"]"));
        WebElement signInRegister = driver.findElement(By.xpath("//div/ul/li[@class=\"liOffcanvas\"]"));
        WebElement searchField = driver.findElement(By.xpath("//div/input[@type=\"text\"]"));
        WebElement searchElement = driver.findElement(By.xpath("//button[@class=\"btn btn-link js_search_button\"]"));
        WebElement navigationMenu = driver.findElement(By.xpath("//div/ul[@class=\"nav__links nav__links--products js-offcanvas-links\"]"));
        WebElement banner = driver.findElement(By.xpath("//div/a/img[@class=\"js-responsive-image\"]"));
        searchField.sendKeys("camileo");
        searchElement.click();
        WebElement submit = driver.findElement(By.xpath("//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]"));
        submit.click();
        WebElement productInfo = driver.findElement(By.xpath("//div[@class=\"add-to-cart-item\"]/div[@class=\"thumb\"]/a"));
        productInfo.click();
    }

    @Test
    public void logginingToTheSite(){
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
    @Test
    public void getCurrentURLandTitleOfThePage(){
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
    @Test
    public void printOfArticlesName() {
        driver.get("https://gloss.ua/");
        driver.manage().window().fullscreen();
        List<WebElement> storiesName = driver.findElements(By.tagName("h4"));
        for (int i = 0; i < storiesName.size(); i++) {
            String nameOfStory = storiesName.get(i).getText();
            System.out.println("i [ "+ i+ "] = " + nameOfStory);
        }
    }
    @Test
    public void anotherBrowsercheck(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\geckodriver.exe");
        System.out.println("SetUp FireFox method");
        WebDriver driverFirefox = new FirefoxDriver();
        driverFirefox.get("https://rozetka.com.ua/");
        System.out.println("Go to ROZETKA site");
        driverFirefox.quit();
        System.out.println("Close FireFox method");
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
        System.out.println("Close Browser method");
    }
}
