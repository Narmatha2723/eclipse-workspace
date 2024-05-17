package UItesting.SeleniumTraining;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com" );
        driver.manage().window().maximize();
		
		
		    WebElement logo = driver.findElement(By.className("login_logo"));
	        
		    // Get screenshot of the visible part of the web page
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        
	        // Convert the screenshot into BufferedImage
	        BufferedImage fullScreen = ImageIO.read(screenshot);
	        
	        
	        //Find location of the webelement logo on the page
	        Point location = logo.getLocation();
	        
	        
	        //Find width and height of the located element logo
	        int width = logo.getSize().getWidth();
	        int height = logo.getSize().getHeight();

		   
	        //cropping the full image to get only the logo screenshot
	        BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),
	                width, height);
	        ImageIO.write(logoImage, "png", screenshot);
	        
	        
	        //Save cropped Image at destination location physically.
	        FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots1\\logoScreenshot2.pdf"));

	        driver.quit();
	    }



	}


