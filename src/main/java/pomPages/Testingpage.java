package pomPages;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	@FindBy(xpath="(//a[text()='Selenium Training'])[3]")
	private WebElement seleniumtraining;
	
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getTwitter() {
		return twitter;
	}
	@FindBy(id="cartArea")
	
	private WebElement cart;
	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter;
	
	public Testingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void twitterlogo() {
		twitter.click();
	}

}
