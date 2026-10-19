package tests;

import org.testng.annotations.Test;

import base.BasePage;
import pages.MouseHoverPage;

public class MouseHoverPageTest  extends BasePage {
	
	@Test
	public void mouse()  throws InterruptedException {
		MouseHoverPage mm=new MouseHoverPage(driver);
		mm.mousehover();
	}


}
