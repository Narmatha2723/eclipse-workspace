package Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Util.genricXYZ;

public class cusTestpage extends genricXYZ  {
	
	WebDriver driver;
	@FindBy(xpath = "//button[@ng-click='home()']")
	WebElement homebtn;
	@FindBy(xpath = "//button[@ng-click='customer()']")
	WebElement customerlogin;
	@FindBy(id = "userSelect")
	WebElement customername;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement getlogin;
	@FindBy(xpath = "//button[@ng-click='deposit()']")
	WebElement depositTile;
	@FindBy(xpath = "//input[@ng-model='amount']")
	WebElement amountfield;
	@FindBy(xpath = "//button[text()='Deposit']")
	WebElement depositbtn;
	@FindBy(xpath = "//span[@ng-show='message']")
	WebElement successMsg;
	@FindBy(xpath = "//strong[@class='ng-binding'][2]")
	WebElement balance;
	@FindBy(xpath = "//button[@ng-click='withdrawl()']")
	WebElement withdrawlTile;
	@FindBy(xpath = "//button[text()='Withdraw']")
	WebElement WithdrawBtn;
	@FindBy(xpath = "//button[@ng-click='transactions()']")
	WebElement transactionTile;

	
	public cusTestpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void CustomerLogin() {
		Click(homebtn);
		Click(customerlogin);
	}
	public void CusDropdown(String cusname) {
		dropdown(customername,cusname);
	}
	public void loginbtn() {
		Click(getlogin);
	}
	
	public void DepositeTile(String depAmt) {
		Click(depositTile);
		Sendkeys(amountfield,depAmt);
		Click(depositbtn);
	}
	public String Balance() {
		String ExistingBalance = balance.getText();
		return ExistingBalance;
	}
	
	public void withdrawlTile(String withdrawAmt) throws InterruptedException {
		Click(withdrawlTile);
		Thread.sleep(3000);
		Sendkeys(amountfield,withdrawAmt);
		Thread.sleep(3000);
		Click(WithdrawBtn);
	}
	public void TransactionTile() {
		Click(transactionTile);
		
	}
	

}
