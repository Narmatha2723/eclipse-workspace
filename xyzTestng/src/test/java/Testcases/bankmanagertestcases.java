package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseclassFiles.baseclass;
import Testpages.bankmanagertestpages;
import Util.ExcelXYZ;

public class bankmanagertestcases extends baseclass {
	bankmanagertestpages BMtestpage;
	ExcelXYZ excel = new ExcelXYZ();
	@BeforeSuite
	public void XYZurl() {
		launchURL();
	}
	@AfterSuite
	public void Quit_browser() {
	    quitBrowser();
	}
	@Test(priority = 0)
	public void AddCustomer() throws IOException {
		BMtestpage = new bankmanagertestpages(driver);
		BMtestpage.login();
		BMtestpage.addcustomerTile(excel.firstname(),excel.laststname(),excel.postcode());
		System.out.println(excel.postcode());
		BMtestpage.addcusBtn();
		int CustID = BMtestpage.validate_CusID_popup();
		excel.writeDataCusId(CustID);
	}
	@Test(priority = 1)
	public void openaccount() throws IOException {
		BMtestpage = new bankmanagertestpages(driver);
		BMtestpage.opeaAccTile();
		BMtestpage.cusDropdown(excel.firstname()+" "+excel.laststname());
		BMtestpage.currDropdown(excel.currency());
		BMtestpage.processBtn();
		int AccNo = BMtestpage.validateAlert_OA();
		excel.writeDataAccNo(AccNo);
	}
	@Test (priority = 2)
	public void Existingcustomer() throws IOException {
		BMtestpage = new bankmanagertestpages(driver);
		BMtestpage.customerTile();
		BMtestpage.searchCustomer(excel.firstname());
		Screenshot(".//screenshots//sc1.png");
	}

}
