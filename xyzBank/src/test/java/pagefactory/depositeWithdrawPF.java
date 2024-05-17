package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class depositeWithdrawPF {
	
		WebDriver driver;
//		https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
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
		@FindBy(xpath = "//input[@type='number']")
		WebElement withdrawlAmt;
		@FindBy(xpath = "//button[text()='Withdraw']")
		WebElement WithdrawBtn;
		
		
		
	

}
