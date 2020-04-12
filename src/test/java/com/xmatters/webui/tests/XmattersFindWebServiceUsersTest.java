package com.xmatters.webui.tests;
import java.lang.reflect.Method;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.lululemon.webui.interfaces.Constants;
import com.xmatters.webui.pages.FindWebServiceUsersPage;
import com.xmatters.webui.pages.LoginPage;
import com.xmatters.webui.pages.UsersPage;

public class XmattersFindWebServiceUsersTest extends LululemonBaseTest{	
	private UsersPage usersPage;
	private LoginPage loginPage;
	private FindWebServiceUsersPage findWebServiceUsers;
	
	String userName = Constants.USER_NAME;
	String password = Constants.PASSWORD;
	
	@BeforeMethod
	public void initialSetup(Method method) {
		usersPage = new UsersPage(getDriver());
		loginPage = new LoginPage(getDriver());
		findWebServiceUsers= new FindWebServiceUsersPage(getDriver());
			}
	
	@Test
	public void findWebServiceUsers() throws InterruptedException {
		loginPage.loginApplication(userName, password);
		usersPage.clickUserslink();
		usersPage.findWebServiceUser();
		findWebServiceUsers.clickAllButton();
		Thread.sleep(10000);		
	}
}
