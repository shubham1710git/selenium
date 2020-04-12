package com.xmatters.webui.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.retail.webui.utils.PageUtil;


public class FindWebServiceUsersPage extends PageUtil{
	Logger log = Logger.getLogger(LoginPage.class);

	public FindWebServiceUsersPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath = "//input[@value='All']")
	private WebElement allButton;
	
    @FindBy(xpath = "//*[@id='resultSize:input']")
    private WebElement resultsPerPageDropdown;
    
    @FindBy(xpath = "//input[@class='action button']")
    private WebElement findButton;
    
    @FindBy(xpath = "//input[@title='webservice.user.search.text.hint']")
    private WebElement userTextField;
    
    public void clickAllButton() {
    	log.info("Click on All button");
    	clickWebElementFluently(allButton);
    }
    
    public void enterUserId(String userID) {
    	log.info("Enter the userID you want to search");
    	clickAndEnterText(userTextField, userID);
    }
    
    public void clickFindButton() {
    	log.info("Click on Find button");
    	clickWebElementFluently(findButton);
    }
}
