package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Pawan
 */
public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "username")
    public WebElement txtUserName;

    @FindBy(how = How.ID, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.ID, using = "Login")
    public WebElement btnLogin;

    public void Login(String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }
    public void ClickLogin()
    {
        btnLogin.submit();
    }
}
