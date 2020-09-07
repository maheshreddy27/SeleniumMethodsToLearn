package frameWorksExamplesTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void method1() {
		Reporter.log("Method1 msg");
		
	}
	
	@Test(priority=0)
	public void method2() {
		Reporter.log("Method1 msg");
		
	}
	
	@Test(priority=-1)
	public void method3() {
		Reporter.log("Method1 msg");
		
	}


}
