package saucelabs.logpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class first {
	
	
		public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	        WebDriver d=new ChromeDriver();
	        d.get("https://www.wpexplorer.com/ninja-demo-overview/" );
	    }
	

}
