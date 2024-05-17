package exampleClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class exampleclass1 {
	
	@BeforeSuite
	public void method1() {
		System.out.println("Before suit");
	}
	@BeforeClass
	public void method2() {
		System.out.println("Before class");
	}
    @BeforeMethod
	public void method3() {
		System.out.println("Before method");
	}
	@BeforeTest
	public void method4() {
		System.out.println("Before test");
	}
	@Test
	public void login() {
		System.out.println("Authenticate employee");
	}
	@Test
	public void emp_jobDetails() {
		System.out.println("Job description");
	}
	@Test
	public void emp_performance() {
		System.out.println("employee performance calculation");
	}
	@Test
	public void  emp_timesheet() {
		System.out.println("timesheet activity");
	}
	@AfterTest
	public void method6() {
		System.out.println("After test");
	}
	@AfterMethod
	public void method7() {
		System.out.println("After method");
	}
	@AfterClass
	public void method8() {
		System.out.println("After class");
	}
	@AfterSuite
	public void method9() {
		System.out.println("After suit");
	}
}

