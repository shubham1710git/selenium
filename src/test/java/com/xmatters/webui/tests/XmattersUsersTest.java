package com.xmatters.webui.tests;
import com.lululemon.webui.interfaces.Constants;
import com.xmatters.webui.pages.LoginPage;
import com.xmatters.webui.pages.UsersPage;
import java.lang.reflect.Method;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XmattersUsersTest extends LululemonBaseTest {

	private LoginPage loginPage;
	private UsersPage usersPage;

	String userName = Constants.USER_NAME;
	String password = Constants.PASSWORD;

	@BeforeMethod
	public void initialSetup(Method method) {
		loginPage = new LoginPage(getDriver());
		usersPage = new UsersPage(getDriver());
	}

	@Test
	public void clickUsers() throws InterruptedException {
		loginPage.loginApplication(userName, password);
		Thread.sleep(5000);
		usersPage.clickUserslink();
		usersPage.clickSearchButton();
		Thread.sleep(5000);
		usersPage.clickUserIsuperviseButton();
		Thread.sleep(5000);
		usersPage.clickAllUserButtonbutton();
		Thread.sleep(5000);
		usersPage.clickExport();
		Thread.sleep(5000);
	}
}