package pfClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PFnegativecaes {
	@FindBy(id = "user-name") WebElement uname;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "login-button") WebElement logbtn;
	
	public void USERNAME(String Uname) {
		uname.sendKeys(Uname);
		
	}
	public void PASSWORD(String Password) {
		password.sendKeys(Password);
	}
	public void Login() {
		logbtn.click();
	}

}
