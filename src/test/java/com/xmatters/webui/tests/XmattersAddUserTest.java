package com.xmatters.webui.tests;
import java.lang.reflect.Method;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.lululemon.webui.interfaces.Constants;
import com.xmatters.webui.pages.AddUser;
import com.xmatters.webui.pages.LoginPage;
import com.xmatters.webui.pages.UsersPage;

public class XmattersAddUserTest extends LululemonBaseTest{
	String userName = Constants.USER_NAME;
	String password = Constants.PASSWORD;
	String firstname= Constants.FIRSTNAME;
	String lastname=Constants.LASTNAME;
	String userid=Constants.USERID;
	String userpassword=Constants.USER_PASSWORD;
	String userconfirmpassword=Constants.USER_CONFIRM_PASSWORD;
	
	private LoginPage loginPage;
	private UsersPage usersPage;
	private AddUser adduser;
	
	@BeforeMethod
	public void initialSetup(Method method) {
		loginPage=new LoginPage(getDriver());
		usersPage=new UsersPage(getDriver());
		adduser=new AddUser(getDriver());
		}
	
	@Test
	public void addUser() throws InterruptedException {
	loginPage.loginApplication(userName, password);
	usersPage.clickUserslink();
	usersPage.clickAddUserButton();
	//adduser.clickLdap();
	adduser.firstName(firstname);
	adduser.lastname(lastname);
	adduser.userId(userid);
	adduser.password(userpassword);
	adduser.confirmPassword(userconfirmpassword);
	adduser.forcepasswordReset();
    adduser.role();
    Thread.sleep(5000);
    adduser.enter();
    adduser.clickAddButton();
    Thread.sleep(5000);
	boolean b=adduser.elementPresent();
	Assert.assertTrue(b);
	}
}