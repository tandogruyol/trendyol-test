package com.trendyol.Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase extends Methods{

    //Account LogIn Info
    protected static String LogID = "denemetestiicin@test.com";
    protected static String LogPass = "test1234test";

    //CSS-Selector Shortcuts
    protected static String loginUrl = "http://www.trendyol.com";
    public static String closeAd = "a[title='Close']";
    public static String goToLogin = "div[class='login-container']";
    public static String confPage = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
    public static String inputLogID = "input[id='email']";
    public static String inputLogPass ="input[id='password']";
    public static String Submit ="a[id='loginSubmit']";
    public static String searchBar ="input[class='search-box']";
    public static String selectProduct ="div[data-id='32362675']";
    public static String costInfo = "div.pr-bx-pr-dsc > div:nth-child(2) > span";
    public static String addToCart = "div[class='add-to-bs-tx']";
    public static String goToCart = "i[class='icon navigation-icon-basket']";
    public static String comparePrice2 = "dd[class='total-price']";
    public static String increaseQuantity = "button[class='ty-numeric-counter-button']";
    public static String checkQuantity = "input[class='counter-content']";
    public static String quantityV = "input[value='2']";
    public static String removeProducts = " i[class='i-trash']";
    public static String confirmRemove = "button[class='btn-item btn-remove']";
    public static String expectedText = "Sepetinizde ürün bulunmamaktadır.";
    public static String actualText = "section[id='basketNoProductPage'] p span";
}
