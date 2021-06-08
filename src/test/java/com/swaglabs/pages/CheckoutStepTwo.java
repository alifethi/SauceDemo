package com.swaglabs.pages;

import com.swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwo {
	public CheckoutStepTwo()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath="//div[@class = 'inventory_item_name']")
	public WebElement itemName;

	@FindBy(id="finish")
	public WebElement finishBtn;
	

	
	
}
