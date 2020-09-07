package frameWorksExamplesTestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionTestNGBasedOnGroups {
	
	@BeforeTest(alwaysRun=true)
	public void login() {
		Reporter.log("Login page", true);
		
	}
	
	@Test(priority=1, groups="user")
	public void addUser() {
		Reporter.log("Add user",true);
	}
	
	@Test(priority=2, groups="smoke")
	public void editUser() {
		Reporter.log("edit user", true);
	}

}
