package Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class genricXYZ {
	WebDriver driver;
	
	public genricXYZ(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Click(WebElement element) {
		element.click();
	}
	public void Sendkeys(WebElement Element, String text) {
		Element.sendKeys(text);
	}
	public void dropdown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public void validate_balance(int Current_balance,int expected_balance) {
		Assert.assertEquals(Current_balance, expected_balance);
	}
	

}
