package methodsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	public static void close(WebDriver driver) {
		driver.get("https://www.naukri.com/");
		driver.close();
		System.out.println("It close the current window or parent window");
		
	}
	
	public static void quit(WebDriver driver) {
		driver.get("https://www.naukri.com/");
		driver.quit();
		System.out.println("It close the all window's, child and parent window");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//CloseAndQuit.close(driver);
		CloseAndQuit.quit(driver);
		

	}

}
