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

    public TestClass() {
        dataField = new DataField("src/main/java/demo/dataTest.xls");
    }

    @Before
    public void accessWebpage() {
        this.driver.manage().window().maximize();
        this.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
//        clearThenSendKeys(ssnNumField, dataField.getData(1, 10), true);

        click(nationalityField, true).pause(500);
        click(nationalityOption, true).pause(500);
        click(materialStatusField, true).pause(500);
        click(materialStatusOptions, true).pause(500);

        clearThenSendKeys(dateOfBirthField, dataField.getData(1, 14), true).pause(500);
        String gender = dataField.getData(1, 15);

        if(Objects.equals(gender, "Female")){
            click(femaleOption, true);
            Assert.assertEquals( true, femaleInput.isSelected() );
        }else {
            click(maleOption , true);
            Assert.assertEquals(true, maleInput.isSelected() );
        }

        clearThenSendKeys(militaryServiceField, dataField.getData(1, 16), true).pause(1000);

        uncheck(smokerOption, smokeLabel, false);
        Assert.assertEquals( smokeLabel.isSelected(), false );
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
//        driver.quit();
    }
}
