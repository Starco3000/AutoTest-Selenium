package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XpathLink {
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement usernameInput;
    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passwordInput;
    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
    public WebElement loginSubmit;
    @FindBy(how = How.XPATH, using = "//ul/child::li[6]")
    public WebElement myInfoLocationSidebar;
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
    //    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[5]")
    public WebElement nationalityOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")
    public WebElement materialStatusField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]")
    public WebElement materialStatusOptions;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    public  WebElement dateOfBirthField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")
    public WebElement femaleOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
    public WebElement maleOption;
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
}
