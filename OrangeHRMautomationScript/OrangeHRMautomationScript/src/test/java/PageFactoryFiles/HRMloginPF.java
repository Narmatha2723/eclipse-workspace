package PageFactoryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMloginPF {

	@FindBy(xpath = "//input[@placeholder='Username']") WebElement Username;
	@FindBy(xpath = "//input[@name='password']") WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") WebElement login;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") WebElement dashboardText;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a") WebElement adminlink;
	@FindBy(xpath = "//*[contains(text(),\"User Management \")]") WebElement usermgt;
	@FindBy(xpath = "//*[contains(text(),\"Users\")]") WebElement users;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i") WebElement addBtn;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i") WebElement userRole;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input") WebElement empName;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")WebElement status;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input") WebElement username;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input") WebElement psword;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input") WebElement confpswrd;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement saveBtn;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input") WebElement addedUrser;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement searchBtn;
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']") WebElement userProfile;
	@FindBy(xpath = "//a[@href='/web/index.php/auth/logout']") WebElement logoutBtn ;
	@FindBy(xpath = "//img[@src='/web/images/ohrm_branding.png?v=1689053487449']") WebElement OrangeHrmLogo;
	
	WebDriver driver;
	Robot robot;

	public HRMloginPF(WebDriver driver) {
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
		boolean isDisplayed = dashboardText.isDisplayed();
		if (isDisplayed) {
		    System.out.println("suceesfully landed on home page.");
		    // Perform desired actions
		} else {
		    System.out.println("can't abe to land.");
		    // Handle the element not being displayed
		}
		}
	public void Admin() throws AWTException, InterruptedException {
		adminlink.click();
		Thread.sleep(2000);
		usermgt.click();
		Thread.sleep(2000);
		users.click();
		Thread.sleep(2000);
		addBtn.click();
		Thread.sleep(2000);
		userRole.click();
		Thread.sleep(2000);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		empName.sendKeys("a");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		status.click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		username.sendKeys("abcdefgh");
		Thread.sleep(2000);
		psword.sendKeys("asdfghjkl@1234");
		Thread.sleep(2000);
		confpswrd.sendKeys("asdfghjkl@1234");
		Thread.sleep(2000);
		saveBtn.click();
		Thread.sleep(2000);
		}
	public void Addeduser(String ADDeduser) throws InterruptedException {
		Thread.sleep(4000);
		addedUrser.sendKeys(ADDeduser);
		Thread.sleep(2000);
		searchBtn.click();
		Thread.sleep(2000);
	}
	public void Logout() throws InterruptedException {
		userProfile.click();
		Thread.sleep(2000);
		logoutBtn.click();
		Thread.sleep(2000);
		boolean isDisplayed = OrangeHrmLogo.isDisplayed();
		if (isDisplayed) {
		    System.out.println("suceesfully logged out.");
		    // Perform desired actions
		} else {
		    System.out.println("can't abe to logout.");
		    // Handle the element not being displayed
		}
		}
}
