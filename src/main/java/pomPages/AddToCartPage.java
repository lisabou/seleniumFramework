package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	@FindBy(id="add")
	private WebElement plus ;
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-flat']")
	private WebElement addtocart;
	
	public AddToCartPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
		
	}

	public WebElement getPlus() {
		return plus;
	}
	public void cartbutton() {
		addtocart.click();
	}

}
