package PageFactoryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimesheetPF {
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement Username;
	@FindBy(xpath = "//input[@name='password']") WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") WebElement login;
	@FindBy(xpath = "//a[@href='/web/index.php/time/viewTimeModule']") WebElement Time;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span/i") WebElement Timesheets;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[2]/a") WebElement EmpTimsheet;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input") WebElement EmpName;
	@FindBy(xpath = "//button[@type='submit']") WebElement view;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']") WebElement Edit;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[1]/div/div[2]/div/div/input") WebElement project;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[2]/div/div[2]/div/div/div[2]/i") WebElement Activity;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[3]/div/div[2]/input") WebElement Mon;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[4]/div/div[2]/input") WebElement Tue;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[5]/div/div[2]/input") WebElement Wed;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[6]/div/div[2]/input") WebElement Thu;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[7]/div/div[2]/input") WebElement Fri;
	@FindBy(xpath = "//button[@type='submit']") WebElement save;
	
	WebDriver driver;
	Robot robot;
	
	public TimesheetPF(WebDriver driver) {
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
	public void timeTile() throws InterruptedException {
		Time.click();
		Thread.sleep(4000);
		Timesheets.click();
		Thread.sleep(4000);
		}
	public void veiwEmployee(String empName) throws InterruptedException, AWTException {
		EmpName.sendKeys(empName);
		Thread.sleep(2000);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		view.click();
		Thread.sleep(3000);
	}
	public void clickEdit() throws InterruptedException {
		Edit.click();
		Thread.sleep(4000);
	}
	public void Projectdetails() throws InterruptedException, AWTException {
		project.click();
		Thread.sleep(2000);
		project.sendKeys("Apache");
		Thread.sleep(3000);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}
	public void Activitydrop() throws InterruptedException {
		Activity.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	public void dates() throws InterruptedException {
		Mon.sendKeys("9");
		Thread.sleep(3000);
		Tue.sendKeys("9");
		Thread.sleep(3000);
		Wed.sendKeys("9");
		Thread.sleep(3000);
		Thu.sendKeys("9");
		Thread.sleep(3000);
		Fri.sendKeys("9");
		Thread.sleep(3000);
	}
	public void Save() throws InterruptedException {
		save.click();
		Thread.sleep(3000);
	}

}
