package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Simple Alert
    public void clickSimpleAlert() {
        driver.findElement(By.id("alertBtn")).click();
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
 // Confirmation Alert
    public void clickConfirmationAlert() {
        driver.findElement(By.id("confirmBtn")).click();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }


    // Prompt Alert
    public void clickPromptAlert() {
        driver.findElement(By.id("promptBtn")).click();
    }

    public void enterPromptText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
}

