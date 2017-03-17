package com.example.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDriver {

    private static final String PATH = "src/test/resources/chromedriver";
    static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", PATH);

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

}
