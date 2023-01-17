package com.espn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath="//android.widget.EditText[@resource-id='InputIdentityFlowValue']")
    private WebElement userNameField;

    public void validateUserNameField(){
        Assert.assertTrue(userNameField.isDisplayed(),"userNameField is not displyed");

    }

    public void typeOnUserNameField(String data){
        userNameField.sendKeys(data);

    }
    @FindBy(xpath="//android.widget.EditText[@resource-id='password-new']")
    private WebElement passwordField;
    public void typeOnPassword(String data){
        userNameField.sendKeys(data);

    }

    @FindBy(xpath="//android.widget.Button[@resource-id='BtnSubmit']")
    private WebElement loginButton;
    public void clickOnLoginButton(){
        loginButton.click();

    }

}
