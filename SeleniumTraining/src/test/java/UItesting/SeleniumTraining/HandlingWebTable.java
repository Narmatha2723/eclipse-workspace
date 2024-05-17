package UItesting.SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
		int rowcount = rows.size();
//		List<WebElement> cols = driver.findElement(By.id("customers")).findElements(By.tagName("th"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/th"));
		int colcount = cols.size();
		System.out.println("total rows:" +rowcount);
		System.out.println("total coloumns:" +colcount);
		for(int i=2;i<=rowcount;i++) {
			for(int j=1;j<=colcount;j++) {
				String rowvalues = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Row:" +i+ "col: " +j+ "value: " +rowvalues);
			}

		}
		driver.quit();

	}

}
