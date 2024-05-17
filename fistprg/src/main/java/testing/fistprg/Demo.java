package testing.fistprg;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	public static void main(String args[]) {
		System.setProperty("webdriver.edge.driver", "‪C:\\Users\\NARMAE\\eclipse-workspace\\fistprg\\driver\\msedgedriver.exe");
        WebDriver d=new EdgeDriver();
        d.get("https://www.google.com" );
        
	}

}
