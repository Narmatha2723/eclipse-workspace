package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigationmethods {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.navigate().to("https://www.google.com/");
        d.manage().window().maximize();
        d.findElement(By.linkText("Images")).click();
        Thread.sleep(3000);
        
        d.navigate().back();
        Thread.sleep(3000);
        
        d.navigate().forward();
        Thread.sleep(3000);
        
        d.navigate().refresh();
        Thread.sleep(3000);
        
        d.close();
}
}