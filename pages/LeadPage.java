package pages;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

/**
 * Created by Pawan
 */
public class LeadPage extends BaseUtil {

    public LeadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    LeadPage leadPage = new LeadPage(Driver);

    @FindBy(how = How.XPATH, using = "//button[text()='Search...']")
    public WebElement globalSearch;

    public void clickglobalSearch()
    {
        clickWebelement(globalSearch);
    }

    public void searchClientName(String clientName)
    {
        globalSearch.sendKeys(clientName);
    }
}
