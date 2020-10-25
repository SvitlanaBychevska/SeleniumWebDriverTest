import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("SetUp method");
    }

    @Test
    public void openBrowser(){
        driver.get("https://gloss.ua/");
        int quantityOfNamesStories = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[3]/div/div/div[1]/div/div/div[2]/ul/li[*]")).size();
        System.out.println("Quantity of Articles: " + quantityOfNamesStories);

        for (int i=1; i<=quantityOfNamesStories; i++){
            System.out.println("i = " + i + " --> " + driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/div/div[1]/div/div/div[2]/ul/li[" + i + "]")).getText());
           System.out.println("//*[@id=\"content\"]/div/div[3]/div/div/div[1]/div/div/div[2]/ul/li[" + i + "]");
        }
    }

    @After
    public void tearDown(){
        driver.quit();
        System.out.println("Close Browser method");
    }
}
