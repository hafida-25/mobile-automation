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

    @FindBy(xpath="//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

    public void clickOnTransferBtn(){
        transferBtn.click();
        ExtentTestManager.log("user can click on transfer Button",LOGGER);
    }
    public void validateTransferBtn(){
        accountBtn.isDisplayed();
        Assert.assertTrue(accountBtn.isDisplayed(),"Transfer button is not dispalyed");
        ExtentTestManager.log("Validated transfer button",LOGGER);
    }

    @FindBy(xpath="//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    public void clickOnDepositBtn(){
        depositBtn.click();
        ExtentTestManager.log("user can click on deposit Button",LOGGER);
    }
    public void validateDepositBtn(){
        depositBtn.isDisplayed();
        Assert.assertTrue(depositBtn.isDisplayed(),"Deposit  button is not dispalyed");
        ExtentTestManager.log("Validated deposit button",LOGGER);
    }


    @FindBy(xpath="//android.widget.Button[@text='SEND MONEY']")
    private WebElement SendMoneyBtn;

    public void clickOnSendMoneyBtn(){
        SendMoneyBtn.click();
        ExtentTestManager.log("user can click on send money Button",LOGGER);
    }
    public void validateSendMoneyBtn(){
        SendMoneyBtn.isDisplayed();
        Assert.assertTrue(SendMoneyBtn.isDisplayed(),"Send money button is not dispalyed");
        ExtentTestManager.log("Validated Send Money button",LOGGER);
    }

    @FindBy(xpath="//android.widget.Button[@text='PAY A BILL']")
    private WebElement payBillBtn;

    public void clickOnPayBillBtn(){
        payBillBtn.click();
        ExtentTestManager.log("user can click on pay a bill Button",LOGGER);
    }
    public void validatePayBillBtn(){
        payBillBtn.isDisplayed();
        Assert.assertTrue(payBillBtn.isDisplayed(),"pay A Bill button is not dispalyed");
        ExtentTestManager.log("Validated pay A Bill button",LOGGER);
    }



}
