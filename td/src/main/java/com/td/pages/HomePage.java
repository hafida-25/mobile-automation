package com.td.pages;



import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
    private static Logger LOGGER =Logger.getLogger(HomePage.class);
    @FindBy(xpath="//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountBtn;

    public void clickOnAccountsBtn(){
        accountBtn.click();
        ExtentTestManager.log("Clicked on accounts Button",LOGGER);
    }

    public void validateAccountBtn(){
        accountBtn.isDisplayed();
        Assert.assertTrue(accountBtn.isDisplayed(),"Account button is displayed");
        ExtentTestManager.log("Validate Accounts Button",LOGGER);
    }
}
