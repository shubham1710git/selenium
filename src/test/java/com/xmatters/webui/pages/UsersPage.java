package com.xmatters.webui.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.retail.webui.utils.PageUtil;
public class UsersPage extends PageUtil{
	
	Logger log = Logger.getLogger(LoginPage.class);

	   public UsersPage(WebDriver driver) {
		super(driver);
	}
	   @FindBy(xpath="//*[@id=\"USERS\"]")
	   private WebElement userLink;
	   
	   @FindBy(xpath="//*[@id=\"searchButton\"]")
	   private WebElement searchButton;
	   
	   @FindBy(xpath="//*[@id=\"usersISuperviseButton\"]")
	   private WebElement userISuperviseButton;
	   
	   @FindBy(xpath="//*[@id=\"allUsersButton\"]")
	   private WebElement allUsersButton;
	   
	   @FindBy(xpath="//*[@id=\"addUserButton\"]")
	   private WebElement addButton;
	   
	   @FindBy(xpath="//div[@id='exportMenuItem']")
	   private WebElement exportButton;
	   
	   @FindBy(xpath="//*[@id='ViewUsersByRole']")
	   private WebElement viewUserByRoleLink;
	   
	   @FindBy(xpath="//*[@id='UserPerformanceReportPlace']")
	   private WebElement userPerformanceLink;
	   
	   @FindBy(xpath="//*[@id='SearchWebServiceUsers']")
	   private WebElement searchWebServiceUsersLink;
	   
	   @FindBy(xpath="//*[@id='WebServiceUserDetails']")
	   private WebElement addWebServiceUser;
	   
	   @FindBy(xpath="//div[contains(text(),'1 1')]/ancestor::tr/td[1]")
	   private WebElement deleteUser;
	   
	   @FindBy(xpath="//div[contains(text(),'1 1')]")
	   private WebElement deletedUser;
	   
	   @FindBy(xpath="//div[@id='deleteButton']")
	   private WebElement deleteButton;
	   
	   @FindBy(xpath="//div[@id='okButtonId']")
	   private WebElement chickenDelete;
	   
	   @FindBy(xpath="//div[@id='cancelButtonId']")
	   private WebElement chickenCancelButton;
	   
	  
	  public void clickSearchButton() {
		  log.info("Click on Search button");
		  clickWebElementFluently(searchButton);
	  }
	  public void clickUserIsuperviseButton() {
		  log.info("Click on User I Supervise");
		  clickWebElementFluently(userISuperviseButton);
	  }
	  public void clickAllUserButtonbutton() {
		  log.info("Click on All User");
		  clickWebElementFluently(allUsersButton);
	  }
	  public void clickAddUserButton() {
		  log.info("Click on Add User button");
		  clickWebElementFluently(addButton);
	  }
	  public void clickExport() {
		  log.info("Click on Export button");
		  clickWebElementFluently(exportButton);
	  }
	  public void clickUserslink() {
		  log.info("Click on Users link to see the functionalities");
		  clickWebElementFluently(userLink);  
	  }
	  public void addWebServiceUser() {
		  log.info("Add web service user");
		  clickWebElementFluently(addWebServiceUser);
	  }
	  public void findWebServiceUser() {
		  log.info("Find web service users");
		  clickWebElementFluently(searchWebServiceUsersLink);
	  }
	  public void clickCheckbox() {
		  log.info("Click on checkbox beside the user to delete it");
		  clickWebElementFluently(deleteUser);
	  }
	  public void clickDeleteButton() {
		  log.info("Click on Delete button");
		  clickWebElementFluently(deleteButton);
	  }
	  public void clickChickenDeleteButton() {
		  log.info("Click on Chicken Delete button to confirm the deletion of the user");
		  clickWebElementFluently(chickenDelete);
	  }
	  public void clickChickenCancelButton() {
		  log.info("Click to Cancel the Delete process");
		  clickWebElementFluently(chickenCancelButton);
	  }
	  public boolean elementPresent() {
		  log.info("Check whether the element is present");
		  return isWebElementDisplayed(deletedUser);
	  }
}