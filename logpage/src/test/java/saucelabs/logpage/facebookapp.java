package saucelabs.logpage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class facebookapp {
	public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.navigate().to("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D60456322738%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiAhqCdBhB0EiwAH8M_GmqGibOTSrG2qJOe4JL45QEa7_Z6irs5tu55JKFmEe-9gxcnv9FnfRoCcqgQAvD_BwE%26hvadid%3D486393568006%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007809%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D13020463462030047639%26hvtargid%3Dkwd-295905178780%26hydadcr%3D14451_2154369%26ref%3Dpd_sl_1jyasdi57f_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        d.manage().window().maximize();
        
        System.out.println("the current url is:" +d.getCurrentUrl());
        
        String title = d.getTitle();
        System.out.println("the title is:" +title);
        
        WebElement a = d.findElement(By.xpath("//*[@placeholder=\"First and last name\"]"));
        a.sendKeys("Narmatha E");
        Thread.sleep(2000);
        
        System.out.println(a.getAttribute("class"));
        System.out.println(a.getTagName());
        
        
        WebElement b = d.findElement(By.xpath("//*[@class=\"a-input-text a-span12 a-spacing-micro auth-required-field auth-require-phone-validation\"]"));
        b.sendKeys("1234567890");
        Thread.sleep(2000);
        
        
        WebElement c = d.findElement(By.xpath("//*[@id=\"ap_password\"]"));
        c.sendKeys("narmatha_e");
        Thread.sleep(2000);
        
        Actions act = new Actions(d);
        act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
        
        d.navigate().forward();
        Thread.sleep(3000);
        d.navigate().refresh();
        Thread.sleep(3000);
        
        //d.close();
}
}