package UItesting.SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderUI {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");	
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]")).click();
		List<WebElement> dates = driver.findElements(By.className("DayPicker-Day"));
		int count= dates.size();
		for(int i =0;i<count;i++)
		{
			String text = dates.get(i).getText();
		if(text.equalsIgnoreCase("23"))
		{
			dates.get(i).click();
			break;
		}
		}
	}

}
