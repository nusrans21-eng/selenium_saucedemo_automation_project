package tests;

import org.testng.annotations.Test;

import base.BasePage;
import pages.LinkLabelsPage;

public  class LinkLabelsTest extends BasePage {
	@Test
	public void broken() throws Exception {
	LinkLabelsPage bb=new LinkLabelsPage(driver);
	bb.brokenlink();
}
	

}
