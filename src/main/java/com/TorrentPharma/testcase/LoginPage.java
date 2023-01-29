/**
 * 
 */
package com.TorrentPharma.testcase;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.TorrentPharma.Obj.LoginPage_Obj;

/**
 * @author Bhavin
 *
 */
public class LoginPage extends LoginPage_Obj {
	 
	 public void BlankIDPass() {
		 
		 try {
			 empCancle_btn.click();
			 
			 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			 w.until(ExpectedConditions.visibilityOf(emp_error));
			 String Emp_error = emp_error.getText();
			 System.out.println(" 1) Validation message is appear when user leave as a blank the employee field : " + '\n' + ANSI_YELLOW + "-->" + Emp_error + ANSI_RESET + "\r\n" );
			 
			 passCancle_btn.click();
			 w.until(ExpectedConditions.visibilityOf(pass_error));
			 String Pass_error = pass_error.getText();
			 System.out.println(" 2) Validation message is appear when user leave as a blank the password field : " + '\n' + ANSI_YELLOW + "-->" + Pass_error + ANSI_RESET + "\r\n" );
			 
		 } catch (NoSuchElementException e) {
			 e.printStackTrace();
			 
		 }
		 
	 }
	 
	 public void BlankPass(String id) {
		 
		 try {
			 
			 Thread.sleep(2000);
			 driver.navigate().refresh();
			 
			 empNo_btn.clear();
			 empNo_btn.sendKeys(id);
			 passCancle_btn.click();
			 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			 w.until(ExpectedConditions.visibilityOf(pass_error));
			 String Pass_error = pass_error.getText();
			 System.out.println(" 3) Validation message is appear when user enter the valid employee id and leave as a blank the password field. : " + '\n' + ANSI_YELLOW + "-->" + Pass_error + ANSI_RESET + "\r\n");
			 
		 } catch (NoSuchElementException e) {
			 System.out.println(e.getMessage());
		 } catch (InterruptedException e) {
			 System.out.println(e.getMessage());
			 
		 }
		 
	 }
	 
	 public void BlankID(String password) {
		 
		 try {
			 
			 Thread.sleep(2000);
			 driver.navigate().refresh();
			 
			 empCancle_btn.click();
			 passCancle_btn.click();
			 password_btn.sendKeys(password);
			 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			 w.until(ExpectedConditions.visibilityOf(emp_error));
			 String Emp_error = emp_error.getText();
			 System.out.println(" 4) Validation message is appear when user enter the valid password and leave as blank the employee id field. : " + '\n' + ANSI_YELLOW + "-->" + Emp_error + ANSI_RESET + "\r\n");
			 
		 } catch (NoSuchElementException e) {
			 System.out.println(e.getMessage());
		 } catch (InterruptedException e) {
			 System.out.println(e.getMessage());
			 
		 }
		 
	 }

	public void InvalidPass(String id, String pass) {
		try {
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			empNo_btn.clear();
			empNo_btn.sendKeys(id);
			password_btn.clear();
			password_btn.sendKeys(pass);
			login_btn.click();

			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			w.until(ExpectedConditions.visibilityOf(popupMess_box));
			String Actual_message = popupMess_box.getText();
			System.out.println( " 5) Validation message is appear when user enter Invalid Password : "  + '\n' + ANSI_YELLOW + "-->" + Actual_message + ANSI_RESET + "\r\n" );

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			 
		}
		 

	}

	public void InvalidID(String id, String pass) {

		try {

			Thread.sleep(2000);
			driver.navigate().refresh();
			empNo_btn.clear();
			empNo_btn.sendKeys(id);
			password_btn.clear();
			password_btn.sendKeys(pass);
			login_btn.click();

			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			w.until(ExpectedConditions.visibilityOf(popupMess_box));
			String Actual_message = popupMess_box.getText();
			System.out.println( " 6) Validation message is appear when user enter Invalid ID : " + '\n' + ANSI_YELLOW + "-->" + Actual_message + ANSI_RESET + "\r\n" );

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			 
		}
		 

	}

	public void InvalidID_Pass(String id, String pass) {

		try {
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			empNo_btn.clear();
			empNo_btn.sendKeys(id);
			password_btn.clear();
			password_btn.sendKeys(pass);
			login_btn.click();

			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			w.until(ExpectedConditions.visibilityOf(popupMess_box));
			String Actual_message = popupMess_box.getText();
			System.out.println( " 7) Validation message is appear when user enter Invalid ID and Password: " + '\n' + ANSI_YELLOW + "-->" +  Actual_message + ANSI_RESET + "\r\n" );

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		 
	}

	public void ValidID_Pass(String id, String pass) {

		try {
			
			Thread.sleep(2000);
			driver.navigate().refresh();

			empNo_btn.clear();
			empNo_btn.sendKeys(id);
			password_btn.clear();
			password_btn.sendKeys(pass);
			login_btn.click();

			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
			w.until(ExpectedConditions.visibilityOf(popupMess_box));
			String Actual_message = popupMess_box.getText();
			System.out.println( " 8) Validation message is appear when user enter valid ID and password : " + '\n' + ANSI_YELLOW + "-->" +  Actual_message + ANSI_RESET + "\r\n" );
			
			Thread.sleep(2000);
			String Actual_title = driver.getTitle();
			String Expected_title = "Torrent-SFA";
			
			if (Actual_title.equals(Expected_title)) {
				System.out.println(ANSI_YELLOW_BACKGROUND + " 7) Page is matched" + ANSI_RESET + "\r\n" );

			} else {
				System.out.println(ANSI_YELLOW_BACKGROUND + " 7) Page is not matched!" + ANSI_RESET + "\r\n" );
			}

			String Actual_URL = driver.getCurrentUrl();
			String Expected_URL = "http://web.torrent.dev.drcsystems.com/dashboard";
			if (Actual_URL.equals(Expected_URL)) {
				System.out.println(ANSI_YELLOW_BACKGROUND + " 8) URL is matched" + ANSI_RESET + "\r\n" );
				
			} else {
				System.out.println(ANSI_YELLOW_BACKGROUND + " 8) URL is not matched" + ANSI_RESET + "\r\n" );
			}

			w.until(ExpectedConditions.visibilityOf(profile_btn));
			profile_btn.click();
			signout_btn.click();
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage()); 
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		 

	}

}
