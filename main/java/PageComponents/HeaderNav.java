package PageComponents;

import AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderNav extends AbstractComponents {

    By help = By.xpath("//button[normalize-space()='Help']");
    By logOut = By.xpath("//button[@id='quickstart-sign-out']");
    public HeaderNav(WebDriver driver, By headerNavigation) {
        super(driver);
    }

}
