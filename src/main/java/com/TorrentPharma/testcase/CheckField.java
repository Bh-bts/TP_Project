/**
 * 
 */
package com.TorrentPharma.testcase;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.TorrentPharma.Obj.CheckField_Obj;

/**
 * @author Bhavin
 *
 */


public class CheckField extends CheckField_Obj{ 
	
	public void verifyField(String id, String password) {
		
		try {
			
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
			empNo_btn.clear();
			empNo_btn.sendKeys(id);
			password_btn.clear();
			password_btn.sendKeys(password);
			login_btn.click();
			
			
			w.until(ExpectedConditions.visibilityOf(master_btn));
			
			master_btn.click();
			empMaster_btn.click();
			w.until(ExpectedConditions.visibilityOf(empMan_btn));
			empMan_btn.click();
			
			String header = headerTitle.getText();
			System.out.println("User is navigate to " + ANSI_YELLOW + header + ANSI_RESET + " page." + '\n' );
			
			w.until(ExpectedConditions.invisibilityOf(loader));
			w.until(ExpectedConditions.visibilityOf(filter_btn));
			edit_btn.click();
			
			w.until(ExpectedConditions.visibilityOf(Country_chckbx));
			
			if(Emptype_chckbx.getAttribute("aria-disabled").equalsIgnoreCase("false")) {
				
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Emptype_chckbx);
				System.out.println(" 1) " + ANSI_BLUE + EmptypeSPAN.getText() + ANSI_RESET +" Field is editable.");
				
			} else {
				System.out.println(" 1) " + ANSI_BLUE + EmptypeSPAN.getText() + ANSI_RESET +" Field is not editable.");
			}
			
			if(Country_chckbx.getAttribute("aria-disabled").equalsIgnoreCase("false")) {
				
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Country_chckbx);
				System.out.println(" 2) " + ANSI_BLUE + CountrySPAN.getText() + ANSI_RESET +" Field is editable.");
				
			} else {
				System.out.println(" 2) " + ANSI_BLUE + CountrySPAN.getText() + ANSI_RESET +" Field is not editable.");
			}
			
			if(Replace_btn.getAttribute("aria-disabled").equals("false")) {
				
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Replace_btn);
				System.out.println(" 3) " + ANSI_BLUE + ReplaceSPAN.getText() + ANSI_RESET +" Field is editable.");
				
			} else {
				System.out.println(" 3) " + ANSI_BLUE + ReplaceSPAN.getText() + ANSI_RESET +" Field is not editable.");
			}
				
			if(Unique_fld.getAttribute("aria-invalid").equalsIgnoreCase("true")) {
				
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Replace_btn);
				System.out.println(" 4) " + ANSI_BLUE + Unique_fld.getText() + ANSI_RESET +" Field is editable." + "\r\n");
				
			} else {
				System.out.println(" 4) " + ANSI_BLUE + UniqueSPAN.getText() + ANSI_RESET +" Field is not editable." + "\r\n");
			}
			
			
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
