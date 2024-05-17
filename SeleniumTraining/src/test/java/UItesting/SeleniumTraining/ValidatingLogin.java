package UItesting.SeleniumTraining;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement element = driver.findElement(By.xpath("//div[@class='app_logo']"));
		String ExpectedText = element.getText();
		String actualText = "Swag Labs";
		Map<String,String> UP = new  HashMap<String,String>();
		  UP.put("standard_user", "secret_sauce");
		  UP.put("standard_user1", "secret_sauce");
		  UP.put("standard_user", "secret_sauce1");
		  UP.put("", "");
		  for(Entry <String,String> en:UP.entrySet()) {
			  driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
		  }
		
		

	}

}
