package com.remoterecruit.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.remoterecruit.pages.LoginPageEmployer;
import com.remoterecruit.pages.LoginPageJobseeker;
import com.remoterecruit.utils.DriverManager;
import com.remoterecruit.utils.UrlTextUtils;

public class LoginTest {
	private WebDriver driver = null;
	
	@Test
	public void checkLoginPageTitle() {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
	}

	@Test(dependsOnMethods = "checkLoginPageTitle")
	public void logintestjobseeker() {
		driver.findElement(By.xpath(LoginPageJobseeker.LoginModule.signinBTN)).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageJobseeker.LoginModule.user_name)));
		driver.findElement(By.xpath(LoginPageJobseeker.LoginModule.user_name))
				.sendKeys(LoginPageJobseeker.LoginModule.loginusername);
		driver.findElement(By.xpath(LoginPageJobseeker.LoginModule.continurBtn)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(LoginPageJobseeker.LoginModule.signinwithpasswordBtn)));
		driver.findElement(By.xpath(LoginPageJobseeker.LoginModule.signinwithpasswordBtn)).click();
		driver.findElement(By.xpath(LoginPageJobseeker.LoginModule.password))
				.sendKeys(LoginPageJobseeker.LoginModule.loginpassword);
		driver.findElement(By.xpath(LoginPageJobseeker.LoginModule.nextBtn)).click();

	}

	@Test(dependsOnMethods = "logintestjobseeker")
	public void logintestemployer() {
		driver = DriverManager.driver;
		// driver2 = new ChromeDriver();
		driver.get(UrlTextUtils.URL.Base_URL);
		driver.findElement(By.xpath(LoginPageEmployer.LoginModule.signinBTN)).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageEmployer.LoginModule.user_name)));
		driver.findElement(By.xpath(LoginPageEmployer.LoginModule.user_name))
				.sendKeys(LoginPageEmployer.LoginModule.loginusername);
		driver.findElement(By.xpath(LoginPageEmployer.LoginModule.continurBtn)).click();
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(LoginPageEmployer.LoginModule.signinwithpasswordBtn)));
		driver.findElement(By.xpath(LoginPageEmployer.LoginModule.signinwithpasswordBtn)).click();
		driver.findElement(By.xpath(LoginPageEmployer.LoginModule.password))
				.sendKeys(LoginPageEmployer.LoginModule.loginpassword);
		driver.findElement(By.xpath(LoginPageEmployer.LoginModule.nextBtn)).click();

	}
}
