package mainMethodClasses;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pfClasses.PFhomeBS;
import pfClasses.PFsigninBS;

public class BrowserStackPF {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		PFhomeBS homePF = new PFhomeBS(driver);
		homePF.Getstart();
		
		PFsigninBS signinPF = new PFsigninBS(driver);
		signinPF.SigninLink();
		signinPF.Signin("narmathae2000@gmail.com", "Browserstack@123");
		signinPF.Signin();
		signinPF.Confirm();

	}

}
