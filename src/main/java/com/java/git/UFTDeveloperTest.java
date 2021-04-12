package com.java.git;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Image;
import com.hp.lft.sdk.web.ImageDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException, InterruptedException {
Browser browser = BrowserFactory.launch(BrowserType.CHROME);
    	
    	browser.navigate("www.advantageonlineshopping.com");	
    	
        browser.sync();   
        
         	
    	Thread.sleep(10000);
		Link userMenuLink = browser.describe(Link.class, new LinkDescription.Builder()
				.innerText("My account My orders Sign out ")
				.tagName("A").build());
		userMenuLink.waitUntilExists();	
		
		
		/*
		WaitUntilTestObjectState.waitUntil(userMenuLink, evaluator)
		
		           public boolean evaluate(WebElement suggestionBox){
                try{
                    return suggestionBox.exists() && suggestionBox.isVisible();
                 }
                catch(Exception e){
                    return false;
                }
            }
		*/
		
		if (userMenuLink.isVisible()) 
		{
			userMenuLink.click();			
		}
		else
		{
			browser.close();		
		}					
		Thread.sleep(5000);
		EditField usernameEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
				.name("username")
				.tagName("INPUT")
				.type("text").build());
		usernameEditField.setValue("alpesh");

		WebElement passwordWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
				.innerText("Password")
				.tagName("LABEL").build());
		passwordWebElement.click();

		EditField passwordEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
				.name("password")
				.tagName("INPUT")
				.type("password").build());
		passwordEditField.setSecure("606ef2b18ccd14c25faa005add8004c5b496acafbc2c95c5");
		
		Button signInBtnundefinedButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name("SIGN IN")
				.tagName("BUTTON").build());
		//signInBtnundefinedButton.waitUntilExists();
		signInBtnundefinedButton.click();
		
		Thread.sleep(3000);
		Link speakersCategoryLink = browser.describe(Link.class, new LinkDescription.Builder()
				.innerText("SPEAKERS Shop Now ")
				.tagName("DIV").build());
		speakersCategoryLink.click();
		Thread.sleep(3000);
		Image fetchImageImageId4200Image = browser.describe(Image.class, new ImageDescription.Builder()
				.alt("")
				.tagName("IMG")
				.type(com.hp.lft.sdk.web.ImageType.NORMAL)
				.index(1).build());
		fetchImageImageId4200Image.click();
		Thread.sleep(3000);
		
		Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("submit")
				.name("ADD TO CART")
				.tagName("BUTTON").build());
		saveToCartButton.click();
		//***********************
		Thread.sleep(2000);
		
		/*
		Link shoppingCartLink = browser.describe(Link.class, new LinkDescription.Builder()
				.accessibilityName("ShoppingCart")
				.innerText("1 ")
				.role("link")
				.tagName("A").build());
		shoppingCartLink.hoverTap();
	*/
		Button checkOutBtnButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("submit")
				.name("CHECKOUT  ($269.99)")
				.tagName("BUTTON").build());
		checkOutBtnButton.click();
	
		Thread.sleep(5000);
		
		Link shoppingCartLink = browser.describe(Link.class, new LinkDescription.Builder()
				.accessibilityName("ShoppingCart")
				.innerText("1 ")
				.role("link")
				.tagName("A").build());
		shoppingCartLink.click();
		Thread.sleep(1000);

		WebElement webElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
				.accessibilityName("")
				.className("removeProduct iconCss iconX")
				.innerText("")
				.tagName("DIV")
				.index(0).build());
		webElement.click();
		Thread.sleep(3000);
		Link userMenuLink1 = browser.describe(Link.class, new LinkDescription.Builder()
				.innerText("alpesh My account My orders Sign out ")
				.tagName("A").build());
		//userMenuLink1.click();
		userMenuLink1.hoverTap();
		Thread.sleep(1000);
		Link signOutLink = browser.describe(Link.class, new LinkDescription.Builder()
				.innerText("Sign out")
				.tagName("LABEL").build());
		signOutLink.click();
		Thread.sleep(3000);
    	browser.close();
    }

}