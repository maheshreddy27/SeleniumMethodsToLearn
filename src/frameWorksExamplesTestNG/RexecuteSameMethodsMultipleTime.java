package frameWorksExamplesTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RexecuteSameMethodsMultipleTime {
	
	@Test(invocationCount=3)
	public void sampleMethod1() {
		Reporter.log("sampleMethod1");
		
	}
	
	@Test(priority=-1)
	public void sampleMethod2() {
		Reporter.log("sampleMethod2");
	}
	
	@Test(priority=1)
	public void sampleMethod3() {
		Reporter.log("sampleMethod3");
	}

}
