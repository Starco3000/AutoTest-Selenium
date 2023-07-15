package demo;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.CommonPageObject;
import pageObject.DataField;


import java.util.Objects;

public class TestClass extends CommonPageObject {

    DataField dataField;
    public WebDriverWait wait;
    public WebDriver driver;

    public TestClass() throws Exception {
        super(CommonPageObject.driver);
        wait = CommonPageObject.wait;
        driver = CommonPageObject.driver;

        dataField = new DataField("src/main/java/demo/dataTest.xls");
    }

    @Before
    public void accessWebpage() {
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void testFormLogin() {
        String userName = dataField.getData(1, 0);
        String userPswd = dataField.getData(1, 1);
        sendKeys(usernameInput, userName, true);
        sendKeys(passwordInput, userPswd, true);
        Assert.assertEquals(userName, usernameInput.getAttribute("value"));
        Assert.assertEquals(userPswd, passwordInput.getAttribute("value"));
        click(loginSubmit, true);
    }

    @Test
    public void testLogin() {
        testFormLogin();
        click(myInfoLocationSidebar, true).pause(500);
        Assert.assertEquals("My Info", myInfoLocationSidebar.getText());
    }

    @Test
    public void testInputField() {
        testLogin();
        clearThenSendKeys(middleNameField, dataField.getData(1, 2), true);
        clearThenSendKeys(lastNameField, dataField.getData(1, 3), true);
        clearThenSendKeys(nickNameField, dataField.getData(1, 4), true);
        clearThenSendKeys(employeeIdField, dataField.getData(1, 5), true);
        clearThenSendKeys(otherIdField, dataField.getData(1, 6), true);
        clearThenSendKeys(driverLicenseField, dataField.getData(1, 7), true);
        clearThenSendKeys(licenseExpiryDate, dataField.getData(1, 8), true).pause(5000);
        clearThenSendKeys(ssnNumField, dataField.getData(1, 9), true);

        click(nationalityField, true).pause(500);
        click(nationalityOption, true).pause(500);
        click(materialStatusField, true).pause(500);
        click(materialStatusOptions, true).pause(500);

        clearThenSendKeys(dateOfBirthField, dataField.getData(1, 10), true).pause(5000);
        click(Objects.equals(dataField.getData(1, 11), "Female") ? femaleOption : maleOption, true);
        clearThenSendKeys(militaryServiceField, dataField.getData(1, 12), true).pause(2000);

        uncheck(smokerOption, smokeLabel, false);
        click(userNavTopRightDropdown, true);
        click(userNavTopRightDropdownLogout, true);
    }

    @After
    public void tearDown() {
        pause(2000);
        driver.quit();
    }
}
