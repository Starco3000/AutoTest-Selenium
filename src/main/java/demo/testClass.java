package demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.CommonPageObject;
import pageObject.DataField;

import java.util.Objects;

public class testClass extends CommonPageObject {
    public WebDriver driver;
    public WebDriverWait wait;

    DataField dataField;
    public testClass() throws Exception{
        super(CommonPageObject.driver);
        driver = CommonPageObject.driver;
        wait = CommonPageObject.wait;
        dataField = new DataField( "src/main/java/demo/dataTest.xlsx" );
    }

    @Test
    public void testLogin() throws Exception {
        sendKeys( usernameInput, dataField.getData( 0,1 ), true );
        sendKeys( passwordInput, dataField.getData( 1,1 ), true);
        click( loginSubmit, true );
//        try{
//            Assert.assertEquals( dataField.getData( 0,2 ), myInfoLocationSidebar.getText());
//            System.out.println("match");
//            click( myInfoLocationSidebar, true ).pause( 500 );
//        } catch (Exception e){
//            System.out.println("Not match");
//        }
    }
    @Test
    public void testClickDashboard() throws Exception {
        sendKeys( usernameInput, dataField.getData( 0,1 ), true);
        sendKeys( passwordInput, dataField.getData( 1,1 ), true);
        click( loginSubmit, true );
        click( myInfoLocationSidebar, true ).pause( 500 );
    }

    @Test
    public void testInputField()  throws Exception {
        sendKeys( usernameInput, dataField.getData( 0,1 ), true);
        sendKeys( passwordInput, dataField.getData( 1,1 ), true);
        click( loginSubmit, true );
        click( myInfoLocationSidebar, true ).pause( 500 );
        clearThenSendKeys( firstNameField, dataField.getData( 5,1 ), true );
        clearThenSendKeys( middleNameField, dataField.getData( 6,1 ), true );
        clearThenSendKeys( lastNameField, dataField.getData( 7,1 ), true );
        clearThenSendKeys( nickNameField, dataField.getData( 8,1 ), true );
        clearThenSendKeys( employeeIdField, dataField.getDataValue( 10,1 ), true );
        clearThenSendKeys( otherIdField, dataField.getDataValue( 11,1 ), true );
        clearThenSendKeys( driverLicenseField, dataField.getDataValue( 13,1 ), true );
//        clearThenSendKeys( licenseExpiryDate, dataField.getDataDate( 15,1 ), true ).pause( 5000 );
        clearThenSendKeys( ssnNumField, dataField.getDataValue( 17,1 ), true );
        click( nationalityField, true ).pause( 500 );
        click( nationalityOption, true ).pause( 500 );
        click( materialStatusField, true ).pause( 500 );
        click( materialStatusOptions, true).pause( 500 );
//        clearThenSendKeys( dateOfBirthField, dataField.getDataDate( 19,1 ), true ).pause( 5000 );
        click( Objects.equals( dataField.getData( 21,1 ),"Female" ) ? femaleOption : maleOption, true);
        clearThenSendKeys( militaryServiceField, dataField.getDataValue( 23,1 ), true).pause( 2000 );
        uncheck( smokerOption, smokeLabel, false);
//                .click( saveButton, true ).pause( 5000 )
        click(userNavTopRightDropdown, true);
        click( userNavTopRightDropdownLogout, true);
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
    }
}
