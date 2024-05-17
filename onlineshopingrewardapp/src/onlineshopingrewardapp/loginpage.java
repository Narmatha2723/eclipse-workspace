package onlineshopingrewardapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginpage {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.saucedemo.com/" );
        d.manage().window().maximize(); 
        d.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        d.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        List<WebElement> name = d.findElement(By.tagName("input"));
    }
}
