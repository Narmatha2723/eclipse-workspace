package UItesting.SeleniumTraining;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingLoginPopup {
	public static void main(String args[]) throws AWTException {
	
   WebDriver driver=new EdgeDriver();
   driver.navigate().to(" https://the-internet.herokuapp.com/");
   driver.manage().window().maximize();	
   driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
	Robot robot = new Robot();
	StringSelection username = new StringSelection("admin");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_V);
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_TAB);
//	StringSelection password = new StringSelection("admin");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_V);
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);

}
}