package PageObjects;

import AbstractComponents.AbstractComponents;
import PageComponents.ColumnNav;
import PageComponents.HeaderNav;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractComponents {

    By columnNavigation = By.cssSelector(".nav.flex-column");
    By headerNavigation = By.xpath("//div[@id='navbarSupportedContent']");

    WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ColumnNav getColumnNav(){
        return new ColumnNav(driver,columnNavigation);
    }

    public HeaderNav getHeaderNavigation(){
        return new HeaderNav(driver,headerNavigation);
    }



}
