package tests;

import org.testng.annotations.Test;

import base.BasePage;
import pages.NewTabPage;

public class NewTabPageTest extends BasePage {
	@Test
	public void frames() throws InterruptedException {
		NewTabPage ff=new NewTabPage(driver);
		ff.newTab();
		ff.childAction();
		
	
	}

}

