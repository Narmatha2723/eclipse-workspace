package saucelabs.logpage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class rediffmailapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.navigate().to("https://www.rediff.com/");
        d.manage().window().maximize();
        Actions act=new Actions(d);
        WebElement a = d.findElement(By.xpath("//*[@title='Create Rediffmail Account']"));
        act.moveToElement(a).contextClick().build().perform();
        //act.doubleClick(a).build().perform();
        //act.moveToElement(a).doubleClick().build().perform();
       // WebElement a = d.findElement(By.xpath("//*[@title='Create Rediffmail Account']"));
        //a.click();
        Thread.sleep(2000);
        ////*[@type='checkbox']
        WebElement b = d.findElement(By.xpath("//*[@type='checkbox']"));
        b.click();
        Thread.sleep(2000);
        ////*[@value='f']
        WebElement c = d.findElement(By.xpath("//*[@value='f']"));
        c.click();
        Thread.sleep(2000);
        d.close();
        
}
}