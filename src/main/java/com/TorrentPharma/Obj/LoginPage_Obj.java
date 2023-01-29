/**
 * 
 */
package com.TorrentPharma.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utility.Browsers.AllBrowsers;

/**
 * @author Bhavin
 *
 */
public class LoginPage_Obj extends AllBrowsers{
	
	public @FindBy(xpath = "//input[@name='empNumber']") WebElement empNo_btn;
	public @FindBy(xpath = "//input[@name='password']") WebElement password_btn;
	public @FindBy(xpath = "//mat-label[text()='Employee No']/ancestor::div/div/mat-icon") WebElement empCancle_btn;
 	public @FindBy(xpath = "//mat-label[text()='Password']/ancestor::div/div/mat-icon") WebElement passCancle_btn;
	public @FindBy(xpath = "//mat-error[@aria-live='polite']") WebElement emp_error;
	public @FindBy(xpath = "//mat-error[@aria-live='polite']") WebElement pass_error;
	public @FindBy(xpath = "//button[@fxlayoutalign='center']") WebElement login_btn;
	public @FindBy(xpath = "//div/span[@fxlayoutalign='flex-start center']") WebElement popupMess_box;
	public @FindBy(xpath = "//div[3]/button[3]") WebElement profile_btn;
	public @FindBy(xpath = "//span[text()=' Signout ']/ancestor::button") WebElement signout_btn;
}
