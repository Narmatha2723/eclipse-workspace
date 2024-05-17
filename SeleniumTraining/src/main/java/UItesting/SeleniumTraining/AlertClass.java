package UItesting.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver d=new EdgeDriver();
        d.get("https://nxtgenaiacademy.com/alertandpopup/" );
        d.manage().window().maximize();
        
        d.findElement(By.xpath("//button[@name='alertbox']")).click();
        Thread.sleep(2000);
        d.switchTo().alert().accept();
        
        d.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
        Thread.sleep(2000);
        d.switchTo().alert().dismiss();
        System.out.println(d.findElement(By.xpath("//*[@id='demo']")).getText());
       
        d.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
        Thread.sleep(2000);
        d.switchTo().alert().sendKeys("yes");
        
        d.switchTo().alert().accept();
//        d.quit();

	}

}
