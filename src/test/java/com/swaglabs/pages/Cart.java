package com.swaglabs.pages;

import com.swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BaseClass {

	@FindBy(id="checkout")
	public WebElement checkoutBtn;
	
	public Cart()
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	
}
