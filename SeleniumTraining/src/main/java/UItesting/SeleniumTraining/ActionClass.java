package UItesting.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement a=driver.findElement(By.id(("draggable")));
		WebElement b=driver.findElement(By.id(("droppable")));
		act.dragAndDrop(a,b).build().perform();
		Thread.sleep(9000);
		System.out.println("success");
		driver.quit();

	}

}
