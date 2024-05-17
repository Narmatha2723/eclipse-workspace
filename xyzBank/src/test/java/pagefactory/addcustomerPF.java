package pagefactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import DataFile.xyzExcelFile;

public class addcustomerPF {
	
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
	@FindBy(xpath = "//option[@class='ng-binding ng-scope']")
	List<WebElement> cusList;
	@FindBy(id="currency")
	WebElement currency;
	@FindBy(id="currency")
	List<WebElement> currencyList;//button[@ng-click='showCust()']
	@FindBy(xpath = "//button[@ng-click='showCust()']")
	WebElement custTile;
	@FindBy(xpath = "//input[@ng-model='searchCustomer']")
	WebElement searchCus;
	WebDriver driver;
	xyzExcelFile xyzExcel;
	public addcustomerPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		xyzExcel = new xyzExcelFile();
	}
	
	
	public void precondition() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void login() {
		bankmanagerlogin.click();
	}	
	public void AddcustomerDetails() throws IOException {
		addcustomerTile.click();
		fname.sendKeys(xyzExcel.firstname());
        lastname.sendKeys(xyzExcel.laststname());
		postcode.sendKeys((String.valueOf(xyzExcel.postcode())));
		
		
	}
	public void AddCustBtn() {
		submitdetails.click();
	}
	public void validatealert() throws IOException {
		String CusId = driver.switchTo().alert().getText();
		String cusidTextarray = CusId.split(":")[1];
		int cusID = Integer.parseInt(cusidTextarray);
		xyzExcel.writeDataCusId(cusID);
		driver.switchTo().alert().accept();
	}
	public void opeaAccTile() {
		openaccBtn.click();
	}
    public void custDropdown() {
    	cusName.click();
    	
			for (WebElement option : cusList) {
    			if (option.getText().equalsIgnoreCase("Narmatha E")) {
    				option.click();
    				break;
    			}
    		}
		}
    	
	
	public void currencyDropown() {
		 currency.click();
		 Select curr = new Select(currency);
		 curr.selectByVisibleText("Rupee");
	}
	public void processBtn() {
		submitdetails.click();
	}
	public void validateAlert_OA() throws IOException {
		String accNo = driver.switchTo().alert().getText();
		String alertTextarray = accNo.split(":")[1];
		int Accno = Integer.parseInt(alertTextarray);
		xyzExcel.writeDataAccNo(Accno);
		driver.switchTo().alert().accept();
		
	}
	public void writeadataintoExcel() {
		
	}
	public void customerTile() {
		custTile.click();
	}
	public void searchCustomer() throws IOException {
		searchCus.sendKeys(xyzExcel.firstname());
	}
	public void Screenshot() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(".//screenshots//sc1.png"));
		System.out.println("screenshot taken");
	}
	

}
