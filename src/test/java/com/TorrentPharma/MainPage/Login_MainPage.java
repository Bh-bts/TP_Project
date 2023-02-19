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
import com.TorrentPharma.testcase.LoginPage;

/**
 * @author Bhavin
 *
 */

@Listeners(com.Torrent.listeners.ListenerClass.class)
public class Login_MainPage extends LoginPage {

	public Login_MainPage() throws IOException {

		driver = AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getUrl());
	}

	@Test(priority = 1)
	public void loginpage1() {

		LoginPage BlankIDPass = PageFactory.initElements(driver, LoginPage.class);
		BlankIDPass.BlankIDPass();
	}

	@Test(priority = 2)

	public void loginpage2() {

		LoginPage BlankPass = PageFactory.initElements(driver, LoginPage.class);
		BlankPass.BlankPass("100999");
	}

	@Test(priority = 3)

	public void loginpage3() {

		LoginPage BlankID = PageFactory.initElements(driver, LoginPage.class);
		BlankID.BlankID("Admin@1234");
	}

	@Test(priority = 4)
	public void loginpage4() {

		LoginPage EnterInvalidPass = PageFactory.initElements(driver, LoginPage.class);
		EnterInvalidPass.InvalidPass("100999", "Admin@1231");
	}

	@Test(priority = 5)
	public void loginpage5() {

		LoginPage EnterInvalidID = PageFactory.initElements(driver, LoginPage.class);
		EnterInvalidID.InvalidID("104844", "Admin@1234");
	}

	@Test(priority = 6)
	public void loginpage6() {

		LoginPage EnterInvalidID_Pass = PageFactory.initElements(driver, LoginPage.class);
		EnterInvalidID_Pass.InvalidID_Pass("109988", "Admin@122332");
	}

	@Test(priority = 7)

	public void loginpage7() {

		LoginPage EnterValidID_Pass = PageFactory.initElements(driver, LoginPage.class);
		EnterValidID_Pass.ValidID_Pass("100999", "Admin@1234");
	}

	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotCapture.captureScreenshot(driver, "Screenshot " + result.getName());
			System.out.println("Screenshot is generated" + '\n');
		}

	}

}
