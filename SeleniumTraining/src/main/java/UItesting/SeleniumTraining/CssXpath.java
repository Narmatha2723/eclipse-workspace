package UItesting.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CssXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver d=new EdgeDriver();
        d.get("https://nxtgenaiacademy.com/demo-site/" );
        d.manage().window().maximize();
        d.findElement(By.cssSelector("input#vfb-5")).sendKeys("Narmatha");
        d.findElement(By.cssSelector("input#vfb-7")).sendKeys("Photography");
        d.findElement(By.cssSelector("input[value='Female']")).click();
        d.findElement(By.cssSelector("input[id*='vfb-13-address']")).sendKeys("1/166A");
        d.findElement(By.cssSelector("input[name*='vfb-13[address-2]']")).sendKeys("Abc street");
        d.findElement(By.cssSelector("input#vfb-13-city")).sendKeys("Chennai");
        d.findElement(By.cssSelector("input[name*='vfb-13[zip]']")).sendKeys("600002");
        d.findElement(By.xpath("//*[@id=\"item-vfb-13\"]/div/span[6]/span/span[1]/span/span[2]/b")).click();
        d.findElement(By.id("select2-vfb-13-country-result-q9cl-Argentina")).click();
	    //d.findElement(By.xpath("//span[contains(@class, 'select2-selection__arrow')]")).click();
	  
	    //d.findElement(By.xpath("//li[text()='India']")).click();
        WebElement dropdownArrow = d.findElement(By.xpath("//span[contains(@class, 'select2-selection__arrow')]"));
		dropdownArrow.click();
	    Thread.sleep(1000);
        d.findElement(By.xpath("//input[@type='email']")).sendKeys("asdfg@gmail.com");
        d.findElement(By.xpath("//input[contains(@data-dp-dateformat,'mm/dd/yy')]")).click();
        d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
        d.findElement(By.xpath("//*[@data-date=\"7\"]")).click();
        
        Thread.sleep(1000);
        d.close();

}
}