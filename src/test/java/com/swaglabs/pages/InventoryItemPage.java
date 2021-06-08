package com.swaglabs.pages;

import com.swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItemPage {

	public InventoryItemPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath= "//button[text()='Add to cart']")
	public WebElement addBtn;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']/a")
	public WebElement shoppingCard;


}
