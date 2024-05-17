package PageFactoryFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/geography/alphabetical-list-of-countries/#google_vignette");
		WebElement element = driver.findElement(By.xpath("//table[@class='table table-hover table-condensed']/tbody/tr[5]/td[2]"));
		String attribute = element.getText();
		System.out.println(attribute);
		WebElement element1 = driver.findElement(By.xpath("//table[@class='table table-hover table-condensed']/tbody/tr[5]"));
		String row = element1.getText();
		System.out.println(row);
		List<WebElement> listeles = driver.findElements(By.xpath("//table[@class='table table-hover table-condensed']/tbody/tr/td[2]"));
		WebElement list = (WebElement) listeles;
		int listSize = listeles.size();
		for(WebElement list1:listeles) {
			System.out.println(list1.getText());
		}
		for(int i=0;i<5;i++) {
			System.out.println(list.getText());
		}
		driver.quit();

	}

}
