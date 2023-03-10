package com.td.tests;

import com.core.TestBase;
import com.td.data.DataProvders;
import com.td.pages.HomePage;
import com.td.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        loginPage= PageFactory.initElements(driver,LoginPage.class);

    }

    @Test(dataProvider = "logindata",dataProviderClass = DataProvders.class)
    public void ValidateUserCanClickOnAccountBtn(String name,String password) throws InterruptedException {
        Thread.sleep(5);
        homePage.clickOnAccountsBtn();
        loginPage.typeInFields(name, password);
        loginPage.clickOnLogin();
        Thread.sleep(10);
        loginPage.loginValidation();
    }


}
