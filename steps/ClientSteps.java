package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.ClientPage;

public class ClientSteps extends BaseUtil {
    ClientPage clientPage = new ClientPage(Driver);

    @Given("^User Click on Clients$")
    public void user_Click_on_Clients() {
        clientPage.clickNew();
        forcewait(4000);
    }

    @Then("^Create an client$")
    public void Create_an_client() {
        clientPage.CreateNewClient();
        forcewait(4000);
    }

    @Then("^Click on account and create the account for the client$")
    public void click_on_account_and_create_the_account_for_the_client() {
    }
}
