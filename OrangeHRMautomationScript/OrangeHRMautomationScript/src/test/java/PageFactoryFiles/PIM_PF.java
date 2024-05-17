package PageFactoryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_PF {
	
	@FindBy(xpath = "//input[@name='username']") WebElement Username;
	@FindBy(xpath = "//input[@name='password']") WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") WebElement login;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a") WebElement PIMlink;
	@FindBy(xpath = "//*[contains(text(),'Employee List')]") WebElement EmpList;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement Addemp;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']") WebElement empFN;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-middlename']") WebElement empMN;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']") WebElement empLN;
	@FindBy(xpath = "//button[@type='submit']") WebElement saveEmp;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input") WebElement Nickname; 
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i") WebElement nationality;
	@FindBy(xpath = "//*[contains(text(),\"Japanese\")]") WebElement japan;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i") WebElement marital;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input") WebElement DOB;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span") WebElement radioBtn;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button") WebElement savePersonal;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input") WebElement EmpName;
	@FindBy(xpath = "//button[@type='submit']") WebElement submit;
	@FindBy(xpath = "//button[@type='reset']") WebElement reset;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span") WebElement secondCheckbox;
	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[1]") WebElement cancelBtn;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button") WebElement deleteBtn;
	 
	
	WebDriver driver;
	Robot robot;
	
	public PIM_PF(WebDriver driver) {
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
	public void pimLink() {
		PIMlink.click();
	}
	public void empList() {
		EmpList.click();
	}
	public void EmpDetails(String FN,String MN,String LN) {
		Addemp.click();
		empFN.sendKeys(FN);
		empMN.sendKeys(MN);
		empLN.sendKeys(LN);
		saveEmp.click();
	}
	public void personelDetails(String ani) {
		Nickname.sendKeys(ani);
		
	}
	public void nationality() throws InterruptedException {
		nationality.click();
		Thread.sleep(1000);
		japan.click();
	}
	public void marital() throws AWTException {
		marital.click();
		robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	public void dob(String Dob) {
		DOB.sendKeys(Dob);
	}
	public void gender() {
		radioBtn.click();
		savePersonal.click();
	}
	public void searchEmp(String empName) {
		EmpList.click();
		EmpName.sendKeys(empName);
		submit.click();
	}
	public void clickReset() throws InterruptedException {
		reset.click();
		Thread.sleep(3000);
	}
	public void checkBx() {
		secondCheckbox.click();
		
	}
	public void deleteSelected() {
		deleteBtn.click();
	}
	public void noCancel(){
		cancelBtn.click();
	}

}
