package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/**
 * Created by Pawan
 */
public class SF2Page {
    public SF2Page(WebDriver driver) { PageFactory.initElements(driver, this); }

    @FindBy(how = How.ID, using = "username")
    public static WebElement txuserName;

    @FindBy(how = How.ID, using = "password")
    public static WebElement txpassWord;

    @FindBy(how = How.ID, using = "Login")
    public static WebElement btnloginsand;

    public static void login(String userName, String password) {
        txuserName.sendKeys(userName);
        txpassWord.sendKeys(password);
}

    public void Clickloginsand() {
        btnloginsand.submit();
    }
    }
