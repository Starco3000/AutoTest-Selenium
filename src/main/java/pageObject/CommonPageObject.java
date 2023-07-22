package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonPageObject extends TestActions {
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement usernameInput;
    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passwordInput;
    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
    public WebElement loginSubmit;

    //    My Info
    @FindBy(how = How.XPATH, using = "//ul/child::li[6]")
    public WebElement myInfoLocationSidebar;

    //    Personal Detail
    @FindBy(how = How.XPATH, using = "//input[@name='firstName']")
    public WebElement firstNameField;
    @FindBy(how = How.XPATH, using = "//input[@name='middleName']")
    public WebElement middleNameField;
    @FindBy(how = How.XPATH, using = "//input[@name='lastName']")
    public WebElement lastNameField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
    public WebElement nickNameField;

    @FindBy(how = How.XPATH, using = "//div[@class='oxd-form-row'][2]/div/div[1]/div/div[2]/input")
    public WebElement employeeIdField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")
    public WebElement otherIdField;
    @FindBy(how = How.XPATH, using = "//div[@class='oxd-form-row'][2]/div[2]/div[1]/div/div[2]/input")
    public WebElement driverLicenseField;
    @FindBy(how = How.XPATH, using = "//div[@class='oxd-form-row'][2]//div[@class='oxd-date-input']/input")
    public WebElement licenseExpiryDate;
    @FindBy(how = How.XPATH, using = "//div[@class='oxd-form-row'][2]/div[3]/div[1]/div//input")
    public WebElement ssnNumField;

    @FindBy(how = How.XPATH, using = "//div[@class='oxd-form-row'][3]//div[@class='oxd-select-text--after']")
    public WebElement nationalityField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[5]")
    public WebElement nationalityOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")
    public WebElement materialStatusField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]")
    public WebElement materialStatusOptions;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    public WebElement dateOfBirthField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")
    public WebElement femaleOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/input")
    public WebElement femaleInput;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
    public WebElement maleOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/input")
    public WebElement maleInput;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input")
    public WebElement militaryServiceField;
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/input")
    public WebElement smokerOption;
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/span")
    public WebElement smokeLabel;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
    public WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
    public WebElement userNavTopRightDropdown;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
    public WebElement userNavTopRightDropdownLogout;


    //    Contact Detail
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
    public WebElement contactDetail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
    public WebElement street1Field;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    public WebElement street2Field;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
    public WebElement cityField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
    public WebElement stateField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
    public WebElement postalcodeField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")
    public WebElement countryOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div[233]/span")
    public WebElement countrySelect;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
    public WebElement homeTele;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
    public WebElement mobileTele;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")
    public WebElement workTele;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")
    public WebElement workEmail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")
    public WebElement otherEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
    public WebElement contactSaveBtn;


    //    Emergency Contact Detail
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a")
    public WebElement emergencyContact;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
    public WebElement addNewContact;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
    public WebElement nameField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    public WebElement relationshipField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
    public WebElement homeEmerTele;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
    public WebElement mobileEmerTele;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")
    public WebElement workEmerTele;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[1]")
    public WebElement emerCancelBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")
    public WebElement emerSaveBtn;
    public static WebDriverWait wait;

    public CommonPageObject() {
        this.driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
}
