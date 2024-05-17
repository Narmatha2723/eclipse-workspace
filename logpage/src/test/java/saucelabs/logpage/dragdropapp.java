package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class dragdropapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.navigate().to("https://jqueryui.com/droppable/");
        d.manage().window().maximize();
        
        d.findElement(By.tagName("iframe"));
        d.switchTo().frame(0);
        Thread.sleep(1000);
        
        WebElement src = d.findElement(By.id("draggable"));
        WebElement dst = d.findElement(By.id("droppable"));
        
        Actions act = new Actions(d);
        
        act.dragAndDrop(src, dst).perform();
        System.out.println(src.getText());
        
        if(dst.getText().matches("Dropped!")) {
        	System.out.println("successful");
        }
        d.close();
        
}
}