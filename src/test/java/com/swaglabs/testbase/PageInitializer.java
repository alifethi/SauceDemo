package com.swaglabs.testbase;

import com.swaglabs.pages.*;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;
	
	public static Cart cart;
	public static InventoryItemPage inventoryItemPage;
	public static CheckoutStepOne checkoutStepOne;
	public static CheckoutStepTwo checkoutStepTwo;
	public static CheckoutComplete checkoutComplete;
	
	

	public static void initialize() {
		// initialize pages
		loginPage = new LoginPage();
		mainPage = new MainPage();
		cart = new Cart();
		inventoryItemPage = new InventoryItemPage();
		checkoutStepOne = new CheckoutStepOne();
		checkoutStepTwo = new CheckoutStepTwo();
		checkoutComplete = new CheckoutComplete();
		
	}

}
