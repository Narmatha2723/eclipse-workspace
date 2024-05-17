package stepDefinitionFiles;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.PIM_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIM_SD {
	
	WebDriver driver;
	PIM_PF PPF;
	
	@Given("login to OrangeHRM in edge browser")
	public void login_to_orange_hrm_in_edge_browser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PPF = new PIM_PF(driver);
		Thread.sleep(2000);
		PPF.Login("Admin","admin123");
        Thread.sleep(2000);
        PPF.dashboard();
        Thread.sleep(2000);
	}

	@When("user navigate to PIM tile")
	public void user_navigate_to_pim_tile() {
	   PPF.pimLink();
	}

	@When("click on Employee List")
	public void click_on_employee_list() {
	    PPF.empList();
	}

	@When("click on +Add button and enter values in text fields")
	public void click_on_add_button_and_enter_values_in_text_fields() {
	    PPF.EmpDetails("Ani","tha","Ratha");
	}

	@When("Under Personal Information click on Nick name text field Enter text")
	public void under_personal_information_click_on_nick_name_text_field_enter_text() {
		PPF.personelDetails("aniChick");
	}

	@When("Click on Nationality dropdown button Select value as Japanese")
	public void click_on_nationality_dropdown_button_select_value_as_japanese() throws InterruptedException {
	    PPF.nationality();
	}

	@When("Click on Marital Status dropdown select value as Single")
	public void click_on_marital_status_dropdown_select_value_as_single() throws AWTException {
	    PPF.marital();
	}

	@When("Click on Date of Birth date")
	public void click_on_date_of_birth() {
	    PPF.dob("2023-12-12");
	}

	@When("Click on Female radio button Click on Save button")
	public void click_on_female_radio_button_click_on_save_button() {
		PPF.gender();
	}

	@When("Navigate and click on Employee List tile and enter emplyee name to search user")
	public void navigate_and_click_on_employee_list_tile_and_enter_emplyee_name_to_search_user() throws IOException, InterruptedException {
		PPF.searchEmp("Ani");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  500 pixel vertical
		js.executeScript("window.scrollBy(0,500)");
	
		TakesScreenshot sc=(TakesScreenshot)driver;
		File Src=sc.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshots/scr4.png");
		FileUtils.copyFile(Src,dst);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
	}

	@When("Click on Reset button")
	public void click_on_reset_button() throws InterruptedException {
		PPF.clickReset();
	}

	@When("Under Recods found click on 2nd check box")
	public void under_recods_found_click_on_2nd_check_box() {
	    PPF.checkBx();
	}

	@When("Clcik on Delete Selected button")
	public void clcik_on_delete_selected_button() {
		   PPF.deleteSelected();
	   	}

	@When("Click on No,Cancel button")
	public void click_on_no_cancel_button() throws InterruptedException {
		PPF.noCancel();
		
	}

	@Then("Clcik on Reset button")
	public void clcik_on_reset_button() throws InterruptedException {
		PPF.clickReset();
		driver.quit();
	}

}
