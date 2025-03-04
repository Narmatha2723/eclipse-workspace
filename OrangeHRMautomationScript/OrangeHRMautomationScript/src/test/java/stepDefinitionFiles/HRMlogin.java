package stepDefinitionFiles;
import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.HRMloginPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMlogin {
	    
	WebDriver driver;
	HRMloginPF log;
	

		@Given("login with valid credentials to OrangeHRM in edge browser")
		public void login_with_valid_credentials_to_orange_hrm_in_edge_browser() throws InterruptedException {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	        driver=new EdgeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			log = new HRMloginPF(driver);
			Thread.sleep(2000);
			log.Login("Admin","admin123");
            Thread.sleep(2000);
			
			
		}

		@When("click login button and navigate to the dashboard")
		public void click_login_button_and_navigate_to_the_dashboard() throws InterruptedException {
		    log.dashboard();

		}

		@When("navigate to Admin tile and add a new user")
		public void navigate_to_admin_tile_and_add_a_new_user() throws AWTException, InterruptedException {
			log.Admin();
		}

		@When("Enter username in username field to search created user")
		public void enter_username_in_username_field_to_search_created_user() throws InterruptedException {
			log.Addeduser("abcdefgh");
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// This  will scroll down the page by  500 pixel vertical
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		    
		}

		@Then("navigate to user profile and get logout")
		public void navigate_to_user_profile_and_get_logout() throws InterruptedException {
		    log.Logout();
		    Thread.sleep(2000);
		    driver.quit();
		}

	

}
