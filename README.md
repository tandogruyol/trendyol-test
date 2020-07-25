# trendyol-test
Test Shopping Website using Selenium WebDriver Framework

/* Please Run RunTest in the folder named mainProcess

/* I have selected the product with the ID number 32362675 "div[data-id='32362675']", please replace the css selector of the desired product to be selected 

/* Supported browser ChromeDriver, chromedriver.exe

The project was created by Taner Doğruyol for Testinium. 
Expectations:

-Go to the URL www.trendyol.com and confirm the page.
-Close -if there is- the advertisement/pop-up
-Go to Login page
-Type the email/username and password to its section and submit (In this example username:"denemetestiicin@test.com" password:"test1234test" Can be changed in TestBase.java)
-Search 'Bilgisayar' on the searchbar
-Choose any product, get cost info and go to cart
-Compare the prices between carted and viewed product(of the same product)
-Increase the quantity of the product and confirm quantity is equal to 2
-Remove all items in cart and empty the cart
-Close the website

