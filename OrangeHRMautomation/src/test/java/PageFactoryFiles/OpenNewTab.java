package PageFactoryFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {
	public static void main(String[] args) throws InterruptedException {
        
        // Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		String url="https://www.browserstack.com/";
		driver.navigate().to(url);
    }

}
