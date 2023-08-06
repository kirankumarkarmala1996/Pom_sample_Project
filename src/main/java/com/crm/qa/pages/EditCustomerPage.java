package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.qa.base.BasePage;
import com.crm.qa.utilities.Constents;
import com.crm.qa.utilities.ElementUtilities;

public class EditCustomerPage extends BasePage {
	
	WebDriver driver;
	ElementUtilities utils;
	
	public EditCustomerPage(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtilities(driver);
	}
	
	By pageHeader= By.xpath("//p[@class='heading3']");
	
	By CustomerIdTextBox=By.xpath("//input[@name='cusid']");
	
	By Submit= By.xpath("//input[@type='submit']");
	
	By Reset= By.xpath("//input[@name='res']");
	
	
	
	
	public String getEditCustomerPageTittle() {
		utils.doNavigatePage(Constents.editCustomerPageURL);
		
		return utils.doGetTitle();
	}
	
	public boolean pageaderIsDisplay() {
		utils.doNavigatePage(Constents.editCustomerPageURL);
		return utils.DoIsDisplay(pageHeader);
	}
	
	public boolean basicElementsAreDisplay() {
		utils.doNavigatePage(Constents.editCustomerPageURL);
		utils.DoIsDisplay(CustomerIdTextBox);
		utils.DoIsDisplay(Submit);
		return utils.DoIsDisplay(Reset);
		
	}
	
	
	
	
	
	

}
