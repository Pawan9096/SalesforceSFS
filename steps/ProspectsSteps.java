package steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.ProspectsPage;

public class ProspectsSteps extends BaseUtil {
    ProspectsPage prospectsPage = new ProspectsPage(Driver);

    @Then("^User Creates New Prospects$")
    public void userCreatesNewProspects() {
        prospectsPage.clickNewButton();
        forcewait(4000);
        prospectsPage.fillProspects();

    }
}
