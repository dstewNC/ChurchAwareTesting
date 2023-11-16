package PageComponents;

import AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ColumnNav extends AbstractComponents {

    By dashboard = By.xpath("//a[normalize-space()='Dashboard']");
    By list = By.xpath("//a[normalize-space()='List']");
    By grid = By.xpath("//a[normalize-space()='Grid']");
    By map = By.xpath("//a[normalize-space()='Map']");
    By groups = By.xpath("//a[normalize-space()='Groups']");
    By Lessons = By.xpath("//a[normalize-space()='Lessons']");
    By feedback = By.xpath("//a[normalize-space()='Feedback']");

    public ColumnNav(WebDriver driver, By columnNavigation) {
        super(driver);
    }

}
