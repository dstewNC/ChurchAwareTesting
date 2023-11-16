package TestComponents;

import PageObjects.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

        public WebDriver driver;
        public LandingPage landingPage;

        public WebDriver initializeDriver() {


            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            ChromeDriver driver = new ChromeDriver(options);

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return driver;
        }

    @BeforeMethod(alwaysRun = true)
    public LandingPage launchApplication() {

        driver = initializeDriver();
        landingPage = new LandingPage(driver);
        landingPage.goTo();
        return landingPage;

    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){

       driver.close();
    }
}
