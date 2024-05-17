package pfClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFhomeBS {
	@FindBy(id = "signupModalProductButton")
	WebElement GetStartBtn;
    WebDriver driver;
	
	public PFhomeBS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Getstart() {
		GetStartBtn.click();
	}

}
