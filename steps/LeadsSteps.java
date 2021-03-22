package steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.LeadPage;
import pages.ProspectsPage;

public class LeadsSteps extends BaseUtil {
    LeadPage leadPage = new LeadPage(Driver);

    @And("^Click on Global search$")
    public void clickOnGlobalSearch() {
       leadPage.clickglobalSearch();
    }


    @Then("^Select Lead from the search result$")
    public void selectLeadFromTheSearchResult() {

    }

    @Then("^Enter the ([^\"]*)$")
    public void enterTheClientName(String clientName) {
        leadPage.searchClientName(clientName);
    }
}
