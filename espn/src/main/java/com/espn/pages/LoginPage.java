package com.espn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath="//android.widget.Button[@text='LOG IN']")
    private WebElement loginBtn;
    public void clickOnLoginBtn(){
        loginBtn.click();


    }
}
