package pages;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProspectsPage extends BaseUtil {

    public ProspectsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "new")
    public WebElement createNewprospects;

    @FindBy(how = How.XPATH, using = "(//label[text()='First Name']/following::input)[1]")
    public WebElement firstName;

    @FindBy(how = How.XPATH, using = "(//label[text()='Date of Birth']/following::input)[1]")
    public WebElement dateofBirth;

    @FindBy(how = How.XPATH, using = "(//label[text()='Email Address']/following::input)[1]")
    public WebElement emailID;

    @FindBy(how = How.XPATH, using = "(//label[text()='Social Security Number']/following::input)[1]")
    public WebElement socialSecurityNumber;

    @FindBy(how = How.XPATH, using = "(//label[text()='Last Name']/following::input)[1]")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "(//label[text()='Physical Address Line 1']/following::input)[1]")
    public WebElement pa1;

    @FindBy(how = How.XPATH, using = "(//label[text()='Physical Address Line 2']/following::input)[1]")
    public WebElement pa2;

    @FindBy(how = How.XPATH, using = "(//label[text()='Physical Address City']/following::input)[1]")
    public WebElement paCity;

    @FindBy(how = How.XPATH, using = "(//label[text()='Physical Address Postal Code']/following::input)[1]")
    public WebElement paPostalCode;

    @FindBy(how = How.XPATH, using = "(//label[text()='Home Phone']/following::input)[1]")
    public WebElement homePhone;

    @FindBy(how = How.XPATH, using = "(//label[text()='Work Phone']/following::input)[1]")
    public WebElement workPhone;

    @FindBy(how = How.XPATH, using = "(//label[text()='Cell Phone']/following::input)[1]")
    public WebElement cellPhone;

    @FindBy(how = How.XPATH, using = "(//label[contains(text(),\"Second/Recurring Debit Day\")])/following::input")
    public WebElement recurringdebitday;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Bi-Monthly Payment Day\")])/following::input[1]")
    public WebElement twiceMonthlyRecurringDay;

    @FindBy(how = How.XPATH, using = "(//label[contains(text(),\"Initial Debit Date\")])/following::input")
    public WebElement initialDebitDate;

    @FindBy(how = How.XPATH, using = "(//label[text()='Address Line 1']/following::input)[1]")
    public WebElement addressLine1;

    @FindBy(how = How.XPATH, using = "(//label[text()='Address Line  2']/following::input)[1]")
    public WebElement addressLine2;

    @FindBy(how = How.XPATH, using = "(//label[text()='City']/following::input)[1]")
    public WebElement city;

    @FindBy(how = How.XPATH, using = "(//label[text()='Postal Code']/following::input)[1]")
    public WebElement postalCode;

    @FindBy(how = How.XPATH, using = "(//label[text()='State']/following::select)[1]")
    public WebElement mailingState;

    @FindBy(how = How.XPATH, using = "(//label[text()='Country']/following::input)[1]")
    public WebElement country;

    @FindBy(how = How.XPATH, using = "//img[@title='Fee Template Lookup (New Window)']")
    public WebElement feeTemplate;

    @FindBy(how = How.XPATH, using = "//input[@name=\"lksrch\"]")
    public WebElement templateSearch;

    @FindBy(how = How.NAME, using = "go")
    public WebElement goButton;

    @FindBy(how = How.XPATH, using = "//a[text()=\"ROYAL-Under 30000-81610-49-14-Royal\"]")
    public WebElement timberline;

    @FindBy(how = How.XPATH, using = "//img[@title='Processor Lookup (New Window)']")
    public WebElement processorTemplate;

    @FindBy(how = How.NAME, using = "lksrch")
    public WebElement   processorSearch;

    @FindBy(how = How.XPATH, using = "//a[text()=\"GCS - ROYAL\"]")
    public WebElement GCStimberline;

    @FindBy(how = How.XPATH, using = "(//label[text()='Physical Address State']/following::select)[1]")
    public WebElement stateSelect;

    @FindBy(how = How.XPATH, using = "//img[@title='Portfolio Lookup (New Window)']")
    public WebElement portfolio;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Royal\"]")
    public WebElement timberlinePortfolio;

    @FindBy(how = How.XPATH, using = "//frame[@title=\"Search\"]")
    public WebElement searchFrame;

    @FindBy(how = How.XPATH, using = "//frame[@title=\"Results\"]")
    public WebElement resultFrame;

    @FindBy(how = How.NAME, using = "save")
    public WebElement saveButton;

    public void clickNewButton()
    {
        createNewprospects.click();
    }

    public void fillProspects() {
        String currentWindow = Driver.getWindowHandle();
        firstName.sendKeys("Test");
        lastName.sendKeys("P Thirty");
        emailID.sendKeys("p@yopmail.com");
        dateofBirth.sendKeys("5/10/1991");
        pressKeyTab(dateofBirth);
        socialSecurityNumber.sendKeys("123456789");
        recurringdebitday.sendKeys("1");
        twiceMonthlyRecurringDay.sendKeys("15");
        initialDebitDate.sendKeys(getFutureDate(5));

        clickWebelement(feeTemplate);
        forcewait(4000);
        switchToNewWindow();
        if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:" + Driver.getTitle());
        Driver.switchTo().frame(searchFrame);
        templateSearch.sendKeys("ROYAL-Under 30000-81610-49-14-Royal");
        clickWebelement(goButton);
        forcewait(3000);
        switchToParentWindow();
        switchToNewWindow();
        if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:" + Driver.getTitle());
        Driver.switchTo().frame(resultFrame);
        clickWebelement(timberline);
        forcewait(2000);

        Driver.switchTo().window(currentWindow);
        clickWebelement(processorTemplate);
        forcewait(4000);
        switchToNewWindow();
        if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:" + Driver.getTitle());
        Driver.switchTo().frame(searchFrame);
        processorSearch.sendKeys("GCS - ROYAL");
        clickWebelement(goButton);
        forcewait(3000);
        switchToParentWindow();
        switchToNewWindow();
        if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:" + Driver.getTitle());
        Driver.switchTo().frame(resultFrame);
        clickWebelement(GCStimberline);
        forcewait(2000);

        Driver.switchTo().window(currentWindow);
        pa1.sendKeys("103");
        pa2.sendKeys("Highview Rd SE");
        paCity.sendKeys("Milledgeville");
        paPostalCode.sendKeys("31061");

        selectElementByValueMethod(stateSelect, "IL");

        clickWebelement(portfolio);
        forcewait(4000);
        switchToNewWindow();
        if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:" + Driver.getTitle());
        Driver.switchTo().frame(searchFrame);
        processorSearch.sendKeys("Royal");
        clickWebelement(goButton);
        forcewait(3000);
        switchToParentWindow();
        switchToNewWindow();
        if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:" + Driver.getTitle());
        Driver.switchTo().frame(resultFrame);
        clickWebelement(timberlinePortfolio);
        Driver.switchTo().window(currentWindow);

        homePhone.sendKeys("0123456789");
        workPhone.sendKeys("0123456789");
        cellPhone.sendKeys("0123456789");

        addressLine1.sendKeys("103");
        addressLine2.sendKeys("Highview Rd SE");
        city.sendKeys("Milledgeville");
        postalCode.sendKeys("31061");
        country.sendKeys("USA");

        selectElementByValueMethod(mailingState, "IL");
        clickWebelement(saveButton);
        forcewait(15000);
    }
}