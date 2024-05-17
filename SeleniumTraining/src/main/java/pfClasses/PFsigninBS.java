package pfClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PFsigninBS {
        
	    @FindBy(xpath = "//a[@class='sign-in-link'][1]") WebElement signinLink;
		@FindBy(id = "user_email_login") WebElement email;
		@FindBy(id = "user_password") WebElement password;
		//@FindBy(xpath = "//input[@id='user_submit']") WebElement signin;
		@FindBy(xpath = "//*[@id=\"confirmation\"]/main/div[2]/section/div/div/div/div[1]/div[1]/div/h2") WebElement confirm;
		
		WebDriver driver;
	    WebDriverWait wait;
	    Robot robot;
		
		public PFsigninBS(WebDriver driver) throws AWTException{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		    robot=new Robot();
			//wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		}
		
		public void SigninLink() throws InterruptedException {
			signinLink.click();
			Thread.sleep(2000);
		}
		
		public void Signin(String Email, String Password) throws InterruptedException {
			email.sendKeys(Email);
			password.sendKeys(Password);
			Thread.sleep(2000);
			
		}
		public void Signin() throws InterruptedException {
			
			//wait.until(ExpectedConditions.elementToBeClickable(signin));
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			
		}
		public void Confirm() {
			System.out.println(confirm.getText());
			
		}

	}


