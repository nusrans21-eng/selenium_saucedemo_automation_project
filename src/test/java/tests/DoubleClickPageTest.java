package tests;

import org.testng.annotations.Test;

import base.BasePage;
import pages.DoubleClickPage;

public class DoubleClickPageTest extends BasePage {
	
	@Test
	public void click() {
		DoubleClickPage dd=new DoubleClickPage(driver);
		dd.doubleClick();
		
	}

}
