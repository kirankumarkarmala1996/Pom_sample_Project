package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.qa.base.BasePage;
import com.crm.qa.utilities.ElementUtilities;

public class HomePage extends BasePage {

	WebDriver driver;
	ElementUtilities utils;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		utils = new ElementUtilities(driver);
	}

//	

	By searchBox = By.name("search");
	By forget_Password = By.xpath("//html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a");
	By searchButton = By.xpath("//i[@class='fa fa-search']");
	By myAccount = By.xpath("//span[text()='My Account']");
	By RegisterButton = By.xpath("//a[text()='Register']");
	By loginButton = By.xpath("//a[text()='Login']");

	public String getLoginPageTitle() {
		return utils.doGetTitle();
	}

//	public boolean loginPageHeaderIsDisplay() {
//		return utils.DoIsDisplay(header);
//	}
//	
//	public boolean basicElementsIsDisplay() {
//		utils.DoIsDisplay(LoginBtn);
//		utils.DoIsDisplay(Password); 
//		utils.DoIsDisplay(UserId);
//		return utils.DoIsDisplay(ResetBtn);
//	}
//	
//	public ManagerHomePage doLogin(String username, String password) {
//		utils.doSendKeys(UserId, username);
//		utils.doSendKeys(Password, password);
//		utils.doClick(LoginBtn);
//		

//	its navigate to  managerHomePage
//		return new ManagerHomePage(driver);
//	}

	public boolean isSearchBoxIsDisplayed() {
		return utils.DoIsDisplay(searchBox);
	}

	public void enterTextInSearchBox(String value) {
		utils.doSendKeys(searchBox, value);
	}

	public void clickOnseearchButton() {
		utils.doClick(searchButton);
	}

	public void clickOnMyAccount() {
		utils.doClick(myAccount);
	}

	public void clickOnRegister() {
		utils.doClick(RegisterButton);
	}

	public void clickOnLogin() {
		utils.doClick(loginButton);
	}

	public void registerIsDisplayed() {
		utils.DoIsDisplay(RegisterButton);
	}

	public void loginIsDisplayed() {
		utils.DoIsDisplay(loginButton);

	}
}
