package com.xmatters.webui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.retail.webui.utils.PageUtil;

public class AddUser extends PageUtil{
	
	public AddUser(WebDriver driver) {
		super(driver);	
	}

	@FindBy(xpath="//*[@id='useLDAP']") //The ldap checkbox
	private WebElement ldapCheckbox;
	
	@FindBy(xpath="//*[@id='firstName']")//Firstname
	private WebElement firstName;
	
	@FindBy(xpath="//*[@id='lastName']")//Lastname
	private WebElement lastName;
	
	@FindBy(xpath="//*[@id='userId']")//UseriD, should be unique
	private WebElement userID;
	
	@FindBy(xpath="//*[@id='newPassword']") //password
	private WebElement newPassword;
	
	@FindBy(id="verifyNewPassword") //confirm password
	private WebElement confirmPassword;
	
	@FindBy(xpath="//span[contains(@class,'checkbox checkbox-checked float-left')]") 
	private WebElement forceResetPassword;
	
	@FindBy(xpath="//*[@id=\"roles\"]/div[2]/div[2]/ol/li[1]/input")
	private WebElement roles;
	
	@FindBy(xpath="//div[contains(@class,'button button-primary float-right')]")
	private WebElement addButton;
	
	 @FindBy(xpath="//div[contains(text(),'1 1')]")
	 private WebElement deletedUser;
	 
	 @FindBy(xpath="//div[text()='shubham goel']")
	 private WebElement newUser;
	
	// Methods:
	
	public void clickLdap() {
		log.info("Click on Ldap checkbox to uncheck it");
		clickWebElementFluently(ldapCheckbox);
	}
	public void firstName(String firstname) {
		log.info("Enter the first name");
		clickAndEnterText(firstName, firstname);
	}
	public void lastname(String lastname) {
		log.info("Enter the lastname");
		clickAndEnterText(lastName, lastname);
	}
	public void userId(String userid) {
		log.info("Enter the UserID");
		clickAndEnterText(userID, userid);
	}
	public void password(String pass) {
		log.info("Enter to set the password");
		clickAndEnterText(newPassword, pass);
	}
	public void confirmPassword(String confirmpass) {
		log.info("Enter to confirm the password");
		clickAndEnterText(confirmPassword,confirmpass);
	}
	public void forcepasswordReset() {
		log.info("Uncheck the Force Password Reset checkbox");
		clickWebElementFluently(forceResetPassword);
	}
	public void role() {
		log.info("Enter the role");
		clickAndEnterText(roles,"Full");
	}
	public void enter() {
		log.info("Used to Enter");
		pressEnterKey();
	}
	
	public void clickAddButton() {
		log.info("Click on Add Button");
		clickWebElementFluently(addButton);
	}
	public boolean elementPresent() {
		  log.info("Check whether the element is present");
		  return isWebElementDisplayed(newUser);
	  }
}