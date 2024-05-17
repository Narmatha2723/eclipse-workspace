package exampleClasses;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class exampleclass2 {


	public class exampleclass1 {
		
		@BeforeClass
		public void method1() {
			System.out.println("class2 Before class");
		}
	    @BeforeMethod
		public void method2() {
			System.out.println("class2 Before method");
		}
		
		@Test
		public void login() {
		}
		@Test
		public void searching_product() {
			System.out.println("searching product");
		}
		@Test
		public void cart() {
			System.out.println("Add to cart");
		}
	
		@Test
		public void payment() {
			System.out.println("Mode of payment");
		}
		@AfterMethod
		public void method6() {
			System.out.println("class2 After method");
		}
		
		@AfterClass
		public void method5() {
			System.out.println("class2 After class");
		}
	
	}



}
