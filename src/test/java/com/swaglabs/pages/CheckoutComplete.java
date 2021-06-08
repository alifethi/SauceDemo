package com.swaglabs.pages;

import com.swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete {

    public CheckoutComplete()
    {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(xpath="//h2[@class='complete-header']")
    public WebElement completeMsg;



}
