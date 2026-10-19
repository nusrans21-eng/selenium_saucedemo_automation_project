package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.AlertsPage;

public class AlertsPageTest extends BasePage{
	
@Test
public void verifySimpleAlert() {

    AlertsPage page = new AlertsPage(driver);

    page.clickSimpleAlert();
    String text = page.getAlertText();
    System.out.println("Simple Alert: " + text);
    Assert.assertTrue(text.length() > 0);
    page.acceptAlert();
}
@Test
public void verifyConfirmationAlert() {

    AlertsPage page = new AlertsPage(driver);
    page.clickConfirmationAlert();
    String text = page.getAlertText();
    System.out.println("Confirmation Alert: " + text);
    Assert.assertTrue(text.length() > 0);
    page.acceptAlert();
}
@Test
public void verifyPromptAlert() {

    AlertsPage page = new AlertsPage(driver);
    page.clickPromptAlert();
    String text = page.getAlertText();
    System.out.println("Prompt Alert: " + text);
    Assert.assertTrue(text.length() > 0);
    page.enterPromptText("Nusra");
    page.acceptAlert();
}
}

