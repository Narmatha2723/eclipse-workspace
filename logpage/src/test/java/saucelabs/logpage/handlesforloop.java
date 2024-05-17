package saucelabs.logpage;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class handlesforloop {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.salesforce.com/in/?ir=1");
        d.manage().window().maximize(); 
        
        String parenthandle = d.getWindowHandle();
        System.out.println("Parent Window - "+parenthandle);
        
        d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a"));
        
        //getWindowHandles
        
        Set<String> handles = d.getWindowHandles();
        
        for(String handle: handles) { //5 tab 1 2
        	System.out.println(handle);
        }
        Thread.sleep(1000);
        
	}
}