package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class javascript {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.saucedemo.com/");
        d.manage().window().maximize(); 
        
        JavascriptExecutor js = (JavascriptExecutor)d;
        Thread.sleep(1000);
        
        //js.executeScript("location.reload()");
        //Thread.sleep(1000);
        
        WebElement a = d.findElement(By.xpath("//*[@id=\"user-name\"]"));
        js.executeScript("arguments[0].click()",a);
        Thread.sleep(1000);
        
        js.executeScript("window.scrollBy(0,450)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(300,0)");
        
}
}