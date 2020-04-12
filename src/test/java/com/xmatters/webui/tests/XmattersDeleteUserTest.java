package com.xmatters.webui.tests;
import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.lululemon.webui.interfaces.Constants;
import com.xmatters.webui.pages.LoginPage;
import com.xmatters.webui.pages.UsersPage;

public class XmattersDeleteUserTest extends LululemonBaseTest{
	String userName = Constants.USER_NAME;
	String password = Constants.PASSWORD;
	
	private LoginPage loginPage;
	private UsersPage usersPage;
	
	@BeforeMethod
	public void initialSetup(Method method) 
	{
		loginPage =new LoginPage(getDriver());
		usersPage=new UsersPage(getDriver());
		}
	
	@Test
	public void deleteUser() throws InterruptedException {
		loginPage.loginApplication(userName, password);
		usersPage.clickUserslink();
		usersPage.clickCheckbox();
		usersPage.clickDeleteButton();
		usersPage.clickChickenCancelButton();
		boolean b=usersPage.elementPresent();
		Assert.assertTrue(b);
		}
	}


