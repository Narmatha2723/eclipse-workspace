package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class linkapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.google.com/");
        d.manage().window().maximize(); 
        //d.findElement(By.linkText("Gmail")).click();
        //Thread.sleep(1000);
        //d.findElement(By.linkText("Images")).click();
        //d.findElement(By.partialLinkText("Gma"));
        WebElement a = d.findElement(By.partialLinkText("Ima"));
        Thread.sleep(1000);
        System.out.println(a.getText());//giving proper word or complete word of webElement
        a.click();
        d.close();
}
}