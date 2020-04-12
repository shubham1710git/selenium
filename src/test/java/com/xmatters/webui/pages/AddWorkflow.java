package com.xmatters.webui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.retail.webui.utils.PageUtil;

public class AddWorkflow extends PageUtil{

	public AddWorkflow(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//i[@class='icon-caret-down']")
	private WebElement createButton;
	
	
	
	

}
