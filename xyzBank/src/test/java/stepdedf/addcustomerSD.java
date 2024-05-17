package stepdedf;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.addcustomerPF;

public class addcustomerSD {
	WebDriver driver;
	addcustomerPF addcus;
	@Given("enter xyz bank url in browser")
	public void enter_xyz_bank_url_in_browser() {
		driver = new ChromeDriver();
		addcus = new addcustomerPF(driver);
		addcus.precondition();
	}

	@When("click on Bank Manager Login button")
	public void click_on_bank_manager_login_button() {
	    addcus.login();
	}

	@When("user gives customer details")
	public void user_gives_customer_details() throws IOException {
		addcus.AddcustomerDetails();
	}

	@When("Click on Add Customer button")
	public void click_on_add_customer_button() {
		addcus.AddCustBtn();
	}

	@When("validate popup and click ok")
	public void validate_popup_and_click_ok() throws IOException {
		addcus.validatealert();
	}

	@When("go to  Open Account tile")
	public void go_to_open_account_tile() {
		addcus.opeaAccTile();
	}

	@When("Click on Customer Name dropdown and select newly added customer")
	public void click_on_customer_name_dropdown_and_select_newly_added_customer() {
	    addcus.custDropdown();
	}

	@When("click currency dropdwon and add currency")
	public void click_currency_dropdwon_and_add_currency() {
	    addcus.currencyDropown();
	}

	@When("click Process button")
	public void click_process_button() {
		addcus.processBtn();
	}

	@When("Validate that pop-up is displayed with successful message")
	public void validate_that_pop_up_is_displayed_with_successful_message() throws IOException {
	    addcus.validateAlert_OA();
	}

	@When("Go to Customers tile")
	public void go_to_customers_tile() {
		addcus.customerTile();
	}

	@When("Search customer based on newly created account number")
	public void search_customer_based_on_newly_created_account_number() throws IOException {
		addcus.searchCustomer();
	}

	@Then("take screenshot and validate")
	public void take_screenshot_and_validate() throws IOException {
		addcus.Screenshot();
	}

}
