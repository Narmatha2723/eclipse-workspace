package PageFactoryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobdropdownPF {
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement Username;
	@FindBy(xpath = "//input[@name='password']") WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") WebElement login;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a") WebElement adminlink;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")WebElement Job;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a") WebElement jobTitle;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement addButton;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input") WebElement jobtext;
	@FindBy(xpath = "//textarea[@placeholder='Type description here']") WebElement jobDes; 
	@FindBy(xpath = "//div[@class='oxd-file-button']") WebElement browse;
	@FindBy(xpath = "//textarea[@placeholder='Add note']") WebElement addnote;
	@FindBy(xpath = "//button[@type='submit']") WebElement save;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a") WebElement payGrades;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement AddButton;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input") WebElement payGradeName;
	@FindBy(xpath = "//button[@type='submit']") WebElement savePay;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a") WebElement empmntStatus;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement Add;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input") WebElement empstatusName;
	@FindBy(xpath = "//button[@type='submit']") WebElement saveEmpStatus;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a") WebElement jobCategories ;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement AddCats;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input") WebElement CategoryName;
	@FindBy(xpath = "//button[@type='submit']") WebElement saveCategory;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[5]/a") WebElement workShifts;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement addShift;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input") WebElement shiftName;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") WebElement AssignedEmp;
	@FindBy(xpath = "//button[@type='submit']") WebElement saveShifts;
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash'][1]") WebElement trashicon;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']") WebElement delete;
	

	WebDriver driver;
	Robot robot;
	
	public JobdropdownPF(WebDriver driver) {
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
	public void AdminTile() throws InterruptedException {
		adminlink.click();
		Thread.sleep(3000);
	}
	public void Jobdd() throws InterruptedException {
		Job.click();
		Thread.sleep(3000);
		jobTitle.click();
		Thread.sleep(3000);
	}
    public void addBtn() {
    	addButton.click();
    }
    public void jobDetails() throws InterruptedException {
    	Thread.sleep(3000);
    	jobtext.click();
    	Thread.sleep(3000);
    	jobtext.sendKeys("Automation Testing1");
    	Thread.sleep(3000);
    	jobDes.sendKeys("Selenium and java1");
    	Thread.sleep(3000);
    	}
    public void browseFile() throws InterruptedException, AWTException {
      browse.click();
      Thread.sleep(3000);
      robot = new Robot();
    	
  	  StringSelection filepath=new StringSelection("C:\\Users\\NARMAE\\Downloads\\IMG.jpg");
  	  
  	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
  	  
  	  robot.keyPress(KeyEvent.VK_CONTROL);
  	  robot.keyPress(KeyEvent.VK_V);
  	  Thread.sleep(1000);
  	  
  	  robot.keyRelease(KeyEvent.VK_V);
  	  robot.keyRelease(KeyEvent.VK_CONTROL);
  	  
  	  robot.keyPress(KeyEvent.VK_ENTER);
  	  
  	  robot.keyRelease(KeyEvent.VK_ENTER);
  	 
  	  Thread.sleep(3000);
  	  System.out.println("File Uploaded Successfully");
  	  addnote.sendKeys("asdfghjklm");
  	  }
    public void saveJob() throws InterruptedException {
    	save.click();
    	Thread.sleep(3000);
    }
    public void PayGrades() throws InterruptedException {
    	Thread.sleep(3000);
    	Job.click();
    	Thread.sleep(3000);
    	payGrades.click();
    	Thread.sleep(3000);
    	
    }
    public void paygradeName(String grade) throws InterruptedException {
    	AddButton.click();
    	Thread.sleep(3000);
    	payGradeName.sendKeys(grade);
    	Thread.sleep(3000);
    	savePay.click();
    	Thread.sleep(3000);
    }
    public void EmpStatus(String status) throws InterruptedException {
    	Job.click();
    	Thread.sleep(3000);
    	empmntStatus.click();
    	Thread.sleep(3000);
    	Add.click();
    	Thread.sleep(3000);
    	empstatusName.sendKeys(status);
    	Thread.sleep(3000);
    	saveEmpStatus.click();
    	Thread.sleep(3000);
    }
    public void jobCategories(String categoryName) throws InterruptedException {
    	Thread.sleep(3000);
    	Job.click();
    	Thread.sleep(3000);
    	jobCategories.click();
    	Thread.sleep(3000);
    	AddCats.click();
    	Thread.sleep(3000);
    	CategoryName.sendKeys(categoryName);
    	Thread.sleep(3000);
    	saveCategory.click();
    	Thread.sleep(3000);
    }
    public void Workshifts() throws InterruptedException {
    	Thread.sleep(3000);
    	Job.click();
    	Thread.sleep(3000);
    	workShifts.click();
    	Thread.sleep(3000);
    	addShift.click();
    	Thread.sleep(3000);
    	shiftName.sendKeys("first shift1");
    	Thread.sleep(3000);
    	AssignedEmp.sendKeys("a");
    	Thread.sleep(3000);
    	robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		saveShifts.click();
		Thread.sleep(3000);
    }
    public void clickTrash() throws InterruptedException {
    	trashicon.click();
    	Thread.sleep(3000);	
    }
    public void YesDelete() {
    	delete.click();
    	//driver.switchTo().alert().accept();
    }
}
