/**
 * 
 */
package com.TorrentPharma.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Torrent.Browsers.AllBrowsers;
/**
 * @author Bhavin
 *
 */
public class CheckField_Obj extends AllBrowsers{
	
	public @FindBy(xpath = "//input[@name='empNumber']") WebElement empNo_btn;
	public @FindBy(xpath = "//input[@name='password']") WebElement password_btn;
	public @FindBy(xpath = "//button[@fxlayoutalign='center']") WebElement login_btn;
	
	public @FindBy(xpath = "//span[text()=' Master ']/ancestor::button") WebElement master_btn;
	public @FindBy(xpath = "//span[text()='Employee Master']/ancestor::button") WebElement empMaster_btn;
	public @FindBy(xpath = "//span[text()='Employee Management']/ancestor::button") WebElement empMan_btn;
	
	public @FindBy(xpath = "//label[@class='header-title']") WebElement headerTitle;
	public @FindBy(xpath = "//mat-expansion-panel-header[@role='button']") WebElement filter_btn;
	public @FindBy(xpath = "//mat-icon[text()='edit ']") WebElement edit_btn;
	public @FindBy(xpath = "//mat-label[text()='Country']/ancestor::span/preceding-sibling::mat-select") WebElement Country_chckbx;
	public @FindBy(xpath = "//mat-select[@name='name']/following-sibling::span/label/mat-label[text()='Country']") WebElement CountrySPAN;
	public @FindBy(xpath = "//mat-label[text()='Employee Type']/ancestor::span/preceding-sibling::mat-select") WebElement Emptype_chckbx;
	public @FindBy(xpath = "//mat-label[text()='Employee Type']") WebElement EmptypeSPAN;
	public @FindBy(xpath = "//span[text()=' Replace ']/ancestor::a") WebElement Replace_btn;
	public @FindBy(xpath = "//span[text()=' Replace ']") WebElement ReplaceSPAN;
	public @FindBy(xpath = "//mat-label[text()='Unique Position Code']/ancestor::div/input") WebElement Unique_fld;
	public @FindBy(xpath = "//mat-label[text()='Unique Position Code']") WebElement UniqueSPAN;
	
	public @FindBy(xpath = "//div[@class='sk-ball-spin-clockwise-fade-rotating']") WebElement loader;
	
	
	
}
