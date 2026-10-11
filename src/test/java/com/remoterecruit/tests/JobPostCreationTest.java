package com.remoterecruit.tests;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.remoterecruit.pages.JobPostCreationPage;
import com.remoterecruit.utils.DriverManager;

public class JobPostCreationTest {

	private WebDriver driver = null;

	@Test
	public void jobpostcreation() {
		driver = DriverManager.driver;
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(JobPostCreationPage.JobPostCreationModule.YourjobpostTab)));
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.YourjobpostTab)).click();
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(JobPostCreationPage.JobPostCreationModule.AddJobBtn)));
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.AddJobBtn)).click();
		Random rand = new Random();
		int randomNum = rand.nextInt(10000);
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.JobpostTitle))
				.sendKeys("TestSeleniumJob" + randomNum);
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.LanguageRequired)).click();
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.LanguageRequired))
				.sendKeys("English" + Keys.ENTER);
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.JobType))
				.sendKeys("Full-Time" + Keys.ENTER);
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.HourlyRate)).sendKeys("25");
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.JobSkillTag))
				.sendKeys("Selenium" + Keys.ENTER + "Java" + Keys.ENTER + "SQA" + Keys.ENTER);
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.JobDescription))
				.sendKeys("This is a test job creation to test job creation process by an employer in RR");
		driver.findElement(By.xpath(JobPostCreationPage.JobPostCreationModule.PostJobBtn)).click();

	}
}
