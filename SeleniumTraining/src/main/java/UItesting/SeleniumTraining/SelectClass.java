package UItesting.SeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver d=new EdgeDriver();
        d.get("https://rahulshettyacademy.com/dropdownsPractise/" );
        d.manage().window().maximize();
        
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select curr = new Select(d.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        curr.selectByIndex(3);
        Thread.sleep(2000);
        System.out.println(curr.isMultiple());
        curr.selectByVisibleText("INR");
        d.findElement(By.id("divpaxinfo")).click();
        //d.findElement(By.id("divpaxOptions")).click();
       
        for(int i=0;i<=3;i++) {
        	d.findElement(By.id("hrefIncChd")).click();
        }
        Thread.sleep(2000);
        d.findElement(By.id("btnclosepaxoption")).click();
        d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        d.findElement(By.xpath("//a[contains(@value,'MAA')]")).click();
        Thread.sleep(2000);
        //d.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
        d.findElement(By.xpath("(//a[contains(@value,'BHO')])[2]")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[4]/td[7]/a")).click();
        d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        
        Thread.sleep(2000);
      
        d.quit();
        

	}

}
