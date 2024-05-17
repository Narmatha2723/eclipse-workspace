package mainMethodClasses;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pomClasses.POMhomeBS;
import pomClasses.POMsigninBS;

public class BrowserStackPOM {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		POMhomeBS homePOM = new POMhomeBS(driver);
		homePOM.Getstart();
		
		POMsigninBS signinPOM = new POMsigninBS(driver);
		signinPOM.SigninLink();
		signinPOM.Signin("narmathae2000@gmail.com", "Browserstack@123");
		signinPOM.Signin();
		signinPOM.Confirm();
		

      
	}

}
