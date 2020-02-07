package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GloLoginPage {

    @FindBy (id = "login")
    WebElement Login;

    @FindBy (id = "password")
    WebElement Pswrd;

    @FindBy (xpath = "//input[@type='submit']")
    WebElement Submt;

    public void Glo_Login(String user, String Pass)
    {
        Login.sendKeys(user);
        Pswrd.sendKeys(Pass);
        Submt.click();

    }
}
