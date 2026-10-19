package tests;

import org.testng.annotations.Test;

import base.BasePage;
import pages.DragDropPage;

public class DragDropPageTest extends BasePage {
	
	@Test
	public void Drag() {
		DragDropPage dd=new DragDropPage(driver);
		dd.dragAndDrop();
	}

}
