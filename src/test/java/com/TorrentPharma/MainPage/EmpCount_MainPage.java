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
import com.TorrentPharma.testcase.EmpCount;

/**
 * @author Bhavin
 *
 */
@Listeners(com.Torrent.listeners.ListenerClass.class)
public class EmpCount_MainPage extends EmpCount {

	public EmpCount_MainPage() throws IOException {

		driver = AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getUrl());

	}

	@Test
	public void empList1() throws IOException, InterruptedException {

		EmpCount list1 = PageFactory.initElements(driver, EmpCount.class);
		list1.designationEmp_List(PropertiesClass.getEmpNo(), PropertiesClass.getPassword());

	}

	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotCapture.captureScreenshot(driver, "Screenshot " + result.getName());
			System.out.println("Screenshot is generated" + '\n');
		}

	}

}
