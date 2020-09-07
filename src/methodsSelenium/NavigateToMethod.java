package methodsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod {
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	void navigate(WebDriver driver) {
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		NavigateToMethod nm=new NavigateToMethod();
		nm.navigate(driver);

	}

}
