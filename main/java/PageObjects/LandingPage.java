package PageObjects;

import AbstractComponents.AbstractComponents;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents {
    WebDriver driver;


    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "email")
    WebElement userEmail;
    @FindBy(id = "password")
    WebElement userPassword;
    @FindBy(id = "quickstart-sign-in")
    WebElement signIn;

    public HomePage loginApplication(String email, String password) {

        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        signIn.click();
        HomePage homePage = new HomePage(driver);
        return homePage;
    }
    public String getErrorMessage(){
        Alert alert = driver.switchTo().alert();
        String errorMessage = alert.getText();
        System.out.println(errorMessage);
        return errorMessage;
    }



    public void goTo(){
        driver.get("https://www.churchaware.com/");
    }

}
