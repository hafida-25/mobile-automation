package com.td.pages;

import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
    private Logger logger = Logger.getLogger(LoginPage.class);
    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    private WebElement userName;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement userPassword;

    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    private WebElement loginBtn;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.tdbank:id/alert_view']")
    private WebElement message;

    public void typeInFields(String name,String password){
        Assert.assertTrue(userName.isDisplayed() && userName.isEnabled());
        userName.sendKeys(name);
        ExtentTestManager.log("User name Typed In",logger);
        Assert.assertTrue(userPassword.isDisplayed() && userPassword.isEnabled());
        userPassword.sendKeys(password);
        ExtentTestManager.log("Password Typed In",logger);

    }
    public void clickOnLogin(){
        Assert.assertTrue(loginBtn.isDisplayed());
        loginBtn.click();
        ExtentTestManager.log("Login Button Has Been Displayed",logger);
    }
public void loginValidation(){
        Assert.assertTrue(message.isDisplayed());
        ExtentTestManager.log("User cannot Login With invalid Credentiels",logger);
}

}
