package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BasePage;
import pages.FileUploadPage;

public class FileUploadPageTest extends BasePage {
	
	@Test
	public void file() throws InterruptedException, IOException {
		 FileUploadPage fp=new  FileUploadPage(driver);
		 fp.fileupload();
		 fp.multiplefileUpload();
	}

}
