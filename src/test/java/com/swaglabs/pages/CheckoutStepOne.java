package com.swaglabs.pages;

import com.swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOne {
	public CheckoutStepOne()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(id = "first-name")
	public WebElement fname;
	
	@FindBy(id = "last-name")
	public WebElement lname;
	
	@FindBy(id = "postal-code")
	public WebElement zipCode;

	@FindBy(id="continue")
	public WebElement continueBtn;


}
