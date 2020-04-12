package com.xmatters.webui.tests;

import java.lang.reflect.Method;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.lululemon.webui.interfaces.Constants;
import com.xmatters.webui.pages.AddGroupsPage;
import com.xmatters.webui.pages.GroupsPage;
import com.xmatters.webui.pages.LoginPage;

public class XmattersAddGroupTest extends LululemonBaseTest{
	String userName = Constants.USER_NAME;
	String password = Constants.PASSWORD;
	String groupname = Constants.GROUP_NAME;
	String groupdescription = Constants.GROUP_DESCRIPTION;
	String groupmember = Constants.GROUP_MEMBER;
	
	private GroupsPage groupsPage;
	private AddGroupsPage addGroupsPage;
	private LoginPage loginPage;
	
	@BeforeMethod
	public void initialSetup(Method method) {
		loginPage=new LoginPage(getDriver());
		groupsPage=new GroupsPage(getDriver());
		addGroupsPage=new AddGroupsPage(getDriver());
		}
	
	@Test
	public void addGroup() throws InterruptedException {
		loginPage.loginApplication(userName, password);
		groupsPage.clickGroupsLink();
		groupsPage.clickAddGroupButton();
		addGroupsPage.groupName(groupname);
		addGroupsPage.groupDescription(groupdescription);
		addGroupsPage.enterMember(groupmember);
		Thread.sleep(5000);
		addGroupsPage.enter();
		addGroupsPage.clickAddButton();
	}

}
