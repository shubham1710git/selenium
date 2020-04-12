package com.xmatters.webui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.retail.webui.utils.PageUtil;
public class GroupsPage extends PageUtil{
	
	public GroupsPage(WebDriver driver) {
		super(driver);
			}
	
	@FindBy(xpath = "//*[@id='GROUPS']")
	private WebElement groupsLink;
	
	@FindBy(xpath = "//*[@id='GroupPerformanceReportPlace']")
	private WebElement groupsPerformance;
	
	@FindBy(xpath = "//*[@id='WhosOnDutyGroupSelectionPlace']")
	private WebElement whosOnCall;
	
	@FindBy(xpath = "//*[@id='HistoricalOnCallPlace']")
	private WebElement historicalOnCall;
	
	@FindBy(xpath = "//*[@id='FindDynamicTeams']")
	private WebElement findDynamicTeams;
	
	@FindBy(xpath = "//*[@id='DynamicTeams']")
	private WebElement dynamicTeams;
	
	@FindBy(xpath = "//*[@id='searchButton']")
	private WebElement searchButton;

	@FindBy(xpath = "//*[@id='groupsISuperviseButton']")
	private WebElement groupsISuperviseButton;
	
	@FindBy(xpath = "//*[@id='allGroupsButton']")
	private WebElement allGroupsButton;
	
	@FindBy(xpath = "//*[@id='addGroupButton']")
	private WebElement addGroupButton;
	
	@FindBy(xpath = "//*[@id='exportMenuItem']")
	private WebElement exportGroupsButton;
	
	@FindBy(xpath = "//*[@id='deleteButton']")
	private WebElement deleteGroupButton;
	
	public void clickGroupsLink() {
		log.info("Click on Groups link");
		clickWebElementFluently(groupsLink);
	}
	
	public void clickGroupPerformanceLink() {
		log.info("Click on this link to view the Group Performance link");
		clickWebElementFluently(groupsPerformance);
	}
	public void clickWhosCallLink() {
		log.info("Click on this link to view the Who's on Call Data");
		clickWebElementFluently(whosOnCall);
	}
	public void clickHistoricalOnCallLink() {
		log.info("Click on this link to view the Historical On Call Data");
		clickWebElementFluently(historicalOnCall);
	}
	public void clickFindDynamicTeamLink() {
		log.info("Click on this link to find the dynamic team");
		clickWebElementFluently(findDynamicTeams);
	}
	public void clickDynamicTeamsLink() {
		log.info("Click on this link to add and view the dynamic team");
		clickWebElementFluently(dynamicTeams);
	}
	public void clickDeleteButton() {
		log.info("Click on Delete button to delete the group");
		clickWebElementFluently(deleteGroupButton);
	}
	public void clickSearchButton() {
		log.info("Click on Search button");
		clickWebElementFluently(searchButton);
	}
	public void clickGroupsISuperviseButton() {
		log.info("Click on Groups I Supervise Button");
		clickWebElementFluently(groupsISuperviseButton);
	}
	public void clickAllGroupsButton() {
		log.info("Click on All Group Button");
		clickWebElementFluently(allGroupsButton);
	}
	public void clickAddGroupButton() {
		log.info("Click on Add Group button");
		clickWebElementFluently(addGroupButton);
	}
	public void clickExportButton() {
		log.info("Click on Export button");
		clickWebElementFluently(exportGroupsButton);
	}
		}


