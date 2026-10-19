package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BasePage;
import pages.GUIElementsPage;
import utils.ConfigReader;

public class GUIElementsTest extends BasePage {
	
	@Test
	public void formpage() throws IOException {
		ConfigReader config=new ConfigReader();
		GUIElementsPage ff=new GUIElementsPage(driver);
		ff.Name(config.getProperty("name"));
		ff.email(config.getProperty("email"));
		ff.phone(config.getProperty("phone"));
		ff.address(config.getProperty("address"));
		ff.female();
		ff.day();
		ff.country();
	}

}
