package stepDefinitionFiles;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.LeavePf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveSD {
	
	WebDriver driver;
	LeavePf LPF;
	@Given("do login in OrangeHRM with in edge browser")
	public void do_login_in_orange_hrm_with_in_edge_browser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		LPF = new LeavePf(driver);
		Thread.sleep(2000);
		LPF.Login("Admin","admin123");
        Thread.sleep(2000);
	}

	@When("click on login button and  get navigate to the dashboard")
	public void click_on_login_button_and_get_navigate_to_the_dashboard() throws InterruptedException {
		LPF.dashboard();
	    
	}

	@When("navigate to Leave tile and click on Assign leave")
	public void navigate_to_leave_tile_and_click_on_assign_leave() throws InterruptedException {
	    LPF.AssignLeave();
	}

	@When("Enter inputs in text fields click Assign button")
	public void enter_inputs_in_text_fields_click_assign_button() throws InterruptedException, AWTException {
	    LPF.leaveDetails();
	}

	@Then("Click on Ok button on pop-up")
	public void click_on_ok_button_on_pop_up() throws InterruptedException {
	    LPF.popUp();
	    driver.quit();
	}

}
