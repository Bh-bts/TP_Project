/**
 * 
 */
package com.TorrentPharma.testcase;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TorrentPharma.Obj.EmpCount_Obj;

/**
 * @author Bhavin
 *
 */
public class EmpCount extends EmpCount_Obj {

	public void designationEmp_List(String id, String password) throws InterruptedException {

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

			empNo_btn.clear();
			empNo_btn.sendKeys(id);
			password_btn.clear();
			password_btn.sendKeys(password);
			login_btn.click();

			w.until(ExpectedConditions.visibilityOf(master_btn));
			master_btn.click();
			empMaster_btn.click();
			empMan_btn.click();

			w.until(ExpectedConditions.invisibilityOf(loader));
			w.until(ExpectedConditions.visibilityOf(filterBar_btn));
			filterBar_btn.click();

			w.until(ExpectedConditions.invisibilityOf(loader));
			w.until(ExpectedConditions.visibilityOf(designation_dwn));
			designation_dwn.click();

			w.until(ExpectedConditions.visibilityOf(selectDesignation));
			String designation = selectDesignation.getText();
			selectDesignation.click();

			w.until(ExpectedConditions.visibilityOf(apply_btn));
			apply_btn.click();

			js.executeScript("arguments[0].scrollIntoView(true);", itemsPage);
			w.until(ExpectedConditions.invisibilityOf(loader));
			itemsPage.click();
			
			w.until(ExpectedConditions.visibilityOf(itemValue));
			itemValue.click();

			w.until(ExpectedConditions.invisibilityOf(loader));
			js.executeScript("arguments[0].scrollIntoView(true);", nextPage_btn);

			while (true) {

				if (nextPage_btn.isEnabled()) {
					nextPage_btn.click();
					w.until(ExpectedConditions.invisibilityOf(loader));
				} else {
					w.until(ExpectedConditions.invisibilityOf(loader));
					System.out.println("Total " + designation + " employee is : " + empCount.getText() + '\n');
					break;
				}
			}

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}

	}

}
