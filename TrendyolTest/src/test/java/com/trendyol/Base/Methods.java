package com.trendyol.Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
    //Methods

    //ChromeDriver Directory *Please declare your 'chromedriver.exe' directory*
    String browseChromeDriver ="resources/chromedriver.exe";

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebElement find(By by){
        return driver.findElement(by);
    }
    public static void click(By by){
        find(by).click();
    }
    public static void sendKeys(By by, String text){
        find(by).sendKeys(text);
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", browseChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }
    @After
    public void tearDown()  {
        driver.quit();
    }
}
