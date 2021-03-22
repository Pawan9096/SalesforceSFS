package steps;

import Base.BaseUtil;
import com.aventstack.extentreports.GherkinKeyword;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawan
 */
public class LoginStep extends BaseUtil{

    private  BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    public LoginPage loginPage = new LoginPage(base.Driver);

    @Given("^I navigate to the Salesforce$")
    public void iNavigateToTheSalesforce() {
        base.Driver.navigate().to("http://test.salesforce.com/");
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
        loginPage.Login(userName, password);
        loginPage.ClickLogin();
        Thread.sleep(30000);
    }
}