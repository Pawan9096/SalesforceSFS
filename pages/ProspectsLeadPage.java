package pages;

import Base.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProspectsLeadPage extends BaseUtil {

    ProspectsPage prospectsPage = new ProspectsPage(Driver);

    public ProspectsLeadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.XPATH, using = "//a[contains(text(),\"Banking Information\")]")
    public WebElement bankingInformation;

    @FindBy(how = How.XPATH, using = "//button[(text()=\"Add\")]")
    public WebElement addButton;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Holder's Name\")]/following::input)[1]")
    public WebElement holderName;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Holder Address\")]/following::input)[1]")
    public WebElement holderAddress;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Holder City\")]/following::input)[1]")
    public WebElement holderCity;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Holder State\")]/following::input)[1]")
    public WebElement holderState;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Holder Zip\")]/following::input)[1]")
    public WebElement holderZip;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Bank Account Number\")]/following::input)[1]")
    public WebElement bankAccountNumber;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Routing Number\")]/following::input)[1]")
    public WebElement routingNumber;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Account Type\")]/following::select)[1]")
    public WebElement accountType;

    @FindBy(how = How.XPATH, using = "(//button[text()=\"Save\"])[last()]")
    public WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),\"Creditors\")]")
    public WebElement creditors;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),\"Client Detail\")]")
    public WebElement clientDetails;

    @FindBy(how = How.XPATH, using = "//input[@ng-keypress=\"fetchAccounts(searchTxt)\"]")
    public WebElement originalCreditor;

    @FindBy(how = How.XPATH, using = "(//div[text()=\"Balance\"]//following::input)[2]")
    public WebElement balance;

    @FindBy(how = How.XPATH, using = "(//div[text()=\"Account Number\"]//following::input)[3]")
    public WebElement accountNumber;

    @FindBy(how = How.XPATH, using = "(//button[text()='Add Debt'])[1]")
    public WebElement addDebt;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),\"Program Details\")]")
    public WebElement programDetails;

    //@FindBy(how = How.XPATH, using = "(//label[contains(text(),\"Initial Debit Date\")])[2]/following::input")
    //public WebElement initialDebitDate;

    @FindBy(how = How.XPATH, using = "(//button[text()=\"Save\"])[5]")
    public WebElement clickSave;

    @FindBy(how = How.XPATH, using = "//button[text()=\"Add Program Detail\"]")
    public WebElement addProgramDetails;

    @FindBy(how = How.XPATH, using = "(//img[@title='Fee Template Lookup (New Window)'])[3]")
    public WebElement feeTemplate;

    @FindBy(how = How.XPATH, using = "//input[@name=\"lksrch\"]")
    public WebElement templatesearch;

    @FindBy(how = How.NAME, using = "go")
    public WebElement gobutton;

    @FindBy(how = How.XPATH, using = "//a[text()=\"ROYAL-Under 30000-81610-49-14-Royal\"]")
    public WebElement timberline;

    @FindBy(how = How.XPATH, using = "//frame[@title=\"Search\"]")
    public WebElement searchframe;

    @FindBy(how = How.XPATH, using = "//frame[@title=\"Results\"]")
    public WebElement resultframe;

    @FindBy(how = How.XPATH, using = "(//img[@title='Processor Lookup (New Window)'])[3]")
    public WebElement processortemplate;

    @FindBy(how = How.NAME, using = "lksrch")
    public WebElement processorsearch;

    @FindBy(how = How.XPATH, using = "//a[text()=\"GCS - ROYAL\"]")
    public WebElement Gcstimberline;

    @FindBy(how = How.XPATH, using = "(//label[text()='Program Length']/following::div[@id='nu_dse__Program_Length__cquotes']/div/input)[1]")
    public WebElement programLength;

    @FindBy(how = How.XPATH, using = "(//label[text()='Payment Frequency']/following::div[@id='nu_dse__Payment_Frequency__cquotes']/div/select)[1]")
    public WebElement paymentFrequency;

    @FindBy(how = How.XPATH, using = "(//button[text()=\"Save\"])[6]")
    public WebElement programDetailsave;

    @FindBy(how = How.XPATH, using = "(//a[text()=\"Accept\"])[1]")
    public WebElement quoteAccept;

    @FindBy(how = How.XPATH, using = "(//button[text()=\"Convert\"])[1]")
    public WebElement programConvert;

    @FindBy(how = How.XPATH, using = "//h2[text()=\"Success!\"]")
    public WebElement successMessage;

    @FindBy(how = How.XPATH, using = "//a[text()=\" here \"]")
    public WebElement clickHere;

    //@FindBy(how = How.XPATH, using = "(//label[(text()=\"Second/Recurring Debit Day\")])[2]/following::input[1]")
    //public WebElement recurringDebitDay;

    //@FindBy(how = How.XPATH, using = "(//label[(text()=\"Bi-Monthly Payment Day\")])[2]/following::input[1]")
    //public WebElement twiceMonthlyRecurringDay;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),\"P-\")])[1]")
    public WebElement overrideLink;

    @FindBy(how = How.XPATH, using = "//input[@title='Edit']")
    public WebElement editButton;

    //@FindBy(how = How.XPATH, using = "(//label[text()='Recurring Debit Day']/following::input)[1]")
    //public WebElement recurringDebitDay;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Enrollment Date\")]/following::input)[1]")
    public WebElement enrollmentDate;

    @FindBy(how = How.XPATH, using = "(//label[text()='Test Program']/following::input)[1]")
    public WebElement testProgram;

    @FindBy(how = How.XPATH, using = "//input[@title='Save']")
    public WebElement saveUpdate;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Last Name\")]/following::input)[1]")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"File Number\")]/following::input)[1]")
    public WebElement fileNumber;

    @FindBy(how = How.XPATH, using = "(//label[(text()=\"Total Debt Included\")]/following::input)[1]")
    public WebElement totalDebtIncluded;

    @FindBy(how = How.XPATH, using = "//img[@title='New Creditor Lookup (New Window)']")
    public WebElement newCreditor;

    @FindBy(how = How.XPATH, using = "(//a[text()='Discover'])[1]")
    public WebElement discover;

    @FindBy(how = How.XPATH, using = "(//label[text()='SFS Current Balance']/following::input)[1]")
    public WebElement sfsCurrentBalance;


    public void bankingInfo()
    {
        clickWebelement(bankingInformation);
        forcewait(4000);
        clickWebelement(addButton);
        holderName.sendKeys("Test P Thirty");
        holderAddress.sendKeys("103, Highview Rd Se");
        holderCity.sendKeys("Milledgeville");
        holderState.sendKeys("FL");
        holderZip.sendKeys("31061");
        bankAccountNumber.sendKeys("198729174917");
        routingNumber.sendKeys("063000047");

        selectElementByValueMethod(accountType,"SAVING");

        forcewait(2000);

        clickWebelement(saveButton);

        forcewait(5000);

    }

    public void creditors() {
        try {
            creditors.click();
        }
        catch (Exception e)
        {
            forcewait(4000);
            creditors.click();
        }
        forcewait(4000);
        ArrayList<String> Creditorlist = new ArrayList<String>();
        Creditorlist.add("Wells Fargo");
        Creditorlist.add("Community Bank");
        Creditorlist.add("Discover");
        for(String creditorname : Creditorlist) {
            try {
                originalCreditor.sendKeys(creditorname);
            } catch (Exception e) {
                creditors.click();
                forcewait(4000);
                originalCreditor.sendKeys(creditorname);
            }
            forcewait(4000);
            WebElement element = Driver.findElement(By.xpath("(//div[text()='" + creditorname + "'])[1]/.."));
            clickWebelement(element);
            forcewait(3000);
            balance.sendKeys("15000");
            accountNumber.sendKeys("123456789");
            clickWebelement(addDebt);
            forcewait(3000);
        }
    }

    public void program() {
        String currentWindow = Driver.getWindowHandle();
        forcewait(5000);
        clickWebelement(programDetails);
        forcewait(5000);
//        try {
//            initialDebitDate.sendKeys(getFutureDate(5));
//        }
//        catch (Exception e)
//        {
//            clickWebelement(programDetails);
//            forcewait(5000);
//            initialDebitDate.sendKeys(getFutureDate(5));
//        }

        forcewait(5000);
//        recurringDebitDay.sendKeys("1");
//        twiceMonthlyRecurringDay.sendKeys("15");
        try {
            clickSave.click();
        }
        catch (Exception e)
        {
            forcewait(3000);
            clickWebelement(clickSave);
        }
        forcewait(5000);
        clickWebelement(addProgramDetails);
        forcewait(4000);

        clickWebelement(feeTemplate);
        switchToNewWindow();
        if(Driver.getTitle().contains("Reminders")|Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:"+Driver.getTitle());
        Driver.switchTo().frame(searchframe);
        templatesearch.sendKeys("ROYAL-Under 30000-81610-49-14-Royal");
        clickWebelement(gobutton);
        forcewait(3000);
        switchToParentWindow();
        switchToNewWindow();
        if(Driver.getTitle().contains("Reminders")|Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:"+Driver.getTitle());
        Driver.switchTo().frame(resultframe);
        clickWebelement(timberline);
        forcewait(2000);

        Driver.switchTo().window(currentWindow);
        clickWebelement(processortemplate);
        forcewait(4000);
        switchToNewWindow();
        if(Driver.getTitle().contains("Reminders")|Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:"+Driver.getTitle());
        Driver.switchTo().frame(searchframe);
        processorsearch.sendKeys("GCS - ROYAL");
        clickWebelement(gobutton);
        forcewait(3000);
        switchToParentWindow();
        switchToNewWindow();
        if(Driver.getTitle().contains("Reminders")|Driver.getTitle().contains("New")) {
            Driver.close();
            switchToNewWindow();
        }
        System.out.println("Title:"+Driver.getTitle());
        Driver.switchTo().frame(resultframe);
        clickWebelement(Gcstimberline);
        forcewait(2000);
        Driver.switchTo().window(currentWindow);

        forcewait(3000);
        programLength.sendKeys("12");
        selectElementByValueMethod(paymentFrequency,"Twice Monthly");
        forcewait(4000);


        try{
        programDetailsave.click();
        }
        catch (Exception e){
            forcewait(4000);
            programDetailsave.click();
        }

        forcewait(5000);
        clickWebelement(quoteAccept);
        forcewait(5000);
    }
    public void clickConvert() {
        forcewait(6000);
        try {
            programConvert.click();
        }
        catch (Exception e)
        {
            forcewait(4000);
            programConvert.click();
        }
        forcewait(8000);
        Assert.assertTrue(successMessage.isDisplayed());
        clickWebelement(clickHere);
        forcewait(4000);
    }
    public void sfsBalance() {
        String currentWindow = Driver.getWindowHandle();
        creditors.click();
        forcewait(4000);

        ArrayList<String> Creditorlist = new ArrayList<String>();
        Creditorlist.add("Wells Fargo");
        Creditorlist.add("CENTRAL TRUST BANK");
        Creditorlist.add("Discover");
        int count =1;
        for(String creditorname : Creditorlist) {
            WebElement element = Driver.findElement(By.xpath("(//a[contains(text(),\"TL-\")])["+count+"]"));
            try {
                element.click();
            }
            catch (Exception e)
            {
                element.click();
            }
            clickWebelement(newCreditor);
            switchToNewWindow();
            if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
                Driver.close();
                switchToNewWindow();
            }
            System.out.println("Title:" + Driver.getTitle());
            Driver.switchTo().frame(searchframe);
            templatesearch.sendKeys(creditorname);
            clickWebelement(gobutton);
            forcewait(3000);
            switchToParentWindow();
            switchToNewWindow();
            if (Driver.getTitle().contains("Reminders") | Driver.getTitle().contains("New")) {
                Driver.close();
                switchToNewWindow();
            }
            System.out.println("Title:" + Driver.getTitle());
            Driver.switchTo().frame(resultframe);
            WebElement element1 = Driver.findElement(By.xpath("(//a[text()='"+creditorname+"'])[1]"));
            clickWebelement(element1);
            forcewait(2000);
            Driver.switchTo().window(currentWindow);
            sfsCurrentBalance.sendKeys("20000");
            clickWebelement(clickSave);
            forcewait(10000);
            count++;
        }
    }

    public void clickClientDetail() throws IOException {
        String currentWindow = Driver.getWindowHandle();
        try{
            clientDetails.click();
        }
        catch (Exception e){
            clientDetails.click();
        }
        try{
            overrideLink.click();
        }
        catch (Exception e)
        {
            overrideLink.click();
        }
        forcewait(3000);
        switchToNewWindow();

        forcewait(3000);
        clickWebelement(editButton);
        enrollmentDate.sendKeys(getFutureDate(3));
        testProgram.click();
        clickWebelement(saveUpdate);
        forcewait(4000);
        Driver.switchTo().window(currentWindow);
        forcewait(2000);
        System.out.println("Last Name = "+lastName.getAttribute("value"));
        System.out.println("File Number = "+fileNumber.getAttribute("value"));
        System.out.println("Total Debt Included = "+totalDebtIncluded.getAttribute("value"));

        String TestFile = "C:\\Users\\Pawan Jogi\\Desktop\\Test Data.txt";
        File FC = new File(TestFile);//Created object of java File class.
        if(!FC.exists()){
            FC.createNewFile();
        }

        //Writing In to file.
        //Create Object of java FileWriter and BufferedWriter class.
        FileWriter FW = new FileWriter(TestFile);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.newLine();
        BW.write("Last Name = "+lastName.getAttribute("value")); //Writing In To File.
        BW.newLine();//To write next string on new line.
        BW.write("File Number = "+fileNumber.getAttribute("value"));
        BW.newLine();//To write next string on new line.
        BW.write("Total Debt Included = "+totalDebtIncluded.getAttribute("value"));
        BW.newLine();
        BW.newLine();
        BW.close();
    }
}
