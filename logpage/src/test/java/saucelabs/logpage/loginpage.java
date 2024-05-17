package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class loginpage {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.saucedemo.com/");
        d.manage().window().maximize(); 
        /*d.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        d.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(1000);
        d.close();
        /*
         * 
         */
        WebElement a = d.findElement(By.xpath("//*[@id='user-name']"));
        a.sendKeys("standard_user");
        Thread.sleep(1000);
        
        Actions act = new Actions(d);
        
        act.sendKeys(Keys.TAB).build().perform();
        WebElement b = d.findElement(By.xpath("//input[@type='password']"));
        b.sendKeys("secret_sauce");
        Thread.sleep(1000);
        act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
        
        
        
}
}