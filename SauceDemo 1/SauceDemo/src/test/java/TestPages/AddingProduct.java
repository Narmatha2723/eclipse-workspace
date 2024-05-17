package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingProduct extends GenericMethod {
	@FindBy(css="#item_3_title_link")
	WebElement selectLastProduct;
	
	
	public AddingProduct(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectProduct()
	{
		String product=selectLastProduct.getText();
		System.out.println(selectLastProduct.isDisplayed());
		Click(selectLastProduct);
		
		
		
		
		System.out.println(product);
	}
}
