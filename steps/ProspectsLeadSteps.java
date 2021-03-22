package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Then;
import pages.ProspectsLeadPage;
import pages.ProspectsPage;

import java.io.IOException;

public class ProspectsLeadSteps extends BaseUtil {
    ProspectsLeadPage prospectsLeadPage = new ProspectsLeadPage(Driver);

    @Then("^Fill banking information$")
    public void fillBankingInformation() {
        prospectsLeadPage.bankingInfo();
    }


    @Then("^Fill creditors")
    public void fillCreditorsAsOriginlCreditor() {
        prospectsLeadPage.creditors();
    }

    @Then("^Fill program details$")
    public void fillProgramDetails() {
        prospectsLeadPage.program();
    }

    @Then("^Click on Convert$")
    public void clickOnConvert() {
        prospectsLeadPage.clickConvert();
    }

    @Then("^Fill SFS balance$")
    public void fillSFSBalance() {
        prospectsLeadPage.sfsBalance();
    }

    @Then("^Click on Client Details$")
    public void clickOnClientDetails() throws IOException {
        prospectsLeadPage.clickClientDetail();
    }
}