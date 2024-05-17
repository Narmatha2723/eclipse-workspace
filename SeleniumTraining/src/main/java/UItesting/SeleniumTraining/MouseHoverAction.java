package UItesting.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		Actions ac = new Actions(driver);

		WebElement live= driver.findElement(By.xpath("//span[text()='Manual cross ']"));                                  
		ac.moveToElement(live).perform();

		Thread.sleep(3000);

		WebElement automate= driver.findElement(By.xpath("//h4[text()='Automate ']"));  
		
		ac.moveToElement(automate).click().perform();

		Thread.sleep(2000);

		//Thread.sleep(4000);

//		driver.quit();

	}

}
