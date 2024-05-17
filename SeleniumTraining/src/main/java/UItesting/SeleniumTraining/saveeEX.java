package UItesting.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class saveeEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.findElement(By.id("inputUsername")).sendKeys("savee");
		  driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		  WebElement e=driver.findElement(By.className("signInBtn"));
		  e.click();
		  //Thread.sleep(2000);
		  System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("savee");
		  driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abc@gmail.com");
		  driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("6574327092");


	}

}
