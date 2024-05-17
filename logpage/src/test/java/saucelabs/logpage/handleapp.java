package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class handleapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.saucedemo.com/");
        d.manage().window().maximize(); 
        
        //getWnidowHandle()
        
        String parenthandle=d.getWindowHandle();
        System.out.println("window :"  +parenthandle);
        Thread.sleep(1000);
        
        //newwindow type-TAB
        
		d.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		
		WebElement a = d.findElement(By.xpath("//*[@id='user-name']"));
        a.sendKeys("standard_user");
        
        //newWindow type-WINDOW
        d.switchTo().newWindow(WindowType.WINDOW);
		
        
	}
	
	}
