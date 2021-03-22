package pages;

import Base.BaseUtil;
import org.apache.poi.xwpf.usermodel.ICell;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ClientPage extends BaseUtil {
    public ClientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Clients']")
    public WebElement clientClick;

    @FindBy(how = How.XPATH, using = "//div[@title='New']")
    public WebElement NewClient;

    @FindBy(how = How.XPATH, using = "(//input[@placeholder='Search Accounts...'])[1]")
    public WebElement account;

    @FindBy(how = How.XPATH, using = "//span[@title='New Account']")
    public WebElement createNew;

    @FindBy(how = How.XPATH, using = "(//span[text()='Person Account'])[2]")
    public WebElement personAccount;

    @FindBy(how = How.XPATH, using = "//span[text()='Next']")
    public WebElement next;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "//span[text()='Account Number']//following::input[1]")
    public WebElement accountNumber;

    @FindBy(how = How.XPATH, using = "(//span[text()='Phone']//following::input[1])[2]")
    public WebElement phone;

    @FindBy(how = How.XPATH, using = "(//span[text()='Home Phone']//following::input[1])[2]")
    public WebElement homePhone;

    @FindBy(how = How.XPATH, using = "//span[text()='Mobile']//following::input[1]")
    public WebElement mobile;

    @FindBy(how = How.XPATH, using = "(//span[text()='Work Phone']//following::input[1])[2]")
    public WebElement workPhone;

    @FindBy(how = How.XPATH, using = "//span[text()='Other Phone']//following::input[1]")
    public WebElement otherPhone;

    @FindBy(how = How.XPATH, using = "//span[text()='Email']//following::input[1]")
    public WebElement email;

    @FindBy(how = How.XPATH, using = "//span[text()='SSN last 4']//following::input[1]")
    public WebElement ssnLastFour;

    @FindBy(how = How.XPATH, using = "(//span[text()='Social Security Number']//following::input[1])[2]")
    public WebElement socialSecurityNumber;

    @FindBy(how = How.XPATH, using = "//span[text()='Birthdate']//following::input[1]")
    public WebElement birthDate;

    @FindBy(how = How.XPATH, using = "//input[@title='Search Portfolio']")
    public WebElement portFolio;

    @FindBy(how = How.XPATH, using = "//div[@title='Great Lakes Law Firm']")
    public WebElement greatLakesLawFirm;

    @FindBy(how = How.XPATH, using = "//span[text()='Test Account']//following::input[1]")
    public WebElement testAccount;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Mailing Street']")
    public WebElement mailingStreet;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Mailing City']")
    public WebElement mailingCity;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Mailing State/Province']")
    public WebElement mailingState;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Mailing Zip/Postal Code']")
    public WebElement mailingZip;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Mailing Country']")
    public WebElement mailingCountry;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Shipping Street']")
    public WebElement shippingStreet;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Shipping City']")
    public WebElement shippingCity;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Shipping State/Province']")
    public WebElement shippingState;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Shipping Zip/Postal Code']")
    public WebElement shippingZip;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Shipping Country']")
    public WebElement shippingCountry;

    @FindBy(how = How.XPATH, using = "//span[text()='Account Id (18 Digit)']//following::input[1]")
    public WebElement accountId;

    @FindBy(how = How.XPATH, using = "//button[@title='Save']")
    public WebElement save;

    @FindBy(how = How.XPATH, using = "//input[@name='Social_Security_Number__c']")
    public WebElement ssn;

    @FindBy(how = How.XPATH, using = "//label[text()='Lender Name']//following::input[1]")
    public WebElement lenderName;

    @FindBy(how = How.XPATH, using = "//lightning-base-combobox-item[@data-value='Versara Lending L_ACH']")
    public WebElement versaraLending;

    @FindBy(how = How.XPATH, using = "//input[@name='Import_ID__c']")
    public WebElement importId;

    @FindBy(how = How.XPATH, using = "//input[@name='Enrollment_Date__c']")
    public WebElement enrollDate;

    @FindBy(how = How.XPATH, using = "//label[text()='Primary Language']//following::input[1]")
    public WebElement primaryLanguage;

    @FindBy(how = How.XPATH, using = "//lightning-base-combobox-item[@data-value='English']")
    public WebElement english;

    @FindBy(how = How.XPATH, using = "//input[@name='Estimated_Settlement__c']")
    public WebElement estimatedSettlement;

    @FindBy(how = How.XPATH, using = "//input[@name='Max_Client_Length__c']")
    public WebElement maxLength;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search Fee Templates...']")
    public WebElement feeTemplate;

    @FindBy(how = How.XPATH, using = "//lightning-base-combobox-formatted-text[@title='GREAT LAKES-82628-2-15k-30k']")
    public WebElement greatLakes82628;

    @FindBy(how = How.XPATH, using = "//label[text()='Client Type']//following::input[1]")
    public WebElement clientType;

    @FindBy(how = How.XPATH, using = "//lightning-base-combobox-item[@data-value='Timberline']")
    public WebElement timberline;

    @FindBy(how = How.XPATH, using = "//label[text()='Client Status']/following::input[1]")
    public WebElement clientStatus;

    @FindBy(how = How.XPATH, using = "//span[@title='Active']")
    public WebElement active;

    @FindBy(how = How.XPATH, using = "//input[@name='Client_Length__c']")
    public WebElement clientLength;

    @FindBy(how = How.XPATH, using = "(//input[@name='Test_Client__c'])[2]")
    public WebElement testClient;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search Processors...']")
    public WebElement processor;

    @FindBy(how = How.XPATH, using = "//lightning-base-combobox-formatted-text[@title='GCS - GREAT LAKES']")
    public WebElement gcsGreatLakes;

    @FindBy(how = How.XPATH, using = "//input[@name='Recurring_Debit_Day__c']")
    public WebElement recurringDebitDay;

    @FindBy(how = How.XPATH, using = "//input[@name='Initial_Debit_Date__c']")
    public WebElement initialDebitDate;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search Portfolio...']")
    public WebElement searchPortfolio;

    @FindBy(how = How.XPATH, using = "//lightning-base-combobox-formatted-text[@title='2810 Crossroads Dr. Suite 4000']")
    public WebElement greatLakes;

    @FindBy(how = How.XPATH, using = "//input[@name= 'Total_Debt_Included__c']")
    public WebElement totalDebt;

    @FindBy(how = How.XPATH, using = "//input[@name= 'Total_Current_Balance__c']")
    public WebElement totalCurrentBalance;

    @FindBy(how = How.XPATH, using = "//label[text()= 'Payment Frequency']/following::input[1]")
    public WebElement paymentFrequency;

    @FindBy(how = How.XPATH, using = "//lightning-base-combobox-item[@data-value= 'Monthly']")
    public WebElement monthly;

    @FindBy(how = How.XPATH, using = "//input[@name= 'Service_Fee__c']")
    public WebElement serviceFee;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    public WebElement clientSave;



    public void clickNew()
    {
        clientClick.click();
    }

    public void CreateNewClient() {
        NewClient.click();
        account.click();
        createNew.click();
        personAccount.click();
        next.click();

        //System.out.println(getCellData(filename,1,2));

        //firstName.sendKeys(getCellData(filename,1,2));

        firstName.sendKeys("Test");
        lastName.sendKeys("P Twenty Eight");
        accountNumber.sendKeys("1234512345");
        phone.sendKeys("0123456789");
        homePhone.sendKeys("0123456789");
        mobile.sendKeys("0123456789");
        workPhone.sendKeys("0123456789");
        otherPhone.sendKeys("0123456789");
        email.sendKeys("p@yopmail.com");
        ssnLastFour.sendKeys("6789");
        socialSecurityNumber.sendKeys("123456789");
        birthDate.sendKeys("3/10/1990");

        portFolio.sendKeys("great lakes law");
        greatLakesLawFirm.click();

        testAccount.click();

        mailingStreet.sendKeys("103 Highview Rd SE");
        mailingCity.sendKeys("Milledgeville");
        mailingState.sendKeys("NY");
        mailingZip.sendKeys("31061");
        mailingCountry.sendKeys("USA");

        shippingStreet.sendKeys("103 Highview Rd SE");
        shippingCity.sendKeys("Milledgeville");
        shippingState.sendKeys("NY");
        shippingZip.sendKeys("31061");
        shippingCountry.sendKeys("USA");

        accountId.sendKeys("123451234512345123");
        save.click();
        forcewait(10000);


        ssn.sendKeys("123456789");

        //lenderName.click();
        //versaraLending.click();

        importId.sendKeys("Test123PTwentyEight");
        enrollDate.sendKeys(getFutureDate(3));

        primaryLanguage.click();
        english.click();

        estimatedSettlement.sendKeys("43");
        maxLength.sendKeys("32");

        feeTemplate.sendKeys("GREAT LAKES-82628-2-15k-30k");
        greatLakes82628.click();

/*      clientType.click();
        timberline.click();
        clientStatus.click();
        active.click();*/

        clientLength.sendKeys("32");
        testClient.click();

        processor.sendKeys("GCS - GREAT LAKES");
        gcsGreatLakes.click();

        recurringDebitDay.sendKeys("1");
        initialDebitDate.sendKeys(getFutureDate(30));

        searchPortfolio.sendKeys("Great Lakes Law");
        greatLakes.click();

        totalDebt.sendKeys("25000");
        forcewait(3000);
        totalCurrentBalance.click();
        forcewait(3000);
        ((JavascriptExecutor) Driver).executeScript("arguments[0].scrollIntoView(true);", paymentFrequency);
        forcewait(3000);
        paymentFrequency.click();
        monthly.click();

        serviceFee.sendKeys("9");
        clientSave.click();
        forcewait(10000);

    }
}
/*
    public void reader() {

    }
}*/
