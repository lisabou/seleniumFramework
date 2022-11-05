package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkilarryDemoLogin;
import pomPages.SkillaryLoginPage;
import pomPages.Testingpage;

public class SecondSenarioExecution extends BaseClass {
	

	@Test
	public void sse() throws IOException, InterruptedException {
		SkillaryLoginPage s = new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillararydemoapp();
		driverutiles.switchtabs(driver);
		SkilarryDemoLogin sd = new SkilarryDemoLogin(driver);
		driverutiles.dropdown(sd.getCourseadd(), pdata.getdata("dropdownopt"));

		Testingpage tp = new Testingpage(driver);
		driverutiles.draganddrop(driver, tp.getSeleniumtraining(), tp.getCart());
		Thread.sleep(10000);
		Point loc = tp.getTwitter().getLocation();

		int x = loc.getX();
		int y = loc.getY();
		driverutiles.scrollBar(driver, x, y);
		tp.twitterlogo();

	}

}
