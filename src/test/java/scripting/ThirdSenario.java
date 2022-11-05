package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillaryLoginPage;
import pomPages.WishListPage;

public class ThirdSenario extends BaseClass {
	@Test
	public void ts() throws IOException, InterruptedException {
		SkillaryLoginPage sl = new SkillaryLoginPage(driver);
		sl.searchtextbox(pdata.getdata("coursename"));
		sl.searchbutton();
		CoreJavaPage cp= new CoreJavaPage(driver);
		cp.java();
		WishListPage wp= new WishListPage(driver);
		driverutiles.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(10000);
		wp.pausebutton();
		driverutiles.switchbackframe(driver);
		wp.addtowishlistbtn();
	}

}
