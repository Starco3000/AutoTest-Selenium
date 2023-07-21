package demo;

import com.beust.ah.A;
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
    public void testMyInfoAccess() {
        testFormLogin();
        click(myInfoLocationSidebar, true).pause(1000);
        Assert.assertEquals("My Info", myInfoLocationSidebar.getText());
    }

    @Test
    public void testPersonalDetail() {
        testMyInfoAccess();
        clearThenSendKeys(firstNameField, dataField.getData(1,2), true).pause( 500 );
        clearThenSendKeys(middleNameField, dataField.getData(1, 3), true).pause( 500 );
        clearThenSendKeys(lastNameField, dataField.getData(1, 4), true).pause( 500 );
        clearThenSendKeys(nickNameField, dataField.getData(1, 5), true).pause( 500 );
        clearThenSendKeys(employeeIdField, dataField.getData(1, 6), true).pause( 500 );
        clearThenSendKeys(otherIdField, dataField.getData(1, 7), true).pause( 500 );
        clearThenSendKeys(driverLicenseField, dataField.getData(1, 8), true).pause( 500 );
        clearThenSendKeys(licenseExpiryDate, dataField.getData(1, 9), true).pause(500);
        clearThenSendKeys(ssnNumField, dataField.getData(1, 10), true);

        click(nationalityField, true).pause(500);
        click(nationalityOption, true).pause(500);
        click(materialStatusField, true).pause(500);
        click(materialStatusOptions, true).pause(500);

        clearThenSendKeys(dateOfBirthField, dataField.getData(1, 14), true).pause(500);
        click(Objects.equals(dataField.getData(1, 15), "Female") ? femaleOption : maleOption, true);
        try {
            if (femaleOption.isSelected()) {
                Assert.assertEquals( femaleOption.isSelected(), true );
                Assert.assertEquals( maleOption.isDisplayed(), true );
                pause( 500 );
            } else if (maleOption.isSelected()) {
                Assert.assertEquals( maleOption.isSelected(), true );
                Assert.assertEquals( femaleOption.isDisplayed(),true );
                pause( 500 );
            }
        } catch (Exception e) {
            System.out.println("An error occurred while checking the selected radio input element");
        }
        clearThenSendKeys(militaryServiceField, dataField.getData(1, 16), true).pause(1000);

        uncheck(smokerOption, smokeLabel, false);
        Assert.assertEquals( smokeLabel.isDisplayed(), true );
        click(userNavTopRightDropdown, true);
        click(userNavTopRightDropdownLogout, true);
    }

    @Test
    public void testContactDetail() {
        testMyInfoAccess();
        click( contactDetail, true );

        clearThenSendKeys( street1Field, dataField.getData(7, 0), true).pause( 500 );
        clearThenSendKeys( street2Field, dataField.getData(7, 1), true).pause( 500 );
        clearThenSendKeys( cityField, dataField.getData(7, 2), true).pause( 500 );
        clearThenSendKeys( stateField, dataField.getData(7, 3), true).pause( 500 );
        clearThenSendKeys( postalcodeField, dataField.getData(7, 4), true).pause( 500 );
        click( countryOption, true );
        click( countrySelect, true );
        Assert.assertEquals( dataField.getData( 7, 5 ), countryOption.getText() );


        clearThenSendKeys( homeTele, dataField.getData(7,6), true).pause( 500 );
        clearThenSendKeys( mobileTele, dataField.getData(7, 7), true).pause( 500 );
        clearThenSendKeys( workTele, dataField.getData(7, 8), true).pause( 500 );
        clearThenSendKeys( workEmail, dataField.getData(7, 9), true).pause( 500 );
        clearThenSendKeys( otherEmail, dataField.getData(7, 10), true).pause( 500 );

//        click( contactSaveBtn, true );
    }

    @Test
    public void testEmergencyDetail() {
        testMyInfoAccess();
        click( emergencyContact, true );
        click( addNewContact, true );

        clearThenSendKeys( nameField, dataField.getData(12, 0), true ).pause( 500 );
        clearThenSendKeys( relationshipField, dataField.getData(12, 1), true ).pause( 500 );
        clearThenSendKeys( homeEmerTele, dataField.getData(12, 2), true ).pause( 500 );
        clearThenSendKeys( mobileEmerTele, dataField.getData(12, 3), true ).pause( 500 );
        clearThenSendKeys( workEmerTele, dataField.getData(12, 4), true ).pause( 500 );

//        click( emerCancelBtn, true );
//        click( emerSaveBtn, true );
    }


    @After
    public void tearDown() {
        pause(2000);
        driver.quit();
    }
}
