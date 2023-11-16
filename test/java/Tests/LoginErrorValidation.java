package Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginErrorValidation extends BaseTest {

    @Test
    public void IncorrectLogin() throws InterruptedException {

        landingPage.loginApplication("davidstewartnc+1@gmail.com", "wrongPassword");
        Thread.sleep(2000);
        Assert.assertEquals("Wrong password.", landingPage.getErrorMessage());

    }
}
