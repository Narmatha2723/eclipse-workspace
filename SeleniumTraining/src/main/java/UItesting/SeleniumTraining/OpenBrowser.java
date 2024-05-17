package UItesting.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver d=new EdgeDriver();
        d.get("https://nxtgenaiacademy.com/demo-site/" );
        d.manage().window().maximize();
        d.findElement(By.name("vfb-5")).sendKeys("Narmatha");
        d.findElement(By.id("vfb-7")).sendKeys("Eswaran");
        d.findElement(By.id("vfb-31-2")).click();
        d.findElement(By.cssSelector("input[Name='vfb-13[address-2]']")).sendKeys("abc street,Chennai");
        d.close();
        
        //d.quit();

	}

}
