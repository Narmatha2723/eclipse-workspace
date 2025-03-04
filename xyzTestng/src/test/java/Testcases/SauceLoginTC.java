package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLoginTC {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void url(){
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=1)
	public void valid() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='app_logo']"));
		String ExpectedText = element.getText();
		String actualValidText = "Swag Labs";
		Assert.assertEquals(ExpectedText, actualValidText);
		System.out.println("User enters valid credentials");
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	public void invalid_Uname() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user123");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
//		WebElement element1 = driver.findElement(By.xpath("//h3[@data-test='error']"));
//		String ExpectedText = element1.getText();
//		String actualValidText = "Epic sadface: Username and password do not match any user in this service";
//		Assert.assertEquals(ExpectedText, actualValidText);
//		System.out.println("User enters invalid password");
	}
	@Test(priority=3)
	public void invalid_pass() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce123");
		driver.findElement(By.id("login-button")).click();
		
	}
	@Test(priority=4)
	public void empty() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce123");
		driver.findElement(By.id("login-button")).click();
		WebElement element1 = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ExpectedText = element1.getText();
		String actualValidText = "Epic sadface: Username is required";
		Assert.assertEquals(ExpectedText, actualValidText);
		System.out.println("User gives null values");
	}
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}
	

}
