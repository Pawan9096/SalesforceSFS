package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Then;
import pages.bankandDebtPage;

public class bankandDebtSteps extends BaseUtil {
    bankandDebtPage BankAndDebtPage = new bankandDebtPage (Driver);

    @Then("^Add debts$")
    public void addDebts() {
        BankAndDebtPage.addDebt();
        forcewait(5000);
    }

    @Then("^Add Bank$")
    public void addBank() {
        BankAndDebtPage.addBank();
        forcewait(5000);
    }


}
