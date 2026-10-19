package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPage {
	
	public WebDriver driver;
	public MouseHoverPage(WebDriver driver) {
		this.driver=driver;
		}
	public void mousehover() {
		WebElement mHover=driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		Actions action=new Actions(driver);
		action.moveToElement(mHover).perform();
	}

}
