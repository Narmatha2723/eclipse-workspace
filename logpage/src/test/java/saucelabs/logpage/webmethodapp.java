package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class webmethodapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.navigate().to("https://www.saucedemo.com/");
        d.manage().window().maximize();
        
        //String current = d.getCurrentUrl();
        System.out.println("the current url is:" +d.getCurrentUrl());
        
        String title = d.getTitle();
        System.out.println("the title is:" +title);
        
        WebElement a = d.findElement(By.id("user-name"));
        System.out.println(a.getAttribute("class"));
        System.out.println(a.getTagName());
        
        try
        {
        	WebElement b = d.findElement(By.id("login-button"));
        	String logcolor = b.getCssValue("color");
        	System.out.println(logcolor);
        }
        finally {
        d.close();
}
}}