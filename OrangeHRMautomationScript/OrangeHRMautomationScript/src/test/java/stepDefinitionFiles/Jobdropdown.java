package stepDefinitionFiles;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import PageFactoryFiles.JobdropdownPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Jobdropdown {
	
	WebDriver driver;
	JobdropdownPF JPF;
	
	@Given("Get login to OrangeHRM in edge browser")
	public void get_login_to_orange_hrm_in_edge_browser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		JPF = new JobdropdownPF(driver);
		Thread.sleep(2000);
		JPF.Login("Admin","admin123");
        Thread.sleep(2000);
        JPF.dashboard();
	}

	@When("user get navigate to Admin tile")
	public void user_get_navigate_to_admin_tile() throws InterruptedException {
		JPF.AdminTile();
	}

	@When("click job dropdown and select job titles")
	public void click_job_dropdown_and_select_job_titles() throws InterruptedException {
		JPF.Jobdd();
	}

	@When("click +Add button")
	public void click_add_button() {
	    JPF.addBtn();
	}

	@When("click and enter values in text fields at add job titles page")
	public void click_and_enter_values_in_text_fields_at_add_job_titles_page() throws InterruptedException {
	    JPF.jobDetails();
	}

	@When("Click on Browse button under Job Specification and Select file from system Click on Open\\/apply")
	public void click_on_browse_button_under_job_specification_and_select_file_from_system_click_on_open_apply() throws InterruptedException, AWTException {
	    JPF.browseFile();
	}

	@When("click save button")
	public void click_save_button() throws InterruptedException {
	    JPF.saveJob();
	}

	@When("Navigate back to job dropdown and select Pay Grades")
	public void navigate_back_to_job_dropdown_and_select_pay_grades() throws InterruptedException {
	   JPF.PayGrades();
	   JPF.paygradeName("Grade12");
	}

	@When("click Navigate back to job dropdown and select Employement status")
	public void click_navigate_back_to_job_dropdown_and_select_employement_status() throws InterruptedException {
	    JPF.EmpStatus("fullTime12");
	}

	@When("Navigate back to job dropdown and select Job categories")
	public void navigate_back_to_job_dropdown_and_select_job_categories() throws InterruptedException {
	   JPF.jobCategories("Technicians12");
	}

	@When("Navigate back to job dropdown and select Work Shifts")
	public void navigate_back_to_job_dropdown_and_select_work_shifts() throws InterruptedException {
		JPF.Workshifts();
	}

	@When("check new work shift added is visible under Records found")
	public void check_new_work_shift_added_is_visible_under_records_found() throws InterruptedException {
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.xpath("//div[text()='first shift']"));
		String ExpectedText = "first shift";
		Assert.assertEquals(ExpectedText, title.getText());
		System.out.println("added workshift is visible under records found");
		Thread.sleep(3000);
	}

	@When("Click on Delete icon")
	public void click_on_delete_icon() throws InterruptedException {
		JPF.clickTrash();
	}

	@Then("Click on Yes Delete button on pop-up window")
	public void click_on_yes_delete_button_on_pop_up_window() {
	    JPF.YesDelete();
	    driver.quit();
	}


}
