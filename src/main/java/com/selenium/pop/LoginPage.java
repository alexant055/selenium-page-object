package com.selenium.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	By username = By.xpath("//input[@id='login1']");
//	By password = By.name("passwd");
//	By submitBtn = By.name("proceed");
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement submitBtn;
	
	@FindBy(linkText="rediff.com")
	WebElement homeLink;
	
	public WebElement userName() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement submit() {
		return submitBtn;
	}
	
	public WebElement homeLink() {
		return homeLink;
	}
	
}
