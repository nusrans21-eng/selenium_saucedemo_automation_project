package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPage {
	
	public WebDriver driver;
	public DoubleClickPage(WebDriver driver) {
		this.driver=driver;
		}
	public void doubleClick() {
		WebElement doubleClick=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleClick).perform();
	
	}

}
