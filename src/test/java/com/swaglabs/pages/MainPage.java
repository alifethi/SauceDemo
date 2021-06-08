package com.swaglabs.pages;

import com.swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class MainPage {

	public MainPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath = "//div[@class='app_logo']")
	public WebElement appLogo;
	
	@FindBy(xpath = "//div[@class = 'inventory_item_name']")
	public List<WebElement> itemList;

}
