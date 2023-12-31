package AbstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponents {

    protected WebDriver driver;

    public AbstractComponents(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
