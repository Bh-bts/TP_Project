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
public class EmpCount_Obj extends AllBrowsers {

	public @FindBy(xpath = "//input[@name='empNumber']") WebElement empNo_btn;
	public @FindBy(xpath = "//input[@name='password']") WebElement password_btn;
	public @FindBy(xpath = "//button[@fxlayoutalign='center']") WebElement login_btn;
	public @FindBy(xpath = "//div[@class='sk-ball-spin-clockwise-fade-rotating']") WebElement loader;
	
	public @FindBy(xpath = "//span[text()=' Master ']/ancestor::button") WebElement master_btn;
	public @FindBy(xpath = "//span[text()='Employee Master']/ancestor::button") WebElement empMaster_btn;
	public @FindBy(xpath = "//span[text()='Employee Management']/ancestor::button") WebElement empMan_btn;
	
	public @FindBy(xpath = "//label[text()='Filter / Search']/ancestor::mat-expansion-panel-header") WebElement filterBar_btn;
	public @FindBy(xpath = "//mat-label[text()='Designation']/ancestor::span/preceding-sibling::mat-select") WebElement designation_dwn;
	public @FindBy(xpath = "//span[text()=' MR ']/ancestor::mat-option") WebElement selectDesignation;
	public @FindBy(xpath = "//span[text()='Apply']/ancestor::button") WebElement apply_btn;
	
	public @FindBy(xpath = "//mat-select[@aria-label='Items per page:']") WebElement itemsPage;
	public @FindBy(xpath = "//span[text()=' 100 ']/ancestor::mat-option") WebElement itemValue;
	public @FindBy(xpath = "//button[@aria-label='Next page']") WebElement nextPage_btn;
	public @FindBy(xpath = "//table/tbody/tr[last()]/td[1]") WebElement empCount;
	
	

}
