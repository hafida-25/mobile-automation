package com.td.data;

import org.testng.annotations.DataProvider;

public class DataProvders {
    @DataProvider(name="logindata")
    public Object[][] getLoginData(){
        Object[][] data={{"hafffi","abcd123"}};
        return data;
    }
}
