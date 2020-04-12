package com.xmatters.webui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.retail.webui.utils.PageUtil;

public class Workflow extends PageUtil{

	public Workflow(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath="//*[@id='DEVELOPER']")
	private WebElement workflowsLink;
	
	@FindBy(xpath="//i[@class='icon-caret-down']")
	private WebElement createButton;
	
	@FindBy(xpath="//button[@class='button']")
	private WebElement editableButton;
	
	@FindBy(xpath="//button[@class='button button-selected']")
	private WebElement allButton;
	
	@FindBy(xpath="//i[@class='icon-import']")
	private WebElement importButton;
	
	@FindBy(xpath="//a[@id='FloodControlPlace']")
	private WebElement floodControlLink;
	
	@FindBy(xpath="//a[@id='manage-conference-bridges']")
	private WebElement conferenceBridgesLink;
	
	@FindBy(xpath="//a[@id='XAgentManagerPlace']")
	private WebElement agentsLink;
	
	public void clickFloodControlLink() {
		log.info("Click on Flood Control Link");
		clickWebElementFluently(floodControlLink);
	}
	public void clickConferenceBridgesLink() {
		log.info("Click on Conference Bridges Link");
		clickWebElementFluently(conferenceBridgesLink);
	}
	public void clickAgentsLink() {
		log.info("Click on Agents Link");
		clickWebElementFluently(agentsLink);
	}
	public void clickEditableButton() {
		log.info("Click On Editable button");
		clickWebElementFluently(editableButton);
	}
	public void clickAllButton() {
		log.info("Click on All button");
		clickWebElementFluently(allButton);
	}
	public void clickImportButton() {
		log.info("Click on Import button");
		clickWebElementFluently(importButton);
	}
	public void clickCreateButton() {
		log.info("Click on Create button");
		clickWebElementFluently(createButton);
	}
}
