package com.trendyol.mainProcess;


import com.trendyol.Test.*;
import org.junit.Test;

public class RunTest extends TrendyolTest{
    @Test
  public void runTest() throws InterruptedException {
      navigateToWebsite();  //Go to Website
      login();              //Log in
      selectProduct();      //Choose a random product
      comparePrice();       //Compare the cost of selected product
      increaseNumber();     //Increase quantity
      removeItems();        //Empty the cart
  }
}
