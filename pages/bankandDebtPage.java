package pages;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class bankandDebtPage extends BaseUtil {
    public bankandDebtPage(WebDriver driver) { PageFactory.initElements(driver, this); }

    @FindBy(how = How.XPATH, using = "(//button[@name='Client__c.Add_New_Debt'])[2]")
    public WebElement addnewDebt;

    @FindBy(how = How.XPATH, using = "//span[text()='Original Balance']//following::input[1]")
    public WebElement originalBalance;

    @FindBy(how = How.XPATH, using = "//span[text()='Original Account Number']//following::input[1]")
    public WebElement originalAccountNumber;

    @FindBy(how = How.XPATH, using = "//span[text()='Original Creditor']//following::input[1]")
    public WebElement originalCreditor;

    @FindBy(how = How.XPATH, using = "(//div[@title='Wells Fargo'])[1]")
    public WebElement wellsFargo;

    @FindBy(how = How.XPATH, using = "//span[text()='New Creditor']//following::input[1]")
    public WebElement newCreditor;

    @FindBy(how = How.XPATH, using = "(//div[@title='Discover Bank'])[1]")
    public WebElement discoverBank;

    @FindBy(how = How.XPATH, using = "//span[text()='SFS Current Balance']//following::input[1]")
    public WebElement sfsCurrentBalance;

    @FindBy(how = How.XPATH, using = "(//span[text()='Save'])[3]")
    public WebElement saveDebt;

    @FindBy(how = How.XPATH, using = "(//a[text()='Related'])[2]")
    public WebElement related;

    @FindBy(how = How.XPATH, using = "//span[@title='Bank Accounts']")
    public WebElement bankAccounts;

    @FindBy(how = How.XPATH, using = "(//a[@title='New'])[2]")
    public WebElement newBankAccount;

    @FindBy(how = How.XPATH, using = "//input[@name='Name']")
    public WebElement bankAccountName;

    @FindBy(how = How.XPATH, using = "//input[@name='Holder_s_Name__c']")
    public WebElement holdersName;

    @FindBy(how = How.XPATH, using = "//input[@name='Holder_Email__c']")
    public WebElement holderEmail;

    @FindBy(how = How.XPATH, using = "//input[@name='Holder_Address__c']")
    public WebElement holderAddress;

    @FindBy(how = How.XPATH, using = "//label[text()='Account Type']//following::input[1]")
    public WebElement accountType;

    @FindBy(how = How.XPATH, using = "//span[@title='SAVING']")
    public WebElement savingBank;

    @FindBy(how = How.XPATH, using = "//input[@name='Holder_City__c']")
    public WebElement holderCity;

    @FindBy(how = How.XPATH, using = "//input[@name='Holder_State__c']")
    public WebElement holderState;

    @FindBy(how = How.XPATH, using = "//input[@name='Holder_Zip__c']")
    public WebElement holderzip;

    @FindBy(how = How.XPATH, using = "//input[@name='Bank_Name__c']")
    public WebElement bankName;

    @FindBy(how = How.XPATH, using = "//input[@name='Bank_Account_Number__c']")
    public WebElement bankAccountNumber;

    @FindBy(how = How.XPATH, using = "//input[@name='Routing_Number__c']")
    public WebElement routingNumber;

    @FindBy(how = How.XPATH, using = "//button[@name='SaveEdit']")
    public WebElement saveBankDetails;


    public void addDebt(){
        addnewDebt.click();
        originalBalance.sendKeys("25000");
        originalAccountNumber.sendKeys("17283618236");
        originalCreditor.sendKeys("Wells Fargo");
        wellsFargo.click();
        newCreditor.sendKeys("Discover Bank");
        discoverBank.click();
        sfsCurrentBalance.sendKeys("26000");
        saveDebt.click();
        forcewait(5000);
    }

    public void addBank() {
        related.click();
        forcewait(10000);

        MouseOver(bankAccounts);

        bankAccounts.click();
        forcewait(5000);
        newBankAccount.click();
        forcewait(3000);
        bankAccountName.sendKeys("Test P Twenty");
        holdersName.sendKeys("Test P Twenty");
        holderEmail.sendKeys("p@yopmail.com");
        holderAddress.sendKeys("103 Highview Rd SE");

        accountType.click();
        savingBank.click();

        holderCity.sendKeys("Milledgeville");
        holderState.sendKeys("NY");
        holderzip.sendKeys("31061");
        bankName.sendKeys("Bank of America New York");
        bankAccountNumber.sendKeys("1723512631");
        routingNumber.sendKeys("021000322");
        forcewait(3000);
        saveBankDetails.click();
    }
}
