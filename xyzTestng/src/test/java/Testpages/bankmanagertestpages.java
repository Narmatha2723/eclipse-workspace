package Testpages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Util.genricXYZ;

public class bankmanagertestpages extends genricXYZ {
	
	@FindBy(xpath = "//button[text()='Bank Manager Login']")
	WebElement bankmanagerlogin;
	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	WebElement addcustomerBtn;
	@FindBy(xpath = "//button[@ng-click='addCust()']")
	WebElement addcustomerTile;
	@FindBy(xpath = "//input[@ng-model='fName']")
	WebElement fname;
	@FindBy(xpath = "//input[@ng-model='lName']")
	WebElement lastname;
	@FindBy(xpath = "//input[@ng-model='postCd']")
	WebElement postcode;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitdetails;
	@FindBy(xpath = "//button[@ng-click='openAccount()']")
	WebElement openaccBtn;
	@FindBy(id="userSelect")
	WebElement cusName;
	@FindBy(id="currency")
	WebElement currency;
	@FindBy(xpath = "//button[@ng-click='showCust()']")
	WebElement custTile;
	@FindBy(xpath = "//input[@ng-model='searchCustomer']")
	WebElement searchCus;
	WebDriver driver;
	 
	public bankmanagertestpages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	public void login() {
		Click(bankmanagerlogin);
	}
	public void addcustomerTile(String firstname,String lname,String pin) throws IOException {
		Click(addcustomerTile);
		Sendkeys(fname,firstname);
		Sendkeys(lastname,lname);
		Sendkeys(postcode,pin);
		
	}
	public void addcusBtn() {
		Click(submitdetails);
	}
	public int validate_CusID_popup() {
		String CusId = driver.switchTo().alert().getText();
		String cusidTextarray = CusId.split(":")[1];
		int cusID = Integer.parseInt(cusidTextarray);
		driver.switchTo().alert().accept();
		return cusID;
	}
	public void opeaAccTile() {
		Click(openaccBtn);
	}
	public void cusDropdown(String CustomerName) {
		dropdown(cusName,CustomerName);
	}
	public void currDropdown(String Currency) {
		dropdown(currency,Currency);
	}
	public void processBtn() {
		Click(submitdetails);
	}
	public int validateAlert_OA() {
		String accNo = driver.switchTo().alert().getText();
		String alertTextarray = accNo.split(":")[1];
		int Accno = Integer.parseInt(alertTextarray);
		driver.switchTo().alert().accept();
		return Accno;
		
	}
	public void customerTile() {
		custTile.click();
	}
	public void searchCustomer(String cusname) {
		Sendkeys(searchCus,cusname);
	}
	

}
