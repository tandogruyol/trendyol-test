package com.trendyol.Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class TrendyolTest extends com.trendyol.Base.TestBase {
    public static void navigateToWebsite() {

    //Succesfully Opened The Website
    driver.get(loginUrl);
    Assert.assertEquals(confPage, driver.getTitle());
    System.out.println("The Website Has Successfully Been Opened!");

    //Closing the advertisement
        boolean textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(closeAd))).isEnabled();
    if (textBox) {
        click(By.cssSelector(closeAd));
    }
}
    public static void login() {
        //Go to LogIn Page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(goToLogin)));
        click(By.cssSelector(goToLogin));

        //Log into by the given account info
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Submit)));
        sendKeys(By.cssSelector(inputLogID), LogID);
        sendKeys(By.cssSelector(inputLogPass),LogPass);
        click(By.cssSelector(Submit));
    }

    public static void selectProduct() {
        //Search 'Bilgisayar' on the searchbar

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchBar)));
        sendKeys(By.cssSelector(searchBar),"Bilgisayar");
        find(By.cssSelector(searchBar)).sendKeys(Keys.ENTER);

        //Selection of the product

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectProduct)));
        click(By.cssSelector(selectProduct));

    }
    public static void comparePrice(){

        //Collect the price data
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(costInfo)));
        String price = find(By.cssSelector(costInfo)).getText();

        //Add the product to cart
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(addToCart)));
        click(By.cssSelector(addToCart));

        //Go to Cart
        click(By.cssSelector(goToCart));

        //Check the cost of the carted product
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(comparePrice2)));
        String price2 = find(By.cssSelector(comparePrice2)).getText();

        //Compare the prices with the product menu
        Assert.assertEquals(price, price2);
        System.out.println("Comparison is Complete!");
    }
    public static void increaseNumber(){

        //Increase the quantity to 2
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(increaseQuantity)));
        click(By.cssSelector(increaseQuantity));

        //Check and confirm if we've got 2 carted products
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(quantityV)));
        String quantity = find(By.cssSelector(checkQuantity)).getAttribute("value");
        Assert.assertEquals("2", quantity);
        System.out.println(2 + " product has been added to cart!");
    }

    public static void removeItems(){

        //Click on the remove button/symbol
        click(By.cssSelector(removeProducts));

        //Click on the remove and add to my favourites
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(confirmRemove)));
        click(By.cssSelector(confirmRemove));

        //Confirm the cart has been emptied
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(actualText)));
        Assert.assertEquals(expectedText, find(By.cssSelector(actualText)).getText());
        System.out.println("The cart has been emptied!");
    }
    }



