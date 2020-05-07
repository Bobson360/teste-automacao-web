package pages;

import org.openqa.selenium.By;

import support.BasePage;

public class MenuPage extends BasePage {
	
	public void clicarAccounts() {
		clicarMenu(By.xpath("//div[2]/ul/li[5]/a"));
	}
	
	public void clicarSuppliers() {
		clicarMenu(By.xpath("//li[5]/ul/li[2]/a"));
	}
}
