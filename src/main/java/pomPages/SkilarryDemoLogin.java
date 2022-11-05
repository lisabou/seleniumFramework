package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilarryDemoLogin {
	@FindBy(id="course")
	private WebElement coursetab ;
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	@FindBy(name="addresstype")
	private WebElement courseadd;
	
	public WebElement getCourseadd() {
		return courseadd;
	}

	public SkilarryDemoLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
public void selenuimtrainingbtn() {
	seleniumtraining.click();
}
		

}
