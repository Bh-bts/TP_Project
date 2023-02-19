/**
 * 
 */
package com.TorrentPharma.MainPage;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Torrent.Browsers.AllBrowsers;
import com.Torrent.utils.PropertiesClass;
import com.Torrent.utils.ScreenshotCapture;
import com.TorrentPharma.testcase.CheckField;

/**
 * @author Bhavin
 *
 */

@Listeners(com.Torrent.listeners.ListenerClass.class)

public class CheckField_MainPage extends CheckField {

	public CheckField_MainPage() throws IOException {

		driver = AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getUrl());
	}

	@Test
	public void checkfield1() throws IOException {

		CheckField field1 = PageFactory.initElements(driver, CheckField.class);
		field1.verifyField(PropertiesClass.getEmpNo(), PropertiesClass.getPassword());

	}

	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotCapture.captureScreenshot(driver, "Screenshot "+result.getName());
			System.out.println("Screenshot is generated" + '\n');
		}

	}
}
