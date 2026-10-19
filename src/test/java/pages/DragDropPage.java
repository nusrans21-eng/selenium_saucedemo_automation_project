package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {
	
	WebDriver driver;
	public DragDropPage(WebDriver driver) {
		this.driver=driver;
	}
	public void dragAndDrop() {
	WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement destination=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions action=new Actions(driver);
	action.dragAndDrop(source,destination).perform();

}

}
