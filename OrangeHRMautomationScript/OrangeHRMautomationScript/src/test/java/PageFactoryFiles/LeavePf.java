package PageFactoryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePf {
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement Username;
	@FindBy(xpath = "//input[@name='password']") WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") WebElement login;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a") WebElement Leave;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/a") WebElement assignLeave;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input") WebElement Empname;
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']") WebElement LeaveType;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/input") WebElement FromDate;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/input") WebElement Todate;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/div/div/div[2]/i") WebElement Duration;
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']") WebElement comments;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement assign;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin']") WebElement OkBtn;
	WebDriver driver;
	Robot robot;

	public LeavePf(WebDriver driver) {
		this.driver = driver;                    
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String uname, String pswd) {
		Username.sendKeys(uname);
		Password.sendKeys(pswd);
		}
	
	public void dashboard() throws InterruptedException {
		login.click();
		Thread.sleep(3000);
		}
	public void AssignLeave() throws InterruptedException {
		Leave.click();
		Thread.sleep(3000);
		assignLeave.click();
		Thread.sleep(3000);
	}
	public void leaveDetails() throws InterruptedException, AWTException {
		Empname.sendKeys("a");
		Thread.sleep(2000);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		LeaveType.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		FromDate.sendKeys("2023-12-25");
		Thread.sleep(3000);
		comments.sendKeys("zxcvbnm123456");
		Thread.sleep(3000);
		assign.click();
		Thread.sleep(3000);
		
	}
	public void popUp() throws InterruptedException {
		OkBtn.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.quit();
	}

}
