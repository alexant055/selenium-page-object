package com.selenium.pop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginTest() {
		String applicationUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		// Find the OS name
		System.out.println(System.getProperty("os.name"));

		// Set the driver path to launch
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

		// Instantiate the chrome driver
		WebDriver driver = new ChromeDriver();
		// Maximize the screen
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(applicationUrl);
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.userName().sendKeys("username");
		loginPage.password().sendKeys("password");
		loginPage.submit().click();
		
		loginPage.homeLink().click();
		
		HomePage homePage = new HomePage(driver);
		
		homePage.searchBox().sendKeys("reddiff" + Keys.RETURN);
		
	}
}
