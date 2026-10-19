package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.ConfigReader;

public class BasePage {
	
	public WebDriver driver;
	@BeforeTest
	public void setup() throws IOException {
		ConfigReader config=new ConfigReader();
		String browser=config.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		// Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
	}
	@AfterTest
		public void tearDown() {
	driver.quit();
	}

}
