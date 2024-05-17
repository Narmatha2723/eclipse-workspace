package pomClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMsigninBS {

	
		By signinLink = By.xpath("//a[@class='sign-in-link'][1]");
		By email = By.id("user_email_login");
		By password = By.id("user_password");
		By confirm = By.xpath("//*[@id=\"confirmation\"]/main/div[2]/section/div/div/div/div[1]/div[1]/div/h2");
		
		WebDriver driver;
	    WebDriverWait wait;
	    Robot robot;
	    
	    public POMsigninBS(WebDriver driver) throws AWTException {
			this.driver = driver;
			robot=new Robot();

	}
	    public void SigninLink() throws InterruptedException {
			driver.findElement(signinLink).click();
			Thread.sleep(2000);
		}
		
		public void Signin(String Email, String Password) throws InterruptedException {
			driver.findElement(email).sendKeys(Email);
			driver.findElement(password).sendKeys(Password);
			Thread.sleep(2000);
			
		}
		public void Signin() throws InterruptedException {
			
			//wait.until(ExpectedConditions.elementToBeClickable(signin));
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			
		}
		public void Confirm() {
			System.out.println(driver.findElement(confirm).getText());
			driver.quit();
		}
		
		

}
