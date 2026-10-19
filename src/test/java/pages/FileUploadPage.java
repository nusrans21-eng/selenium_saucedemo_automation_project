package pages;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ConfigReader;

public class FileUploadPage {
	
	public WebDriver driver;
	public FileUploadPage(WebDriver driver) {
		this.driver=driver;
		}
	public void fileupload() throws IOException {
		
		ConfigReader config=new ConfigReader();
        String singleFile=config.getProperty("singleFile");
				
		WebElement singleUpload=driver.findElement(By.id("singleFileInput"));
		singleUpload.sendKeys(singleFile);
	}
	//Multiple File Upload
	public void multiplefileUpload() throws IOException {
		ConfigReader config=new ConfigReader();
	String file1=config.getProperty("file1");;
	String file2=config.getProperty("file2");
	
	WebElement multipleUpload=driver.findElement(By.id("multipleFilesInput"));
	multipleUpload.sendKeys(file1+"\n"+file2);
	
	//driver.quit();
	
}

}
