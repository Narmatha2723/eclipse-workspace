package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class amazonapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.navigate().to("https://www.amazon.in/");
        d.manage().window().maximize();
        WebElement a = d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        a.click();
        a.sendKeys("phone");
        Thread.sleep(2000);
        WebElement b = d.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        b.click();
        Thread.sleep(2000);
        ////*[@class='a-size-medium a-color-base a-text-normal']
        
        WebElement c = d.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
        c.click();
        Thread.sleep(2000);
        d.close();
}
}