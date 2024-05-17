package UItesting.SeleniumTraining;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WindowHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("windowButton")).click();
		String parent=driver.getWindowHandle();
		System.out.println("parent id:"+parent);
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String childid=it.next();
			if(!parent.equalsIgnoreCase(childid)) {

				driver.switchTo().window(childid);
				System.out.println("child id:"+childid);
				TakesScreenshot S=(TakesScreenshot)driver;
				File Src=S.getScreenshotAs(OutputType.FILE);
				File dst=new File("./screenshotssel/scr1.png");
				FileUtils.copyFile(Src,dst);

				driver.quit();
				Thread.sleep(3000);
			}
		}
		//driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
