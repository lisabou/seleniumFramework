package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void playbutton() throws InterruptedException {
		Thread.sleep(10000);
		playbtn.click();
	}
	public void pausebutton() {
		pausebtn.click();
	
	}
	public void addtowishlistbtn() throws InterruptedException {
		Thread.sleep(10000);
		wishlist.click();
	}
}
