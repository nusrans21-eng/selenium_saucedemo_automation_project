package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GUIElementsPage {
	
	WebDriver driver;
	public GUIElementsPage(WebDriver driver) {
		this.driver=driver;
	}
	 public void Name(String name) {
		 WebElement nameField=driver.findElement(By.id("name"));
		 nameField.sendKeys(name);
	 }
	 public void email(String email) {
		 WebElement emailField=driver.findElement(By.id("email"));
		 emailField.sendKeys(email);
	 }
	 public void phone(String phone) {
		 WebElement phoneField=driver.findElement(By.id("phone"));
		 phoneField.sendKeys(phone);
	 }
	 public void address(String address) {
		 WebElement addressField=driver.findElement(By.id("textarea"));
			addressField.sendKeys(address);
	 }
	 public void male() {
		 WebElement gender=driver.findElement(By.id("male"));
			gender.click();
	 }
	 public void female() {
		 WebElement gender=driver.findElement(By.id("female"));
			gender.click();
	 }
	 public void day() {
		 WebElement Day=driver.findElement(By.id("wednesday"));
			Day.click();
	 }
	 public void country() {
		 WebElement country=driver.findElement(By.id("country"));
			Select ctry=new Select(country);
			ctry.selectByVisibleText("India");
	 }
	 

}
