package com.xmatters.webui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.retail.webui.utils.PageUtil;

public class AddGroupsPage extends PageUtil {
	public AddGroupsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='groupName']")
	private WebElement groupName;

	@FindBy(xpath = "//*[@id='descriptionLabel']")
	private WebElement descriptionField;

	@FindBy(xpath = "//input[@class='text hint']")
	private WebElement recipientSection;

	@FindBy(xpath = "//div[@title='Create Another Group']")
	private WebElement createAnotherGroup;

	@FindBy(xpath = "//div[@id='saveButton']")
	private WebElement saveButton;

	@FindBy(xpath = "//div[@id='cancelButton']")
	private WebElement cancelButton;

	@FindBy(xpath="//div/i[@class='icon-cancel window-close']")
	private WebElement crossIcon;
	
	// Methods:

	public void groupName(String grpName) {
		log.info("Enter the group name");
		clickAndEnterText(groupName, grpName);
	}

	// optional
	public void groupDescription(String grpDescr) {
		log.info("Enter the group description");
		clickAndEnterText(descriptionField, grpDescr);
	}

	public void enterMember(String grpmember) {
		log.info("Enter the name of the user");
		clickAndEnterText(recipientSection, grpmember);
	}
	public void enter() {
		log.info("Click to enter");
		pressEnterKey();
	}
	public void clickCreateAnotherGroup() {
		log.info("Click on Create Another Group checkbox");
		clickWebElementFluently(crossIcon);
	}
	public void clickAddButton() {
		log.info("Click on Add button to add the group");
		clickWebElementFluently(saveButton);
		}
	
	
}
