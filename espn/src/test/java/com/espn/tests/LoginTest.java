package com.espn.tests;

import com.core.TestBase;
import com.espn.pages.HomePage;
import com.espn.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        loginPage= PageFactory.initElements(driver,LoginPage.class);
    }
    @Test
    public void validateUserCanLoginWithValidateCredentials(){

        loginPage.clickOnLoginBtn();
        homePage.typeOnUserNameField("elhadjenhafi@gmail.com");
        homePage.typeOnPassword("abc12$");
        homePage.clickOnLoginButton();
    }
}
