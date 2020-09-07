package frameWorksExamplesTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGMethods {
	@Test
	public void print() {
		Reporter.log("Test1");
		//Print only in report
	}
	
	@Test
	public void printInBothConsoleAndReport() {
		Reporter.log("Test2", true);
		//Print in both console and report
	}
	
	@Test
	public void printOnlyInConsole() {
		Reporter.log("Test3", false);
		//Print only in report
	}

}
