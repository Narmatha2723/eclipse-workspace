package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class selectapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.navigate().to("https://www.rediff.com/");
        d.manage().window().maximize();
        WebElement a = d.findElement(By.xpath("//*[@title='Create Rediffmail Account']"));
        a.click();
        Thread.sleep(2000);
        WebElement b = d.findElement(By.id("country"));
        Select s = new Select(b);
        boolean c = s.isMultiple();
        System.out.println(c);
        
        s.selectByIndex(0);
        Thread.sleep(2000);
        s.selectByValue("56");
        Thread.sleep(2000);
        s.selectByVisibleText("Germany");
        Thread.sleep(2000);
        
        d.close();
        
}
}