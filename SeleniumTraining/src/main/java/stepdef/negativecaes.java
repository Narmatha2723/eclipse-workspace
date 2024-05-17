package stepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pfClasses.PFnegativecaes;

public class negativecaes {
	 
	WebDriver driver = new EdgeDriver();
	PFnegativecaes NG;
	
		@Given("navigate into saucelab webpage")
		public void navigate_into_saucelab_webpage() {
			NG = new PFnegativecaes();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		    
		}

		@When("user gives standard_user")
		public void uname1(String username1) {
		   NG.USERNAME(username1);
		}

		@When("user gives secret_sauce")
		public void password1(String password1) {
			NG.PASSWORD(password1);
		}

		@Then("user should click login button")
		public void login_button() {
			NG.Login();
		}

		@When("user gives standard_user1")
		public void uname2(String username2) {
			 NG.USERNAME(username2);
		}

		@When("user gives secret_sauce1")
		public void password2(String password1) {
			 NG.USERNAME(password1);
		}

		@When("user gives ")
		public void user_gives() {
			NG.Login();
		}

	}


