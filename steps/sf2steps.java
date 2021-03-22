package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import pages.SF2Page;

import static pages.SF2Page.*;

/**
 * Created by Pawan
 */

public class sf2steps extends BaseUtil {

    private  BaseUtil base;

    public sf2steps(BaseUtil base) {
        this.base = base;
    }

    public SF2Page SF2Page = new SF2Page(base.Driver);

    @Given("^I navigate to the Homepage$")
    public void i_navigate_to_the_Homepage()
    {
        Driver.navigate().to("https://stratfs--uat.my.salesforce.com");
    }

    @Given("^Enter ([^\"]*) and ([^\"]*)$")
    public void Enter_userName_and_Password(String userName, String Password) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + Password);
        SF2Page.login(userName, Password);
        SF2Page.Clickloginsand();
        Thread.sleep(20000);
    }
}
