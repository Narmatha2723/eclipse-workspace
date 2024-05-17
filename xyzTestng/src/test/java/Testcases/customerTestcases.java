package Testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import BaseclassFiles.baseclass;
import Testpages.cusTestpage;
import Util.ExcelXYZ;
import Util.genricXYZ;


public class customerTestcases extends baseclass {
	
	
	ExcelXYZ excel = new ExcelXYZ();
	cusTestpage custestpage;
	genricXYZ gen = new genricXYZ(driver);
	@Test(priority = 3)
	public void CusLogin() throws IOException {
		cusTestpage	custestpage = new cusTestpage(driver);
		custestpage.CustomerLogin();
		custestpage.CusDropdown(excel.firstname()+" "+excel.laststname());
		custestpage.loginbtn();
	}
	@Test(priority = 4)
	public void deposit() throws IOException {
		custestpage = new cusTestpage(driver);
		int pre_balance = Integer.parseInt(custestpage.Balance());
		System.out.println("previous balance:" +pre_balance );
		int DepositeAmt = Integer.parseInt(excel.depositAmount());
		custestpage.DepositeTile(excel.depositAmount());
		System.out.println("deposit amount:" +DepositeAmt);
		int Aft_balance = Integer.parseInt(custestpage.Balance());
		System.out.println("after balance:" +Aft_balance);
		int current_balance = pre_balance+DepositeAmt;
		System.out.println("current balance:" +current_balance);
		gen.validate_balance(Aft_balance, current_balance);
		
	}
	@Test(priority = 5)
	public void withdrawl() throws IOException, InterruptedException {
		custestpage = new cusTestpage(driver);
		int current_balance = Integer.parseInt(custestpage.Balance());
		custestpage.withdrawlTile(excel.withdrawlAmount());
		Thread.sleep(5000);
		int withdraw_amt = Integer.parseInt(excel.withdrawlAmount());
		System.out.println("Withdraw amount:" +withdraw_amt);
		int after_withdraw = Integer.parseInt(custestpage.Balance());
		System.out.println("Balance after withdraw :" +after_withdraw);
		int curBal_aftWithdraw = current_balance - withdraw_amt;
		gen.validate_balance(after_withdraw, curBal_aftWithdraw);
		System.out.println("Amount withdrawn successfully");
		custestpage.TransactionTile();
		Thread.sleep(5000);
		Screenshot(".//screenshots//sc2.png");
		
	}

}
