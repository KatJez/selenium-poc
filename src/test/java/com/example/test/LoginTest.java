package com.example.test;

import com.example.pageobjects.LoginPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.example.setup.SeleniumDriver.getDriver;

public class LoginTest {

    private static final String BASE_URL = "http://newtours.demoaut.com";

    @AfterClass
    public static void tearDown() {
        getDriver().quit();
    }

    @Before
    public void should_open_page() {
        getDriver().get(BASE_URL);
        Assert.assertEquals(getDriver().getTitle(), "Welcome: Mercury Tours");
    }

    @Test
    public void should_not_login_with_wrong_credentials() throws Exception {
        //given
        LoginPage loginPage = new LoginPage();
        //when
        loginPage.login("user", "password");
        //then
        Assert.assertTrue(loginPage.isSignOnDisplayed());
    }
}
