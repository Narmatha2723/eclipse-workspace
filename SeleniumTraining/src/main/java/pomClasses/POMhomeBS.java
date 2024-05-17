package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMhomeBS {

	By GetStartBtn = By.id("signupModalProductButton");
	WebDriver driver;
	
	public POMhomeBS(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Getstart() {
		driver.findElement(GetStartBtn).click();
	}

}
