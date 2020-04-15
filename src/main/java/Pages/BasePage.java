package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;

    public void initDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ksrinivasan\\IdeaProjects\\SeleniumCC\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String urlTitle()
    {
        return driver.getTitle();
    }

    public void cleanDriver()
    {
        driver.quit();
    }
}
