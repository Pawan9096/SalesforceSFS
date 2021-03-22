package steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class HomePageSteps extends BaseUtil {
    private  BaseUtil base;
    public HomePageSteps(BaseUtil base) {
        this.base = base;
    }

    HomePage homePage = new HomePage(base.Driver);

    @And("^User Click on Prospects$")
    public void userClickOnProspects() {
    waitTillPageLoad(5000);
    homePage.clickProspectTab();
    forcewait(5000);
    try {
        switchToNewWindow();
        Driver.close();
        switchToParentWindow();

    }
    catch (Exception e)
    {
        System.out.println("No Popup Window");
    }
    }
}