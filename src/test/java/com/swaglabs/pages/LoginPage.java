package com.swaglabs.pages;

import com.swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(id = "user-name")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//input [@value='Login']")
	public WebElement loginBtn;

	@FindBy(xpath = "//h3 [@data-test='error']")
	public WebElement errorMsg;

}
