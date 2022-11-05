package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkilarryDemoLogin;
import pomPages.SkillaryLoginPage;

public class Execution extends BaseClass{
	@Test
	public void exe() {
		SkillaryLoginPage s = new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillararydemoapp();

		driverutiles.switchtabs(driver);
		SkilarryDemoLogin sd = new SkilarryDemoLogin(driver);
		driverutiles.mouseHover(driver, sd.getCoursetab());
		sd.selenuimtrainingbtn();
		AddToCartPage ad = new AddToCartPage(driver);
		driverutiles.doubleclick(driver, ad.getPlus());
		ad.cartbutton();
		driverutiles.alertpopup(driver);

	}

}
