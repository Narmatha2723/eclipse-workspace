package stepDefinitionFiles;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.TimesheetPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimesheetSD {
	
	WebDriver driver;
	TimesheetPF TPF;
	
	@Given("login in OrangeHRM with valid credentials")
	public void login_in_orange_hrm_with_valid_credentials() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		TPF = new TimesheetPF(driver);
		Thread.sleep(2000);
		TPF.Login("Admin","admin123");
        Thread.sleep(2000);
	}

	@When("click login button and  get redirect to the dashboard")
	public void click_login_button_and_get_redirect_to_the_dashboard() throws InterruptedException {
		TPF.dashboard();
	}

	@When("navigate to Time tile and click on Timesheets")
	public void navigate_to_time_tile_and_click_on_timesheets() throws InterruptedException {
		TPF.timeTile();
	}

	@When("Enter Paul Collings in emplyee name and click on View button")
	public void enter_paul_collings_in_emplyee_name_and_click_on_view_button() throws InterruptedException, AWTException {
	    TPF.veiwEmployee("Paul Collings");
	}

	@When("click edit button")
	public void click_edit_button() throws InterruptedException {
	    TPF.clickEdit();
	}

	@When("Enter Apache Software Foundation ASF Phase text in Project text field")
	public void enter_apache_software_foundation_asf_phase_text_in_project_text_field() throws InterruptedException, AWTException {
	    TPF.Projectdetails();
	}

	@When("Click on Activity dropdown and select Implementation")
	public void click_on_activity_dropdown_and_select_implementation() throws InterruptedException {
	    TPF.Activitydrop();
	}

	@When("Enter text in all the date text fields")
	public void enter_text_in_all_the_date_text_fields() throws InterruptedException {
	    TPF.dates();
	}

	@Then("Click on Save button")
	public void click_on_save_button() throws InterruptedException {
		TPF.Save();
		driver.quit();
	    
	}

}
